package lang.compiler.visitor;

import lang.compiler.main.Compiler;
import lang.compiler.main.datatypes.Datatype;
import lang.compiler.main.datatypes.FunctionDatatype;
import lang.compiler.main.datatypes.PointerDatatype;
import lang.compiler.main.datatypes.UserDefinedDatatype;
import lang.compiler.main.functions.Function;
import lang.compiler.main.functions.FunctionArgument;
import lang.compiler.main.variables.Variable;
import lang.compiler.parser.LangBaseVisitor;
import lang.compiler.parser.LangParser;
import lang.compiler.parser.LangParser.*;

import java.util.ArrayList;

public class LangMasterVisitor extends LangBaseVisitor<Object> {

    @Override
    public Void visitProgram(ProgramContext ctx) {
        ctx.definition().forEach(def -> {
            if(def.functionDefinition() != null){
                visitGlobalFunctionDefinition(def.functionDefinition());
            } else if(def.varDeclList() != null){
                visitGlobalVarDeclList(def.varDeclList());
            } if(def.typeDefinition() != null){
                Datatype type = visitTypeDefinition(def.typeDefinition());
                Compiler.addDatatype(type.getName(), type);
            }
        });
        return null;
    }

    public Void visitGlobalFunctionDefinition(FunctionDefinitionContext ctx){
        Function fn = (Function)visit(ctx);
        Compiler.addFunction(fn.getName(), fn);
        return null;
    }

    public Void visitGlobalVarDeclList(VarDeclListContext ctx){
        ArrayList<Variable> vars = visitVariableDeclarationList(ctx);
        vars.forEach(var -> Compiler.addVariable(var.getName(), var));
        return null;
    }

    @Override
    public Function visitFunctionDefinition(FunctionDefinitionContext ctx) {
        String name = ctx.name.getText();

        ArrayList<FunctionArgument> arguments = new ArrayList<>();
        if(ctx.arguments() != null) {
            arguments = visitArguments(ctx.arguments());
        }

        if (Compiler.existsFunction(name)) {
            Function fn = Compiler.getFunction(name);
            ArrayList<FunctionArgument> fnArgs = fn.getArguments();

            // Compare argument list.
            if(fnArgs.size() == arguments.size()){
                String argsstr = "";
                boolean sameArgs = true;
                for(int i=0; i<arguments.size(); ++i){

                    String lhsArgName = arguments.get(i).getType().getName();
                    String rhsArgName = fnArgs.get(i).getType().getName();

                    if(!argsstr.isEmpty()) argsstr += ", ";
                    argsstr += lhsArgName;

                    if(!lhsArgName.equals(rhsArgName)){
                        sameArgs = false;
                        break;
                    }
                }

                // Functions share argument list.
                if(sameArgs){
                    Compiler.complain(
                        Compiler.ComplaintType.Error,
                        ctx,
                        "A function named " + name + " accepting arguments (" + argsstr + ") already exists.");
                    return null;
                }
            }
        }

        ArrayList<Datatype> returnTypes = new ArrayList<>();
        if(ctx.returnTypes() != null){
            returnTypes = visitReturnTypes(ctx.returnTypes());
        }

        String body = "";
        if(ctx.statement() != null) {
            ctx.statement().forEach(stmt -> body.concat(stmt.getText()));
        }

        return new Function(name, arguments, returnTypes, body);
    }

    @Override
    public ArrayList<FunctionArgument> visitArguments(ArgumentsContext ctx) {
        ArrayList<FunctionArgument> arguments = new ArrayList<>(ctx.types.size());
        for(int i=0; i<ctx.types.size(); ++i){
            arguments.add(new FunctionArgument((Datatype)visit(ctx.types.get(i)), ctx.names.get(i).getText()));
        }
        return arguments;
    }

    @Override
    public ArrayList<Datatype> visitReturnTypes(ReturnTypesContext ctx) {
        ArrayList<Datatype> types = new ArrayList<>();
        ctx.types.forEach(type -> types.add((Datatype)visit(type)));
        return types;
    }

    public ArrayList<Variable> visitVariableDeclarationList(VarDeclListContext ctx){
        ArrayList<Variable> vars = new ArrayList<>();

        if(ctx instanceof VDLExplicitTypeContext){
            ((VDLExplicitTypeContext)ctx).decls.forEach(decl -> {
                Variable var = visitExplTypeVarDecl(decl);
                var = new Variable(
                    (Datatype)visit(((VDLExplicitTypeContext)ctx).datatype()),
                    var.getName(),
                    var.isInitialized(),
                    var.isConstant());
                vars.add(var);
            });
        } else if(ctx instanceof VDLConstantContext){
            ((VDLConstantContext)ctx).decls.forEach(decl -> {
                Variable var = visitConstVarDecl(decl);
                var = new Variable(
                    (Datatype)visit(((VDLConstantContext)ctx).datatype()),
                    var.getName(),
                    var.isInitialized(),
                    var.isConstant());
                vars.add(var);
            });
        }
        return vars;
    }

    @Override
    public Variable visitConstVarDecl(ConstVarDeclContext ctx) {
        String name = ctx.name.getText();
        return new Variable(null, name, true, true);
    }

    @Override
    public Variable visitExplTypeVarDecl(ExplTypeVarDeclContext ctx){
        String name = ctx.name.getText();
        VarDeclListContext parent = (VarDeclListContext)ctx.getParent();
        boolean init = ctx.rvalue() != null;
        return new Variable(null, name, init, false);
    }

    @Override
    public Datatype visitTypeDefinition(TypeDefinitionContext ctx) {
        String name = ctx.name.getText();
        ArrayList<Variable> members = new ArrayList<>();

        ctx.varDeclList().forEach(vardecllist -> {
            members.addAll(visitVariableDeclarationList(vardecllist));
        });

        return new UserDefinedDatatype(name, members);
    }

    @Override
    public Datatype visitDTUserDefined(DTUserDefinedContext ctx) {
        visitChildren(ctx);
        String name = ctx.IDENT().getText();

        if(!Compiler.existsDatatype(name)){
            Compiler.complain(
                Compiler.ComplaintType.Error,
                ctx,
                "No user-defined type named " + name + " exists.");
            return null;
        }

        return Compiler.getDatatype(name);
    }

    @Override
    public Datatype visitDTPointer(DTPointerContext ctx) {
        String name = ctx.getText();
        Datatype base = (Datatype)visit(ctx.datatype());
        int indirection = ctx.indir.getText().length();

        return new PointerDatatype(name, base, indirection);
    }

    @Override
    public Datatype visitDTFunction(DTFunctionContext ctx) {
        String name = ctx.getText();
        ArrayList<Datatype> argumentTypes = new ArrayList<>();
        ArrayList<Datatype> returnTypes = visitReturnTypes(ctx.returnTypes());

        if(ctx.argtypes != null){
            ctx.argtypes.forEach(type -> argumentTypes.add((Datatype)visit(type)));
        }

        return new FunctionDatatype(name, argumentTypes, returnTypes);
    }

    @Override
    public Datatype visitDTPrimitive(DTPrimitiveContext ctx) {
        return Compiler.getDatatype(ctx.getText());
    }
}
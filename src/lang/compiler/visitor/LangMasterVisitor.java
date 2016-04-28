package lang.compiler.visitor;

import lang.compiler.main.Compiler;
import lang.compiler.main.datatypes.Datatype;
import lang.compiler.main.datatypes.PointerDatatype;
import lang.compiler.main.variables.Variable;
import lang.compiler.parser.LangBaseVisitor;
import lang.compiler.parser.LangParser.*;

import java.util.Vector;

public class LangMasterVisitor extends LangBaseVisitor<Boolean> {
    @Override
    public Boolean visitDFunction(DFunctionContext ctx) {
        String name = ctx.functionDefinition().name.getText();
        if (Compiler.existsFunction(name)) {
            Compiler.complain(
                Compiler.ComplaintType.Error,
                ctx,
                "Function " + name + " already exists.");
            return false;
        }
        return super.visitDFunction(ctx);
    }

    @Override
    public Boolean visitDTUserDefined(DTUserDefinedContext ctx) {
        Datatype datatype;

        if(!Compiler.existsDatatype(ctx.IDENT().getText())){
            Compiler.complain(
                Compiler.ComplaintType.Error,
                ctx,
                "Datatype " + ctx.IDENT().getText() + " is unknown.");
            return false;
        }
        return super.visitDTUserDefined(ctx);
    }

    @Override
    public Boolean visitDTPointer(DTPointerContext ctx) {
        Datatype datatype;

        if(!Compiler.existsDatatype(ctx.basetype.getText())) {
            Compiler.complain(
                Compiler.ComplaintType.Error,
                ctx,
                "Pointer base type " + ctx.basetype.getText() + " is unknown.");
            return false;
        }
        return super.visitDTPointer(ctx);
    }

    @Override
    public Boolean visitConstVarDecl(ConstVarDeclContext ctx) {
        System.out.println("Declaration of constant " + ctx.name.getText());
        return super.visitConstVarDecl(ctx);
    }

    @Override
    public Boolean visitImplTypeVarDecl(ImplTypeVarDeclContext ctx){
        System.out.println("Declaration of impl type var " + ctx.name.getText());
        return super.visitImplTypeVarDecl(ctx);
    }

    @Override
    public Boolean visitExplTypeVarDecl(ExplTypeVarDeclContext ctx){
        System.out.println("Declaration of expl type var " + ctx.name.getText());
        return super.visitExplTypeVarDecl(ctx);
    }
}
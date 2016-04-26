package lang.compiler.visitor;

import lang.compiler.parser.LangBaseVisitor;

import java.util.TreeMap;
import java.util.Vector;
import java.util.function.Predicate;

import static lang.compiler.parser.LangParser.*;

public class LangMasterVisitor extends LangBaseVisitor<Void> {

    enum DatatypeFormat {
        Primitive,
        Userdef,
        Funcptr,
        Pointer
    }

    class Datatype {
        public DatatypeFormat format;
        public String name;
        public Datatype ptrBaseType;
        public Vector<Datatype> argumentTypes;
        public Vector<Datatype> returnTypes;

        public Datatype(DatatypeContext ctx) {
            name = ctx.getText();

            // Primitive.
            if(ctx.primitive() != null){
                format = DatatypeFormat.Primitive;
            }
            // User defined.
            else if(ctx.IDENT() != null) {
                format = DatatypeFormat.Userdef;
            }
            // Pointer.
            else if (ctx.basetype != null){
                format = DatatypeFormat.Pointer;
                ptrBaseType = new Datatype(ctx.basetype);
            }
            // Function pointer.
            else {
                format = DatatypeFormat.Funcptr;

                argumentTypes = new Vector<>();
                AnonArgumentsContext argsContext = ctx.args;
                while(argsContext != null){
                    argumentTypes.add(new Datatype(argsContext.type));
                    argsContext = argsContext.next;
                }

                returnTypes = new Vector<>();
                ReturnTypesContext retContext = ctx.rvs;
                while(retContext != null){
                    returnTypes.add(new Datatype(retContext.type));
                    retContext = retContext.next;
                }
            }

        }
    }

    class Argument {
        public Datatype type;
        public String name;

        public Argument(ArgumentsContext ctx) {
            type = new Datatype(ctx.type);
            name = ctx.name.getText();
        }
    }

    class Variable {
        public Datatype type;
        public String name;
        public boolean constant;

        public Variable(VariableDeclarationContext ctx) {

            // Read datatype.
            if(ctx.type != null){
                type = new Datatype(ctx.type);
            } else {
                System.out.println("TODO: No variable type specified.");
            }

            name = ctx.name.getText();
            constant = (ctx.isconst != null);
        }
    }

    class Function {
        public String name;
        public Vector<Argument> arguments;
        public Vector<Datatype> returns;
        public Function(FunctionDefinitionContext ctx){

            name = ctx.name.getText();

            // Collect arguments.
            arguments = new Vector<>();
            ArgumentsContext argIter = ctx.args;
            while(argIter != null){
                arguments.add(new Argument(argIter));
                argIter = argIter.next;
            }

            // Collect return types.
            returns = new Vector<>();
            ReturnTypesContext retIter = ctx.rvs;
            while(retIter != null){
                returns.add(new Datatype(retIter.type));
                retIter = retIter.next;
            }
        }
    }

    private <T> boolean vectorContains(Vector<T> vector, Predicate<T> predicate){
        for(T item:vector){
            if(predicate.test(item)){
                return true;
            }
        }
        return false;
    }

    // Parsed type names.
    private Vector<String> types = new Vector<String>();

    // Parsed variables.
    private TreeMap<String, Variable> variables = new TreeMap<>();

    // Parsed functions.
    private TreeMap<String, Function> functions = new TreeMap<>();

    public LangMasterVisitor() {
        types.add("void");
        types.add("bool");
        types.add("s8");
        types.add("s16");
        types.add("s32");
        types.add("s64");
        types.add("u8");
        types.add("u16");
        types.add("u32");
        types.add("u64");
        types.add("f32");
        types.add("f64");
    }

    @Override
    public Void visitVariableDeclaration(VariableDeclarationContext ctx) {

        if(variables.containsKey(ctx.name.getText())) {
            System.err.println("A variable named '" + ctx.name.getText() + "' was already declared.");
        } else {
            Variable var = new Variable(ctx);
            variables.put(var.name, var);

            System.out.println("Declared variable: " + var.name);
            System.out.println("Type: " + (var.type == null ? "implicit" : var.type.name));
            System.out.println("Const: " + var.constant);
        }

        return null;
    }

    @Override
    public Void visitFunctionDefinition(FunctionDefinitionContext ctx) {

        if(functions.containsKey(ctx.name.getText())) {
            System.err.println("A function named '" + ctx.name.getText() + "' was already defined.");
        } else {
            Function fn = new Function(ctx);

            System.out.println("Defined function: " + fn.name);

            System.out.println("Arguments: " + fn.arguments.size());
            fn.arguments.forEach(arg ->
                    System.out.println("\t\tType: " + arg.type.name + " Name: " + arg.name)
            );

            System.out.println("Returns: " + fn.returns.size());
            fn.returns.forEach(ret ->
                    System.out.println("\t\tType: " + ret.name)
            );

            System.out.println("Body:");
            System.out.println(ctx.body.getText());

            functions.put(fn.name, fn);
        }

        return null;
    }
}
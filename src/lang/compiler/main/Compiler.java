package lang.compiler.main;

import lang.compiler.main.datatypes.*;
import lang.compiler.main.functions.Function;
import lang.compiler.main.functions.FunctionArgument;
import lang.compiler.main.variables.Variable;
import lang.compiler.parser.LangLexer;
import lang.compiler.parser.LangParser;
import lang.compiler.visitor.LangMasterVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.MultiMap;

import java.util.Map;
import java.util.TreeMap;

import static lang.compiler.visitor.LangMasterVisitor.*;
import static lang.compiler.parser.LangParser.*;


public class Compiler {

    // Compiler complaint types.
    public enum ComplaintType {
        Warning,
        Error
    }

    // Compiler complaint information.
    public static class Complaint {
        private ComplaintType type;
        private ParserRuleContext context;
        private int line, column;
        private String message;

        public Complaint(ComplaintType type, ParserRuleContext context, String message) {
            this.type = type;
            this.context = context;
            this.line = context.start.getLine();
            this.column = context.start.getCharPositionInLine();
            this.message = message;
        }

        public ComplaintType getType() {
            return type;
        }

        public ParserRuleContext getContext() {
            return context;
        }

        public int getLine() {
            return line;
        }

        public int getColumn() {
            return column;
        }

        public String getMessage() {
            return message;
        }

        public void print() {
            System.err.println(
                type
                    + " (line "
                    + context.start.getLine()
                    + ", pos "
                    + context.start.getCharPositionInLine()
                    + ") : "
                    + message);
        }
    }

    // List of complaints.
    private static final MultiMap<ComplaintType, Complaint> complaints = new MultiMap<>();

    public static void complain(ComplaintType type, ParserRuleContext context, String message) {
        Complaint complaint = new Complaint(type, context, message);
        complaints.map(type, complaint);
        complaint.print();
    }

    // -----

    // Existing datatypes.
    private static final TreeMap<String, Datatype> datatypes = new TreeMap<>();

    public static boolean existsDatatype(String name) {
        return datatypes.containsKey(name);
    }

    public static Datatype getDatatype(String name){
        return datatypes.get(name);
    }

    public static void addDatatype(String name, Datatype datatype){
       datatypes.put(name, datatype);
    }

    public static boolean isPointerDatatype(DatatypeContext context) {
        return context instanceof DTPointerContext;
    }

    // -----

    // Existing variables.
    private static final TreeMap<String, Variable> variables = new TreeMap<>();

    public static boolean existsVariable(String name){
        return variables.containsKey(name);
    }

    public static Variable getVariable(String name){
        return variables.get(name);
    }

    public static void addVariable(String name, Variable variable){
        variables.put(name, variable);
    }

    // Parsed functions.
    private static final TreeMap<String, Function> functions = new TreeMap<>();

    public static boolean existsFunction(String name){
        return functions.containsKey(name);
    }

    public static Function getFunction(String name){
        return functions.get(name);
    }

    public static void addFunction(String name, Function function){
        functions.put(name, function);
    }

    public static <E, F> void printMapKeys(Map<E, F> map){
        for(Object key : map.keySet()){
            System.out.println(key.toString());
        }
    }

    public static void main(String[] args){
        try {
            LangLexer lexer = new LangLexer(new ANTLRFileStream("test/testfile.lang"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LangParser parser = new LangParser(tokens);

            Compiler.addDatatype("void", new PrimitiveDatatype("void"));
            Compiler.addDatatype("bool", new PrimitiveDatatype("bool"));
            Compiler.addDatatype("s8",   new PrimitiveDatatype("s8"));
            Compiler.addDatatype("s16",  new PrimitiveDatatype("s16"));
            Compiler.addDatatype("s32",  new PrimitiveDatatype("s32"));
            Compiler.addDatatype("s64",  new PrimitiveDatatype("s64"));
            Compiler.addDatatype("u8",   new PrimitiveDatatype("u8"));
            Compiler.addDatatype("u16",  new PrimitiveDatatype("u16"));
            Compiler.addDatatype("u32",  new PrimitiveDatatype("u32"));
            Compiler.addDatatype("u64",  new PrimitiveDatatype("u64"));
            Compiler.addDatatype("f32",  new PrimitiveDatatype("f32"));
            Compiler.addDatatype("f64",  new PrimitiveDatatype("f64"));

            LangMasterVisitor visitor = new LangMasterVisitor();
            visitor.visitProgram(parser.program());

            if(complaints.containsKey(ComplaintType.Error)){
                System.err.println("There were errors. Compilation failed.");
            } else {
                System.out.println("Compilation successful!");
                System.out.println();

                // Print datatypes.
                System.out.println("Datatypes: " + datatypes.size());
                printMapKeys(datatypes);
                System.out.println();

                // Print variables.
                System.out.println("Variables: " + variables.size());
                printMapKeys(variables);
                System.out.println();

                // Print functions.
                System.out.println("Functions: " + functions.size());
                printMapKeys(functions);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

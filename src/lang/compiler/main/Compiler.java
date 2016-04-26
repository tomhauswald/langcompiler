package lang.compiler.main;

import lang.compiler.parser.LangLexer;
import lang.compiler.visitor.LangMasterVisitor;
import lang.compiler.parser.LangParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compiler {

    public static void main(String[] args){
        try {
            LangLexer lexer = new LangLexer(new ANTLRFileStream("test/testfile.lang"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LangParser parser = new LangParser(tokens);
            LangMasterVisitor visitor = new LangMasterVisitor();
            visitor.visitProgram(parser.program());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

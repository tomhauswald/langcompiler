package lang.compiler.main.functions;

import lang.compiler.main.Compiler;
import lang.compiler.main.datatypes.Datatype;
import lang.compiler.parser.LangParser.*;

import java.util.Vector;

/**
 * Created by Tom on 27.04.2016.
 */
public class Function {
    private String name;
    private Vector<FunctionArgument>   arguments;
    private Vector<Datatype> returnTypes;

    public Function(String name, Vector<FunctionArgument> arguments, Vector<Datatype> returnTypes){
        this.name = name;
        this.arguments= arguments;
        this.returnTypes = returnTypes;
    }
}


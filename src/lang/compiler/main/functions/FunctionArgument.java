package lang.compiler.main.functions;

import lang.compiler.main.datatypes.Datatype;

/**
 * Created by Tom on 27.04.2016.
 */
public class FunctionArgument {
    private Datatype type;
    private String name;

    public FunctionArgument(Datatype type, String name) {
        this.type = type;
        this.name = name;
    }

    public Datatype getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}

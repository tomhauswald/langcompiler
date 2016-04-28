package lang.compiler.main.variables;

import lang.compiler.main.datatypes.Datatype;
import lang.compiler.parser.LangParser.*;

/**
 * Created by Tom on 27.04.2016.
 */
public class Variable {
    private Datatype type;
    private String name;
    private boolean initialized;
    private boolean constant;

    public Variable(Datatype type, String name, boolean initialized, boolean constant) {
        this.type = type;
        this.name = name;
        this.initialized = initialized;
        this.constant = constant;
    }

    public Datatype getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public boolean isConstant() {
        return constant;
    }

    public void initialize() {
        initialized = true;
    }
}

package lang.compiler.main.datatypes;

import lang.compiler.main.Compiler;
import lang.compiler.parser.LangParser.*;

/**
 * Created by Tom on 27.04.2016.
 */
public class PointerDatatype extends Datatype {
    private Datatype baseType;
    private int indirections;

    public PointerDatatype(String name, Datatype baseType, int indirections) {
        super(DatatypeFormat.Pointer, name);
        this.baseType = baseType;
        this.indirections = indirections;
    }

    public Datatype getBaseType() {
        return baseType;
    }

    public int getIndirections() {
        return indirections;
    }

    @Override
    public int getSize() {
        return 8;
    }
}
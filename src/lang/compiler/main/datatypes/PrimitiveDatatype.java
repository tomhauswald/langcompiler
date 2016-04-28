package lang.compiler.main.datatypes;

import lang.compiler.parser.LangParser;

public class PrimitiveDatatype extends Datatype {
        public PrimitiveDatatype(LangParser.DTPrimitiveContext primitive) {
            super(DatatypeFormat.Primitive, primitive.getText());
        }
    }

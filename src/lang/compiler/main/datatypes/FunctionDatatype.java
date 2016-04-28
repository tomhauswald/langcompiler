package lang.compiler.main.datatypes;

import lang.compiler.parser.LangParser;

import java.util.Vector;

public class FunctionDatatype extends Datatype {
        private Vector<Datatype> argumentTypes;
        private Vector<Datatype> returnTypes;

        public FunctionDatatype(LangParser.DTFunctionContext function) {
            super(DatatypeFormat.Function, function.getText());
        }

        public Vector<Datatype> getArgumentTypes() {
            return argumentTypes;
        }

        public Vector<Datatype> getReturnTypes() {
            return returnTypes;
        }
    }

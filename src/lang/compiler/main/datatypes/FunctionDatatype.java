package lang.compiler.main.datatypes;

import lang.compiler.parser.LangParser.*;

import java.util.Vector;

public class FunctionDatatype extends Datatype {
        private Vector<Datatype> argumentTypes;
        private Vector<Datatype> returnTypes;

        public FunctionDatatype(String name, Vector<Datatype> argumentTypes, Vector<Datatype> returnTypes) {
            super(DatatypeFormat.Function, name);
            this.argumentTypes = argumentTypes;
            this.returnTypes = returnTypes;
        }

        public Vector<Datatype> getArgumentTypes() {
            return argumentTypes;
        }

        public Vector<Datatype> getReturnTypes() {
            return returnTypes;
        }
    }

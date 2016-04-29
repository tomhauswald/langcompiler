package lang.compiler.main.datatypes;

import java.util.ArrayList;

public class FunctionDatatype extends Datatype {
        private ArrayList<Datatype> argumentTypes;
        private ArrayList<Datatype> returnTypes;

        public FunctionDatatype(String name, ArrayList<Datatype> argumentTypes, ArrayList<Datatype> returnTypes) {
            super(DatatypeFormat.Function, name);
            this.argumentTypes = argumentTypes;
            this.returnTypes = returnTypes;
        }

        public ArrayList<Datatype> getArgumentTypes() {
            return argumentTypes;
        }

        public ArrayList<Datatype> getReturnTypes() {
            return returnTypes;
        }

    @Override
    public int getSize() {
        return 8;
    }
}

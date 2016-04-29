package lang.compiler.main.datatypes;

import lang.compiler.main.variables.Variable;

import java.util.ArrayList;

public class UserDefinedDatatype extends Datatype {
    private ArrayList<Variable> members;

    public UserDefinedDatatype(String name, ArrayList<Variable> members) {
        super(DatatypeFormat.UserDefined, name);
        this.members = members;

        int size = 0;
        for (int i = 0; i < members.size(); ++i){
            System.out.println(members);
            System.out.println(members.get(i));
            System.out.println(members.get(i).getType());
            System.out.println(members.get(i).getType().getSize());
            size += members.get(i).getType().getSize();
        }

        setSize(size);
    }

    public ArrayList<Variable> getMembers() {
        return members;
    }
}

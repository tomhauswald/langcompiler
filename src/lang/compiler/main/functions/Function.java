package lang.compiler.main.functions;

import lang.compiler.main.datatypes.Datatype;

import java.util.ArrayList;

/**
 * Created by Tom on 27.04.2016.
 */
public class Function {
    private String name;
    private ArrayList<FunctionArgument> arguments;
    private ArrayList<Datatype> returnTypes;
    private String body;

    public Function(String name, ArrayList<FunctionArgument> arguments, ArrayList<Datatype> returnTypes, String body) {
        this.name = name;
        this.arguments = arguments;
        this.returnTypes = returnTypes;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public ArrayList<FunctionArgument> getArguments() {
        return arguments;
    }

    public ArrayList<Datatype> getReturnTypes() {
        return returnTypes;
    }

    public String getBody(){
        return body;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Arguments: " + arguments.size());
        for(FunctionArgument arg : arguments){
            System.out.println("\t" + arg.getType().getName() + " " + arg.getName());
        }
        System.out.println("Return Types: " + returnTypes.size());
        for(Datatype ret : returnTypes){
            System.out.println("\t" + ret.getName());
        }
        System.out.println("Body Size: " + body.length());
    }
}


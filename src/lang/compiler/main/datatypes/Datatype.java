package lang.compiler.main.datatypes;

/**
 * Created by Tom on 27.04.2016.
 */
public class Datatype {
    private DatatypeFormat format;
    private String name;

    public Datatype(DatatypeFormat format, String name) {
        this.format = format;
        this.name = name;
    }

    public DatatypeFormat getFormat() {
        return format;
    }

    public String getName() {
        return name;
    }
}

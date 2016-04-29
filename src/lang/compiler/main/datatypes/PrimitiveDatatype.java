package lang.compiler.main.datatypes;

public class PrimitiveDatatype extends Datatype {
    public PrimitiveDatatype(String name) {
        super(DatatypeFormat.Primitive, name);

        switch (name) {
            case "void":
                setSize(0);
                break;
            case "bool":
            case "u8":
            case "s8":
                setSize(1);
                break;
            case "u16":
            case "s16":
                setSize(2);
                break;
            case "u32":
            case "s32":
            case "f32":
                setSize(4);
                break;
            case "u64":
            case "s64":
            case "f64":
                setSize(8);
                break;
        }
    }
}

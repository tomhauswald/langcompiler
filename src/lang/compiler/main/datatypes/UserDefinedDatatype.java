package lang.compiler.main.datatypes;

import lang.compiler.parser.LangParser;

public class UserDefinedDatatype extends Datatype {
        public UserDefinedDatatype(LangParser.DTUserDefinedContext userdef) {
            super(DatatypeFormat.UserDefined, userdef.getText());
        }
    }

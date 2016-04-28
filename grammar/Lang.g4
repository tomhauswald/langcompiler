grammar Lang;

// *** Parser rules start here. *** //

program
	: definition*
    ;

// Definitions.
definition
    // Function definition.
    : functionDefinition
    #DFunction

    // Variable declaration.
    | variableDeclaration
    #DVariable
    ;

// Statements.
statement
    // RValue statement.
    : rvalue ';' 
    #SRValue

    // Block statement.
    | '{' statement* '}' 
    #SBlock

    // Variable declaration statement.
    | variableDeclaration
    #SVarDecl

    // Return statement.
    | 'return' returnValues ';'
    #SReturn

    // If statement.
    | 'if' '(' condition=rvalue ')' trueBody=statement ('else' falseBody=statement)?
    #SIfElse

    // For loop statement.
    | 'for' '(' decl=variableDeclaration condition=rvalue ';' update=rvalue ')' body=statement
    #SForLoop

    // While loop statement.
    | 'while' '(' condition=rvalue ')' body=statement
    #SWhileLoop

    // Do while loop statement.
    | 'do' body=statement 'while' '(' condition=rvalue ')' ';'
    #SDoWhileLoop

    // Collection for loop statement.
    | 'for' '(' collection=rvalue '=:' var=IDENT ')' body=statement
    #SCollectionLoop

    // Interval for loop statement.
    | 'for' '(' open=('('|'[') min=SINT '..' max=SINT close=(')'|']') '=:' var=IDENT ')' body=statement
    #SIntervalLoop
    ;

// Return values comma-separated.
returnValues
    : value=rvalue (| ',' next=returnValues)
    ;

// Function definition.
functionDefinition
    : '(' '(' args=arguments? ')' '=>' '(' ret=returnTypes? ')' ')' name=IDENT '=' '{' body=statement* '}' ';'
    ;

// Function arguments comma-separated.
arguments
    : type=datatype name=IDENT (| ',' next=arguments)
    ;

// Return types comma-separated.
returnTypes
    : type=datatype (| ',' next=returnTypes)
    ;

// Variable declarations.
variableDeclaration
    // Explicitly typed.
    : datatype explTypeVarDecl ';'

    // Implicitly typed.
    | implTypeVarDecl ';'

    // Constant.
    | datatype? constVarDecl ';'
    ;

explTypeVarDecl
    : name=IDENT ('=' value=rvalue)? (| ',' next=explTypeVarDecl)
    ;

implTypeVarDecl
    : name=IDENT ':=' value=rvalue (| ',' next=implTypeVarDecl)
    ;

constVarDecl
    : name=IDENT '::=' value=rvalue (| ',' next=constVarDecl)
    ;

// Datatypes.
datatype
    // Pointer.
    : basetype=datatype indir='@'+
    #DTPointer

    // Function.
    | '(' '(' args=anonArguments? ')' '=>' '(' ret=returnTypes? ')' ')'
    #DTFunction

    // Primitive.
    | primitive
    #DTPrimitive

    // User-defined.
    | IDENT
    #DTUserDefined
    ;

// Anonymous argument list comma-separated.
// Used for function type variable declarations.
anonArguments
    : type=datatype (| ',' next=anonArguments)
    ;

// LValues.
lvalue
    // Assignment result.
    : lhs=lvalue operator='=' rhs=rvalue
    #LAssignment

    // Multiplication assignment.
    | lhs=lvalue operator=('*='|'/=') rhs=rvalue
    #LMulAssignment

    // Modulation assignment.
    | lhs=lvalue operator='%=' rhs=rvalue
    #LModAssignment

    // Addition assignment.
    | lhs=lvalue operator=('+='|'-=') rhs=rvalue
    #LAddAssignment

    // Variable name.
    | IDENT
    #LIdentifier
    ;

// RValues.
rvalue
    // Negation.
    : '!' rvalue
    #RNegation

    // Constant.
    | constant
    #RConst

    // Implicit from lvalue.
    | lvalue
    #RImplicit

    // Parenthesized.
    | '(' rvalue ')'
    #RParentheses

    // Function call.
    | rvalue '(' args=callArguments? ')'
    #RFunctionCall

    // Multiplication / division result.
    | lhs=rvalue operator=('*'|'/') rhs=rvalue
    #RMulResult

    // Modulo result.
    | lhs=rvalue operator='%' rhs=rvalue
    #RModResult

    // Addition / subtraction result.
    | lhs=rvalue operator=('+'|'-') rhs=rvalue
    #RAddResult
    ;

// Function call arguments comma-separated.
callArguments
    : argval=rvalue (| ',' next=callArguments )
    ;

// Constants.
constant
    // String constant.
    : STRING
    #CString

    // Real number.
    | REAL
    #CReal

    // Whole number.
    | SINT
    #CInt

    // Undefined pointer state.
    | 'undefined'
    #CUndefined

    // True / false.
    | ('true'|'false')
    #CBool
    ;

// Primitive types.
primitive
    : 'void'
    #PVoid

    | 'bool'
    #PBool

    | ('s8'|'s16'|'s32'|'s64'|'u8'|'u16'|'u32'|'u64')
    #PInt

    | ('f32'|'f64')
    #PFloat
    ;

// *** Lexer rules start here. *** //

IDENT
    : '_'+ DIGIT ('_'|CHAR|DIGIT)*
    | '_'* CHAR  ('_'|CHAR|DIGIT)*
    ;

STRING
    : '"' .*? '"'
    ;

REAL
    : '-'? DIGIT+ '.' DIGIT+ ([eE] ('+'|'-')? UINT)?
    ;

SINT
    : UINT
    | '-' UINT
    ;

UINT
    : DIGIT+
    ;

DIGIT
    : [0-9]
    ;

CHAR
    : UCHAR
    | LCHAR
    ;

UCHAR
    : [A-Z]
    ;

LCHAR
    : [a-z]
    ;

WS
    : [ \t]+
    -> skip
    ;

ENDL
    : '\r'? '\n'
    -> skip
    ;

LNCOM
    : '//' .*? ENDL
    -> skip
    ;

BLKCOM
    : '/*' .*? '*/'
    -> skip
    ;
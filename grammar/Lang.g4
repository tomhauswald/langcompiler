grammar Lang;

// Parser rules start here.

program
: // Match empty program.
| definition+
;

definition
: functionDefinition
| variableDeclaration
;

statement
: rvalue ';'
| '{' statement* '}'
| variableDeclaration
| 'return' value=rvalue (',' value=rvalue)* ';'
| 'if' '(' condition=rvalue ')' trueBody=statement ('else' falseBody=statement)?
| 'for' '(' decl=variableDeclaration condition=rvalue ';' update=rvalue ')' body=statement
| 'while' '(' condition=rvalue ')' body=statement
| 'do' body=statement 'while' '(' condition=rvalue ')' ';'
| 'foreach' '(' collection=rvalue '=:' var=IDENT ')' body=statement
| 'foreach' '(' open=('(' | '[') min=SINT '..' max=SINT close=(')' | ']') '=:' var=IDENT ')' body=statement
;

functionDefinition
: '(' '(' args=arguments? ')' '=>' '(' rvs=returnTypes? ')' ')' name=IDENT '=' '{' body=statement* '}' ';'
;

arguments
: type=datatype name=IDENT
| type=datatype name=IDENT ',' next=arguments
;

returnTypes
: type=datatype
| type=datatype ',' next=returnTypes
;

variableDeclaration
: type=datatype name=IDENT ('=' value=rvalue)? (',' name=IDENT ('=' value=rvalue)?)* ';' // Explicitly typed.
| name=IDENT ':=' value=rvalue (',' name=IDENT ':=' value=rvalue)* ';'                   // Implicitly typed.
| type=datatype? name=IDENT isconst='::=' value=rvalue (',' name=IDENT '::=' value=rvalue)* ';'  // Constant definition.
;

datatype
// Pointer.
: basetype=datatype indirections='@'+
// Function.
| '(' '(' args=anonArguments? ')' '=>' '(' rvs=returnTypes? ')' ')'
// Primitive.
| primitive
// User-defined.
| IDENT
;

anonArguments
: type=datatype
| type=datatype ',' next=anonArguments
;

lvalue
: IDENT
| lhs=lvalue operator='=' rhs=rvalue
| lhs=lvalue operator=('*=' | '/=') rhs=rvalue
| lhs=lvalue operator='%=' rhs=rvalue
| lhs=lvalue operator=('+=' | '-=') rhs=rvalue
;

rvalue
: constant
| lvalue
| '(' rvalue ')'
| '!' rvalue
| rvalue '(' args=callArguments? ')'
| lhs=rvalue operator=('*' | '/') rhs=rvalue
| lhs=rvalue operator='%' rhs=rvalue
| lhs=rvalue operator=('+' | '-') rhs=rvalue
;

callArguments
: argval=rvalue
| argval=rvalue ',' next=callArguments
;

constant
: STRING
| REAL
| SINT
| 'null'
| 'true'
| 'false'
;

// Primitive types.
primitive
: 'void'
| 'bool'
| 's8'
| 's16'
| 's32'
| 's64'
| 'u8'
| 'u16'
| 'u32'
| 'u64'
| 'f32'
| 'f64'
;

// Lexer rules start here.

IDENT
: '_'+ DIGIT ('_' | CHAR | DIGIT)*
| '_'* CHAR  ('_' | CHAR | DIGIT)*
;

STRING
: '"' .*? '"'
;

REAL
: '-'? DIGIT+ '.' DIGIT+ ([eE] ('+' | '-')? UINT)?
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
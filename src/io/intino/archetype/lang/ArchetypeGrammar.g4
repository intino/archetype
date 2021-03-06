parser grammar ArchetypeGrammar;
options { tokenVocab=ArchetypeLexer; }

root: header NEWLINE+ (node NEWLINE*)* EOF;
header: NEWLINE* TARGET COLON LEFT_BRACKET IDENTIFIER+ RIGHT_BRACKET;
node: declaration body?;
declaration: starting IDENTIFIER (parameters | splitted)? (IN LABEL)? (WITH LABEL type?)? ownerAndConsumer ;
starting: MINUS | PLUS | STAR;
parameters: LEFT_PARENTHESIS (parameter (COMMA parameter)*)? RIGHT_PARENTHESIS;
splitted: SPLITTED LEFT_SQUARE (IDENTIFIER (COMMA IDENTIFIER)*)? RIGHT_SQUARE;
parameter: IDENTIFIER type?;
body: NEW_LINE_INDENT (node NEWLINE+)+ DEDENT;
type: AS (REGEX|(TIMETAG COLON IDENTIFIER));
ownerAndConsumer: (OWNER IDENTIFIER)? uses?;
uses:CONSUMER IDENTIFIER+;
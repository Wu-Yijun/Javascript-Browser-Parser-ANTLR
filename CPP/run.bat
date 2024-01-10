:: CPP14Lexer.g4
del CPP14Lexer.js
del CPP14Lexer.tokens
del CPP14Lexer.interp
:: CPP14Parser.g4
del CPP14Parser.js
del CPP14Parser.interp
del CPP14Parser.tokens
del CPP14ParserListener.js

..\antlr.jar -Dlanguage=JavaScript CPP14Lexer.g4 CPP14Parser.g4

..\tools\repath.exe CPP14Lexer.js CPP14Parser.js CPP14Listener.js
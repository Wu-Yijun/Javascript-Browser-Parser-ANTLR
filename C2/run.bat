del C.interp
del C.tokens
del C.tokens.css
del C.tokens.js
del CLexer.interp
del CLexer.js
del CLexer.tokens
del CListener.js
del CParser.js
..\antlr.jar -Dlanguage=JavaScript .\C.g4
..\tools\tokens_to_name.exe C.tokens
..\tools\repath.exe CLexer.js CParser.js CListener.js
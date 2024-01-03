del Test.interp
del Test.tokens
del Test.tokens.css
del Test.tokens.js
del TestLexer.interp
del TestLexer.js
del TestLexer.tokens
del TestListener.js
del TestParser.js
..\antlr.jar -Dlanguage=JavaScript .\Test.g4
..\tools\tokens_to_name.exe Test.tokens
..\tools\repath.exe TestLexer.js TestParser.js TestListener.js
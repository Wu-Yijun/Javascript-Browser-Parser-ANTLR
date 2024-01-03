#pragma once

#include <cstring>
#include <vector>

#include "Style.h"

using namespace std;

const string kLanguageName = "C";
const string kStylePrefix = "CodeCStyle";

vector<StyleSheet> styles = {
    {"Signs", {",", ":", ";"}, {}, {"color: black;"}},
    {"Keyword", {"auto", "const", "for", "return"}, {}, {"color: green;", "font-weight: bold;"}},
    {"NumberInteger", {"int", "long", "short", "signed"}, {}, {"color: blue;"}},
    {"Assign",
     {"=", "*=", "/=", "%=", "+=", "-=", "<<=", ">>=", "&=", "^=", "|="},
     {},
     {"color: #777777;"}},
    {"Logic", {"&&", "||", "!"}, {}, {"color: #165d8c;"}},
    {"Operator",
     {"+", "++", "-", "--", "*", "/", "%", "&", "|", "^", "~"},
     {},
     {"color: #4c62ee;"}},
    {"Compare", {"==", "!=", ">=", "<=", ">", "<"}, {}, {"color: #268c80;"}},
    {"Identifier", {"Identifier"}, {}, {"color: rgb(48, 144, 255);"}},
    {"Braket", {"{", "}", "(", ")", "[", "]"}, {}, {"color: purple;"}},
    {"Comment", {"BlockComment", "LineComment"}, {}, {"color: darkgreen;"}},
    {"Macro", {"Directive", "MultiLineMacro"}, {}, {"color: darkgreen;"}},
    {"String", {"StringLiteral"}, {}, {"color: rgb(33, 134, 33);"}},
    {"Constant", {"Constant"}, {}, {"color: rgb(100, 193, 100);"}},
};
#include <fstream>
#include "JsonReader.hpp"
using namespace std;

void Repath(string path) {
    string contents = "";
    string newline;
    ifstream fin(path);
    while (getline(fin, newline)) {
        if (newline == "import antlr4 from 'antlr4';")
            contents += "import antlr4 from './antlr4.js';";
        else
            contents += newline;
        contents += "\n";
    }
    fin.close();
    ofstream fout(path);
    fout << contents;
    fout.close();
}

int main(int argc, char **argv) {
    for (int i = 0; i < argc; i++) {
        Repath(argv[i]);
    }
    return 0;
}
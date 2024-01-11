#include <fstream>
#include <iostream>
#include <vector>
using namespace std;

const string sync =
    "                await (() => {return new Promise(resolve => {setTimeout(resolve, 10);});})();";

int main(int argc, char **argv) {
    string path = argv[1];
    string contents = "";
    string newline;
    ifstream fin(path);
    int state = 0;
    struct Case {
        string a, b;
        int flag;
    };
    vector<Case> to_find;
    for (int i = 2; i < argc - 1; ++i)
        to_find.push_back({(string)argv[i] + "() {", "this." + (string)argv[i + 1] + "();", 0});
    to_find.back().flag = 2;
    while (getline(fin, newline)) {
        for (auto &i : to_find) {
            if (i.flag == 0 || i.flag == 2) {
                if (auto idex = newline.find(i.a); idex != string::npos) {
                    cout << newline << idex << i.a << endl;
                    newline.insert(idex, "async ");
                    i.flag++;
                    break;
                }
            } else if (i.flag == 1) {
                if (auto idex = newline.find(i.b); idex != string::npos) {
                    cout << newline << idex << i.b << endl;
                    newline.insert(idex, "await ");
                    i.flag = -1;
                    break;
                }
            } else if (i.flag == 3) {
                if (auto idex = newline.find(i.b); idex != string::npos) {
                    cout << newline << idex << i.b << endl;
                    newline += "\n" + sync;
                    i.flag = -1;
                    break;
                }
            }
        }
        contents += newline + "\n";
    }
    fin.close();
    ofstream fout(path);
    fout << contents;
    fout.close();
    return 0;
}
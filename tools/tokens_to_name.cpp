#include <cstring>
#include <fstream>
#include <iostream>
#include <regex>
#include <set>
#include <vector>
using namespace std;

struct StyleSheet {
    string name;
    vector<string> names;
    set<int> ids;
};

const string kStylePrefix = "CodeCStyle";

vector<StyleSheet> styles = {
    {"number_def", {"int", "short"}, {37, 38, 42, 43}},
    {"logic", {"And", "Or"}, {}},
};

const regex pattern("'?(.+?)'?=(\\d+)");

int main() {
    string path, line, name;  // path should be XXX.tokens
    int id, max_id = 0;
    getline(cin, path);
    ifstream fin(path);
    vector<string> list = {"undef"};
    while (fin >> line) {
        smatch result;
        if (regex_match(line, result, pattern)) {
            name = result[1];
            id = atoi(((string)result[2]).c_str());
            cout << id << "\t" << name << endl;
            if (id >= list.size())
                list.resize(id * 1.5 + 1);
            list[id] = name;
            max_id = max(id, max_id);
            for (auto i : styles)
                for (auto j : i.names)
                    if (j == name)
                        i.ids.insert(id);
        }
    }
    fin.close();
    ofstream fout_name(path + ".js");
    fout_name << "export default  [\n    '";
    for (auto i = 0; i <= max_id; ++i)
        fout_name << list[i] << (i == max_id ? "'\n];" : "',\n    '");
    fout_name << endl;
    fout_name.close();

    ofstream fout_css(path + ".css");
    fout_css << "/* Default Style for C++ */\n"
             << "." << kStylePrefix << ",\n"
             << "." << kStylePrefix << "0,\n";
    std::vector<int> defined_id(max_id + 1, 0);
    for (const auto i : styles)
        for (const auto j : i.ids) defined_id[j] = 1;
    for (int i = 1; i <= max_id; ++i)
        if (defined_id[i] == 0)
            fout_css << "." << kStylePrefix << i << ",\n";
    fout_css << "." << kStylePrefix << "Default {\n    color: red;\n}\n" << endl;

    for (auto i : styles) {
        fout_css << "/* Style for C++ " << i.name << "*/\n";
        for (const auto j : i.ids) fout_css << "." << kStylePrefix << j << ",\n";
        fout_css << "." << kStylePrefix << i.name << "\n{\n    color: black;\n}\n" << endl;
    }

    fout_css.close();
    return 0;
}
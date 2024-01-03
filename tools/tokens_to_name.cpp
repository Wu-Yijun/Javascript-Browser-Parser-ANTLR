#include <cstring>
#include <fstream>
#include <iostream>
#include <regex>
#include <set>
#include <vector>

/**
 * @file tokens_to_name.cpp
 * @author your name (you@domain.com)
 * @brief
 * @version 0.1
 * @date 2024-01-03
 *
 * @copyright Copyright (c) 2024
 *
 */

#include "CStyle.h"
#include "Style.h"

using namespace std;

const regex pattern("'?(.+?)'?=(\\d+)");

int main(int argc, char **argv) {
    string path, line, name;  // path should be XXX.tokens
    int id, max_id = 0;
    if (argc == 2) {
        path = argv[1];
    } else {
        getline(cin, path);
    }
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
            for (auto i = styles.begin(); i != styles.end(); ++i)
                for (auto j : i->names)
                    if (j == name)
                        i->ids.insert(id);
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
    fout_css << "/* Default Style for " << kLanguageName << " */\n"
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
        fout_css << "/* Style for " << kLanguageName << " " << i.name << "*/\n";
        for (const auto j : i.ids) fout_css << "." << kStylePrefix << j << ",\n";
        fout_css << "." << kStylePrefix << i.name << " {\n";
        for (const auto j : i.styles) fout_css << "    " << j << "\n";
        fout_css << "}\n" << endl;
    }

    fout_css.close();
    return 0;
}
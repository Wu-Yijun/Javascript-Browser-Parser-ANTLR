#include <cstring>
#include <fstream>
#include <iostream>
#include <regex>
#include <set>
#include <vector>

/**
 * @file tokens_to_name.cpp
 * @author Yijun-Wu
 * @brief
 * @version 0.1
 * @date 2024-01-03
 *
 * @copyright Copyright (c) 2024
 *
 */

#include "JsonReader.hpp"

using namespace std;

const regex pattern("'?(.+?)'?=(\\d+)");

/***
 * arg format
 * argv[0]  path
 * argv[1]  xxx.tokens
 * argv[2]  stylesheet.json
 */
int main(int argc, char **argv) {
    string path, path_stylesheet, line, name;  // path should be XXX.tokens
    int id, max_id = 0;
    if (argc == 3) {
        path = argv[1];
        path_stylesheet = argv[2];
    } else if (argc == 2) {
        path = argv[1];
        getline(cin, path_stylesheet);
    } else {
        getline(cin, path);
        getline(cin, path_stylesheet);
    }
    StyleSheet ss;
    ifstream fstyle(path_stylesheet);
    ss.Read(fstyle);
    fstyle.close();

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
            for (auto i = ss.sheet.begin(); i != ss.sheet.end(); ++i)
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
    fout_css << "/* Default Style for " << ss.languaue << " */\n"
             << "." << ss.prefix << ",\n"
             << "." << ss.prefix << "0,\n";
    std::vector<int> defined_id(max_id + 1, 0);
    for (const auto i : ss.sheet)
        for (const auto j : i.ids) defined_id[j] = 1;
    for (int i = 1; i <= max_id; ++i)
        if (defined_id[i] == 0)
            fout_css << "." << ss.prefix << i << ",\n";
    fout_css << "." << ss.prefix << "Default {\n    color: red;\n}\n" << endl;

    for (auto i : ss.sheet) {
        fout_css << "/* Style for " << ss.languaue << " " << i.name << "*/\n";
        for (const auto j : i.ids) fout_css << "." << ss.prefix << j << ",\n";
        fout_css << "." << ss.prefix << i.name << " {\n";
        for (const auto j : i.styles) fout_css << "    " << j << "\n";
        fout_css << "}\n" << endl;
    }

    fout_css.close();
    return 0;
}
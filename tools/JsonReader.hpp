#include <fstream>
#include <set>
#include <vector>

class JsonReader {
  public:
    enum Type { kString, kArray, kObject };
    void Read(std::ifstream& fin) {
        char c;
        std::string name = "";
        std::string tmp;
        bool has_name = false;
        while (fin >> c) {
            if (c >= '0' && c <= '9') {
                double res = ReadNumber(fin, c);
                if (!has_name)  // first enter, continue
                    continue;
                double* ptr = GetNumber(name);
                if (ptr != nullptr)
                    *ptr = res;
                has_name = false;
                continue;
            }
            switch (c) {
                case '{': {
                    if (!has_name)  // first enter, continue
                        continue;
                    JsonReader* obj = GetObject(name);
                    if (obj == nullptr)  // not set, skip
                        Balance(fin, '{', '}', 1);
                    else
                        obj->Read(fin);
                    has_name = false;
                    break;
                }
                case '"': {
                    std::string* str = GetString(name);
                    if (!has_name) {
                        ReadWholeString(fin, name);
                        has_name = true;
                    } else if (str != nullptr) {
                        ReadWholeString(fin, *str);
                        has_name = false;
                    } else {
                        ReadWholeString(fin, tmp);
                        has_name = false;
                    }
                    break;
                }
                case '[': {
                    if (!has_name) {
                        Balance(fin, '[', ']', 1);
                        break;
                    }
                    while (fin >> c) {
                        if (c == ']')
                            break;
                        if (c == '"') {
                            auto arr = GetArrayString(name);
                            if (arr == nullptr)
                                ReadWholeString(fin, tmp);
                            else
                                ReadWholeString(fin, *arr);
                        } else if (c == '{') {
                            auto arr = GetArrayObject(name);
                            if (arr == nullptr)
                                Balance(fin, '{', '}', 1);
                            else
                                arr->Read(fin);
                        } else if ('0' <= c && c <= '9') {
                            double res = ReadNumber(fin, c);
                            double* ptr = GetArrayNumber(name);
                            if (ptr != nullptr)
                                *ptr = res;
                        }
                    }
                    has_name = false;
                    break;
                }
                case ':': {
                    break;
                }
                case '}': {
                    InputFinished();
                    return;
                }
                default: {
                    break;
                }
            }
        }
        InputFinished();
    }

  protected:
    // you should overwrite these
    virtual double* GetNumber(std::string name) { return nullptr; }
    virtual std::string* GetString(std::string name) { return nullptr; }
    virtual JsonReader* GetObject(std::string name) { return nullptr; }
    virtual double* GetArrayNumber(std::string name) { return nullptr; }
    virtual std::string* GetArrayString(std::string name) { return nullptr; }
    virtual JsonReader* GetArrayObject(std::string name) { return nullptr; }
    virtual void InputFinished() {}

  private:
    static int Balance(std::ifstream& fin, char l, char r, int left) {
        char c;
        while (!fin.get(c).eof() && left != 0) {
            if (c == l)
                left++;
            if (c == r)
                left--;
        }
        return left;
    }
    // 读取到下一个有效的双引号为止
    static void ReadWholeString(std::ifstream& fin, std::string& str_out) {
        str_out = "";
        char c;
        while (!fin.get(c).eof()) {
            if (c == '"')
                break;
            if (c == '\\') {
                c = fin.peek();
                switch (c) {
                    case '0':
                        str_out += c;
                        break;
                    case 'n':
                        str_out += '\n';
                        break;
                    case 't':
                        str_out += '\t';
                        break;
                    case 'r':
                        str_out += '\r';
                        break;
                    default:
                        str_out += c;
                }
                continue;
            }
            str_out += c;
        }
    }
    static double ReadNumber(std::ifstream& fin, char c) {
        // 数字
        double res = (c - '0');
        double res2 = 0.1;
        while (fin.get(c) && c >= '0' && c <= '9') {
            res = (c - '0') + res * 10;
        }
        if (c == '.')
            while (fin.get(c) && c >= '0' && c <= '9') {
                res += res2 * (c - '0');
                res2 /= 10;
            }
        return res;
    }
};

class Style : public JsonReader {
  public:
    std::string name;
    std::vector<std::string> names;
    std::vector<double> ids_tmp;
    std::set<int> ids;
    std::vector<std::string> styles;

  protected:
    double* GetArrayNumber(std::string n) {
        if (n == "ids") {
            ids_tmp.push_back(0.0);
            return &ids_tmp.back();
        }
        return nullptr;
    }
    std::string* GetString(std::string n) {
        if (n == "name")
            return &name;
        return nullptr;
    }
    std::string* GetArrayString(std::string n) {
        if (n == "names") {
            names.push_back("");
            return &names.back();
        } else if (n == "styles") {
            styles.push_back("");
            return &styles.back();
        }
        return nullptr;
    }
    void InputFinished() {
        for (auto i : ids_tmp) ids.insert((int)(i + 0.5));
    }
};

class StyleSheet : public JsonReader {
  public:
    std::string languaue;
    std::string prefix;
    std::vector<Style> sheet;

  protected:
    std::string* GetString(std::string n) {
        if (n == "kLanguageName")
            return &languaue;
        if (n == "kStylePrefix")
            return &prefix;
        return nullptr;
    }
    JsonReader* GetArrayObject(std::string n) {
        if (n == "styles") {
            sheet.push_back({});
            return &sheet.back();
        }
        return nullptr;
    }
};

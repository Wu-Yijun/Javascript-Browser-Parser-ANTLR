#pragma once

#include <array>
#include <cstring>
#include <vector>

struct StyleSheet {
    std::string name;
    std::vector<std::string> names;
    std::set<int> ids;
    std::vector<std::string> styles = {"color: black"};
};

class StyleHelper {
  public:
    static constexpr char kHex_[] = "0123456789ABCDEF";
    static constexpr std::array<char, 9> ItoaHex(unsigned int i) noexcept {
        std::array<char, 9> a = {};
        for (int k = 0; k < 8; ++k) a[7 - k] = kHex_[i & 0xF], i >>= 4;
        return a;
    }
    static constexpr std::array<char, 16> Color(int r, int g, int b, int a = 255) {
        std::array<char, 16> str = {};
        auto hex = ItoaHex((unsigned)r << 12 | (unsigned)g << 8 | (unsigned)b << 4 | (unsigned)a);
        str[0] = 'c', str[1] = 'o', str[2] = 'l', str[3] = 'o', str[4] = 'r', str[5] = ':';
        str[6] = ' ', str[7] = '#';
        for (int k = 0; k < 8; ++k) str[k + 8] = hex[k];
        return str;
    }
    template <int N>
    static constexpr std::array<char, 8 + N> Color(const char (&color)[N]) {
        std::array<char, 8 + N> str = {};
        str[0] = 'c', str[1] = 'o', str[2] = 'l', str[3] = 'o', str[4] = 'r', str[5] = ':';
        str[6] = ' ', str[7] = '#';
        for (int k = 0; k < N; ++k) str[k + 8] = color[k];
        return str;
    }
};

constexpr auto b = StyleHelper::Color("red");
const std::string bb = b.data();
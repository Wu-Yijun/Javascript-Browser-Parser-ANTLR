#include <stdio.h>
#define A 12
constexpr int B = 10;
int C = 10;
int D;
double E, F;

void fun(int);

typedef long long LL;

LL boo(LL);
LL bar(LL a);
LL foo(LL, int);

template <typename T>
int add(const T &a, const T &b) {
    return a + b;
}

class G {
    int b;
    union U {
        int a;
        LL b;
        char c[5];
    };
};
G g;

typedef class {
    LL c;
    enum Flag {
        kOne,
        kTwo,
        kFive = 5,
        kSix,
    };
} H;
H h;

template <int N>
struct I {
    int a[N];
};

int main() {
    auto c = add(A, B);
    auto d = add<double>(12.5, 1 + 2);
    LL e = (LL)c;
    printf("%d %lf\\nHello World!", c, d);
    {  // Code Block
        int c;
        int d = 10;
        d += c;
    }
    int arr[10][10][20] = {};
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < i; ++j) {
            for (int k = 0; k < j + i; ++k) {
                if ((i + j + k) % 3 == 0)
                    arr[i][j][k] = 1;
            }
        }
    }
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < i; ++j) {
            for (int k = 0; k < j + i; ++k) {
                if ((i + j + k) % 3 == 0)
                    arr[i][j][k] = 1;
            }
        }
    }
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < i; ++j) {
            for (int k = 0; k < j + i; ++k) {
                if ((i + j + k) % 3 == 0)
                    arr[i][j][k] = 1;
            }
        }
    }
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < i; ++j) {
            for (int k = 0; k < j + i; ++k) {
                if ((i + j + k) % 3 == 0)
                    arr[i][j][k] = 1;
            }
        }
    }
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < i; ++j) {
            for (int k = 0; k < j + i; ++k) {
                if ((i + j + k) % 3 == 0)
                    arr[i][j][k] = 1;
            }
        }
    }
    for (int i = 0; i < 10; ++i) {
        for (int j = 0; j < i; ++j) {
            for (int k = 0; k < j + i; ++k) {
                if ((i + j + k) % 3 == 0)
                    arr[i][j][k] = 1;
            }
        }
    }
    return 0;
}
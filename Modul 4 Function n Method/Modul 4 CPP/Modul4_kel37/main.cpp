#include <iostream>
#include <string>
using namespace std;

void non_return_func (string praktikan1, string praktikan2, int kelompok) {
    cout << praktikan1 << " dan " << praktikan2 << "adalah kelompok " << kelompok << endl;
    }

int return_func (int perkalian) {
    if (perkalian > 0 || perkalian < 3) {
        return perkalian * 3;
    }
    else {
        return perkalian * 0;
    }
}

int main() {
    cout << "Selamat datang di Praktikum DKP 2022\n" << endl;
    cout << "[NON RETURN FUNCTION]" << endl;
    non_return_func("praktikan_1", "praktikan_2", 1);
    cout << "\n[RETURN FUNCTION] " << endl;
    cout << "hasil perkalian 1 dengan 3 adalah " << return_func(1);
}

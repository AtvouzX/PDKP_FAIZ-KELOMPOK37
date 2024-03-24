#include <iostream>
#include <string>
using namespace std;

class MyClass {
public:
    void non_return_method(string kelompok) {
        cout << "Halo, kami dari kelompok " << kelompok;
    }

    int with_return_method(int angka) {
        return angka*angka;
    }
};

int main() {
    MyClass myObj;
    cout << "[NON RETURN FUNCTION]" << endl;
    myObj.non_return_method("100");
    cout << "\n\n[RETURN FUNCTION]" << endl;
    cout << "hasil kali 100 dengan 100 adalah " << myObj.with_return_method(100);
    return 0;
}

#include <iostream>

using namespace std;

int main()
{
    int angka;
    cout << "Masukkan Case (1-3) yang anda inginkan : ";
    cin >> angka;
    switch(angka) {
        case 1:
            cout <<"Ini Case 1 dan Anda mendapat uang 2 juta\n";
            break;
        case 2:
            cout <<"Ini Case 2 dan Anda mendapat motor beat\n";
            break;
        default:
            cout <<"Ini default dan anda tidak mendapat apa apa\n";
            break;
    }
    return 0;
}

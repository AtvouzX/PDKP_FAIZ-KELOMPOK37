#include <iostream>

using namespace std;

int main()
{
    string nama;
    cout << "Masukkan nama anda :" ;
    cin >> nama;
    if (nama == "Agus") {
        cout <<"Namaku "<< nama << "\n";
    }
    else {
        cout << "Namaku bukan Mario, aku " << nama <<"\n";
    }
    return 0;
}

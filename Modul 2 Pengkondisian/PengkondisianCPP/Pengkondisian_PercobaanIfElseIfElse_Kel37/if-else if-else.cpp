#include <iostream>

using namespace std;

int main()
{
    string nama;
    cout << "Masukkan nama anda :" ;
    cin >> nama;
    if (nama == "Mario") {
        cout <<"Namaku "<< nama << "\n";
    }
    else if (nama == "Agus") {
        cout << "aku bukan Mario, aku kakanya "<< nama <<"\n";
    }
    else {
        cout <<"Namaku bukan Mario, aku "<< nama <<"\n";
    }
    return 0;
}

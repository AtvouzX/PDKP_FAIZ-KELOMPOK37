#include <iostream>
using namespace std;

class Mobil {
//Encapsulation
private:
    string merk, nama;
    int harga;

public:
    // Setter
    void setMerk(string m) {
        merk = m;
    }
    void setNama(string n) {
        nama = n;
    }
    void setHarga(int h) {
        harga = h;
    }

    // Getter
    string getMerk() {
        return merk;
    }
    string getNama() {
        return nama;
    }
    int getHarga() {
        return harga;
    }

};

int main() {
    Mobil rugidong;
    rugidong.setMerk("Honda");
    rugidong.setNama("Civic");
    rugidong.setHarga(500000);
    cout << "Aku punya mobil " + rugidong.getMerk() + " " + rugidong.getNama() + " dengan harga " ;
    cout << rugidong.getHarga();
    cout << endl; cout << endl;

    rugidong.setMerk("Toyota");
    rugidong.setNama("Fortuner");
    rugidong.setHarga(700000);
    cout << "Temanku punya mobil " + rugidong.getMerk() + " " + rugidong.getNama() + " dengan harga ";
    cout << rugidong.getHarga();
    cout << endl; cout << endl;

    return 0;
}

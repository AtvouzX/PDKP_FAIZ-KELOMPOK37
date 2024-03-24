#include <iostream>

using namespace std;

int main()
{
   //Volume Prisma Segitiga
   //V = Luas Alas * Tinggi
    int volume, alas, tinggisegitiga, tinggiprisma, luasPersegi, luas;
    float luasSegitiga;
    alas = 8;
    tinggisegitiga = 4;
    tinggiprisma = 20;
    luasSegitiga = 0.5 * alas * tinggisegitiga;
    luasPersegi = tinggiprisma * alas * 3;
    volume = luasSegitiga * tinggiprisma;
    luas = 2 * luasSegitiga + luasPersegi;

    cout << "\n ====== Program Menghitung Volume dan Luas Prisma Segititga ====== \n\n";
    cout << "Volume Prisma Segitiga = " << volume << " cm^3" << endl;
    cout << "Luas Prisma Segitiga = " << luas << " cm^2" << endl;
    cout << "Kelompok 37";
    return 0;
}

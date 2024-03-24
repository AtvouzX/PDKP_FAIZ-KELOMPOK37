package com.example;

public class percobaan4 {
    public static void main(String[] args) {
        String[][] array = {{"Oti", "Olive", "Rocket", "D'kriuk", "Pak Go"}, {"Ayam", "Sapi", "telor", "Bebek", "Sosis",}};

        System.out.println("Resto " + array[0][0] + " menjual " + array[1][0]);
        System.out.println("Resto " + array[0][1] + " menjual " + array[1][1]);
        System.out.println("Resto " + array[0][2] + " menjual " + array[1][3]);
        System.out.println("Resto " + array[0][3] + " menjual " + array[1][2]);
        System.out.println("Resto " + array[0][4] + " menjual " + array[1][4]);

        array[1][4] = "Burung";

        System.out.println("Mulai tanggal 1 Januari " + array[0][4] +  " juga menjual " + array[1][4]);
    }
}

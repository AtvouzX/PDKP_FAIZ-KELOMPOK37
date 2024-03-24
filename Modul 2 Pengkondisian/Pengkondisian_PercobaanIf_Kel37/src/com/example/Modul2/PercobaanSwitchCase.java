package com.example.Modul2;
import java.util.Scanner;
public class PercobaanSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka 1-2 yang diinginkan: ");
        int i=scan.nextInt();
        switch (i){
            case (1):System.out.println("Angka yang Anda masukkan bernilai 1");
            break;
            case (2):System.out.println("Angka yang Anda masukkan bernilai 2");
            break;
            default:System.out.println("Angka yang Anda masukkan tak bernilai 1 ataupun 2");
            break;
        }
        System.out.println("Program Selesai!");
        System.out.println("Kelompok 37");
    }
}

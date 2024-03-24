package com.example.Modul2;
import java.util.Scanner;
public class PercobaanIfElseIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int i=scan.nextInt();
        if (i==0){
            System.out.println("Angka bernilai 0");
        } else if (i>0) {
            System.out.println("Angka bernilai positif yaitu "+i);
        }
        else {
            System.out.println("Angka bernilai negatif yaitu "+i);
        }
        System.out.println("program Selesai!");
        System.out.println("Kelompok 37");
    }
}

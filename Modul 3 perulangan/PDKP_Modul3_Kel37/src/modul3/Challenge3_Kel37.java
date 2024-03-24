package modul3;
import java.util.Scanner;

public class Challenge3_Kel37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input panjang array
        System.out.println("masukkan jumlah bilangan: ");
        int n = input.nextInt();

        int[] angka = new int[n];
        int total=0;

        for (int i=0;i < n;i++) {
            System.out.println("Masukkan bilangan ke-" + (i+1) + " : ");
            angka[i] = input.nextInt();
            total += angka[i];
        }

        //variabel jumlah bilangan ganjil dan genap
        int ganjil=0, genap=0, totalGenap=0, totalGanjil=0;

        //Hitung jumlah bilangan ganjil dan genap
        for (int j=0;j<n;j++){
            if (angka[j] % 2 == 0) {
                genap++;
                totalGenap += angka[j];
            }
            else {
                ganjil++;
                totalGanjil += angka[j];
            }
        }
        System.out.println("Banyaknya bilangan ganjil: " +genap);
        System.out.println("Total bilangan genap: " +totalGenap);
        System.out.println("Banyaknya bilangan ganjil: " +ganjil);
        System.out.println("Total bilangan ganjil: " +totalGanjil);
        System.out.println("Total keseluruhan :" +total);
    }
}

package modul3;
import java.util.Scanner;

public class Challenge2_kel37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input n dari user
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        // Menghitung deret Fibonacci ke-n
        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= 2) {
                c = i - 1;
            } else {
                c = a + b;
                a = b;
                b = c;
            }
        }

        // Mencetak hasil
        System.out.println("Deret Fibonacci ke-" + n + " adalah: " + c);
    }
}


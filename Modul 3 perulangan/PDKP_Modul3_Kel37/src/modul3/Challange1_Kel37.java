package modul3;

public class Challange1_Kel37 {
    public static void main(String[] args) {
        String[] array = {"Aku", "Suka", "Makan", "Nasi"};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}

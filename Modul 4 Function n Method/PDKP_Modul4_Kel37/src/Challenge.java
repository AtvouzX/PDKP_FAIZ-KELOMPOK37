public class Challenge {

    public static int hitungLuas(int panjang, int lebar) {
        // Menghitung luas persegi panjang
        int luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        // Menentukan nilai panjang dan lebar
        int panjang = 5;
        int lebar = 3;

        // Menghitung luas dengan memanggil function
        int luas = hitungLuas(panjang, lebar);

        // Mencetak hasil luas menggunakan function
        System.out.println("Luas persegi panjang: " + luas);


        pendefinisi objek = new pendefinisi() ;
        // Mencetak hasil luas menggunakan Method
        String print = objek.hitungLuas(12, 23);
        System.out.println(print);
    }
}
public class Challenge {
    public static void main(String[] args) {
        String[][] array = {{"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "sabtu", "Minggu"}, {"Ayam goreng", "Nasi Putih", "Es Buah", "Gorengan", "Es cendol", "Telur gulung", "Bihun Goreng", "telor balado", "rendang"}};

        System.out.println("Menu makan buka hari " + array[0][0] + " adalah " + array[1][0] + ", " + array[1][1] + ", " + array[1][2]);
        System.out.println("Menu makan buka hari " + array[0][1] + " adalah " + array[1][3] + ", " + array[1][4]);
        System.out.println("Menu makan buka hari " + array[0][2] + " adalah " + array[1][3] + ", " + array[1][5]);
        System.out.println("Menu makan buka hari " + array[0][3] + " adalah " + array[1][2] + ", " + array[1][6]);
        System.out.println("Menu makan buka hari " + array[0][4] + " adalah " + array[1][1] + ", " + array[1][8]);
        System.out.println("Menu makan buka hari " + array[0][5] + " adalah " + array[1][1] + ", " + array[1][7]);
        System.out.println("Menu makan buka hari " + array[0][6] + " adalah " + array[1][2] + ", " + array[1][3]);

    }
}

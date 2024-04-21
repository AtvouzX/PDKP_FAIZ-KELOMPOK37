public class Praktikum_DKP {
    public static void main(String[] args) {
        Modul6_Kel37 kiwkiw = new Modul6_Kel37();
        //mengatur nilai atribut
        kiwkiw.setMotor("Aerox");
        kiwkiw.setJenis("Yamaha");
        kiwkiw.setWarna("Merah");
        //mencetak nilai
        System.out.print("Saya punya Motor " + kiwkiw.getMotor());
        System.out.print(" dengan Merk "+ kiwkiw.getJenis());
        System.out.print(", Berwarna "+ kiwkiw.getWarna());
    }
}

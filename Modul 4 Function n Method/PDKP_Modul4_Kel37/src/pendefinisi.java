public class pendefinisi {
    public void greeting () {
        System.out.println("Hai, saya method dari class pendefinisi. Salam kenal :)");
    }
    public void kelompok (String kelompok) {
        System.out.println(kelompok);
    }
    public String kenalan (String nama, String hobi) {
        return "Hai, Nama saya " + nama + " hobi saya " + hobi;
    }

    public String hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return "Luas Persegi panjang adalah "+ luas;
    }
}

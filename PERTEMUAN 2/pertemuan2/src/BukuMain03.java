public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();;
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku03 bk2 = new Buku03("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        

        Buku03 Afifah = new Buku03("Rembulan Tenggelam di Wajahmu", "Tere Liye", 300, 4, 90000);
        Afifah.tampilInformasi();
        Afifah.terjual(5);

        System.out.println("Total Harga: " + Afifah.hitungHargaTotal());
        System.out.println("Total Diskon: " + Afifah.hitungDiskon());
        System.out.println("Harga Bayar: " + Afifah.hitungHargaBayar());
    }
}


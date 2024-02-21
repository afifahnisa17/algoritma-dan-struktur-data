public class Buku03 {
    String judul, pengarang;
    int halaman, stok, harga;
    
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }
    
    void terjual(int jml) {
        if (stok >= 0 && jml < stok) {
            stok -= jml;
        } else {
            System.out.println("Stock Habis");
        }
    }
    
    void restock(int jml) {
        stok += jml;
    }
    
    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku03() {

    }

    public Buku03(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}

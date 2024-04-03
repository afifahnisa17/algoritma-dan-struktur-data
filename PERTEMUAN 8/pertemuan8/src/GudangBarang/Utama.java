package GudangBarang;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Tentukan Kapasitas Gudang: ");
        int Kapasitas = sc3.nextInt();
        Gudang3 gudang = new Gudang3(Kapasitas);
        System.out.println("Kapasitas gudang saat ini adalah " + Kapasitas);
        boolean konfirmasi  = true;

        while (konfirmasi){
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc3.nextInt();
            sc3.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang  : ");
                    int kode = sc3.nextInt();
                    sc3.nextLine();
                    System.out.print("Masukkan nama barang  : ");
                    String nama = sc3.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc3.nextLine();
                    Barang3 barangBaru = new Barang3(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                
                case 2:
                    gudang.ambiBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;
                
                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    konfirmasi = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}

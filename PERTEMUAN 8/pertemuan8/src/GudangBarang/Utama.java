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
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Barang");
            System.out.println("7. Keluar");
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
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;
                
                case 4:
                    gudang.lihatBarangTeratas();
                    break;

                case 5:
                    gudang.lihatBarangTerbawah();
                    break;

                case 6:
                    System.out.println("Cari Barang Berdasarkan: ");
                    System.out.println("1. Kode Barang");
                    System.out.println("2. Nama barang");
                    System.out.print("Masukkan Pilihan Anda: ");
                    int choice = sc3.nextInt();
                    switch(choice){
                        case 1: 
                            System.out.println("=============================");
                            System.out.println("Pencarian berdasarkan Kode Barang");
                            System.out.print("Masukkan kode barang: ");
                            int cari = sc3.nextInt();
                            int posisi = gudang.CariBarangKode(cari);
                            gudang.Tampilposisi(cari, posisi);
                            gudang.TampilData(cari, posisi);
                            break;
                        case 2:
                            System.out.println("=============================");
                            System.out.println("Pencarian berdasarkan Nama Barang");
                            sc3.nextLine();
                            System.out.print("Masukkan nama barang: ");
                            String cari2 = sc3.nextLine(); 
                            posisi = gudang.CariBarangNama(cari2);
                            if (posisi != -1) {
                                gudang.TampilposisiString(cari2, posisi);
                                gudang.TampilDataString(cari2, posisi);
                            } else {
                                System.out.println("Data " + cari2 + " tidak ditemukan");
                            }
                            break;
                            
                        default:
                            System.out.println("Pilihan yang kamu masukkan tidak valid.");
                            break;
                    }

                case 7:
                    konfirmasi = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}


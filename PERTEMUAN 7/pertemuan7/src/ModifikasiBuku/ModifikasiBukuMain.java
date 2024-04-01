package ModifikasiBuku;
import java.util.Scanner;

public class ModifikasiBukuMain {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);

    ModifikasiPencarianBuku03 data = new ModifikasiPencarianBuku03();
    int jumBuku = 5;

    System.out.println("----------------------------");
    System.out.println("Masukkan data Buku Secara Urut dari KodeBuku Terkecil: ");
    for(int i = 0; i < jumBuku; i++){
        System.out.println("-------------------------");
        System.out.print("Kode Buku     : ");
        String kodeBuku = s1.nextLine();
        System.out.print("Judul Buku    : ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun Terbit  : ");
        int tahunTerbit = s.nextInt();
        System.out.print("Pengarang     : ");
        String pengarang = s1.nextLine();
        System.out.print("Stock         : ");
        int stock = s.nextInt();

        ModifikasiBuku m = new ModifikasiBuku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
    }

        System.out.println("===============================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("Metode Pencarian Buku: ");
        System.out.println("1. Cari dengan Kode Buku");
        System.out.println("2. Cari dengan Judul Buku");
        System.out.print("Masukkan pilihan Anda: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("===============================");
                System.out.println("Pencarian Data  :");
                System.out.println("Masukkan Kode Buku yang dicari: ");
                System.out.print("Kode Buku   : ");
                String cari = s1.nextLine();
                data.FindSeqSearch(cari);
                
                System.out.println("===============================");
                System.out.println("Menggunakan Sequential Search Method FindBuku");
                ModifikasiBuku dataBuku = data.FindBuku(cari);
                dataBuku.tampilDataBuku();
                System.out.println();
                
                System.out.println("===============================");
                System.out.println("Menggunakan Binary Search");
                int posisi = data.FindBinarySearch(cari, 0, jumBuku -1); // Menggunakan kembali variabel yang sudah didefinisikan sebelumnya
                data.TampilData(cari, posisi);
            

            case 2:
                System.out.println();
                System.out.println("===============================");
                System.out.println("Pencarian Data  :");
                System.out.println("Masukkan Judul Buku yang dicari: ");
                System.out.print("Judul Buku   : ");
                cari = s1.nextLine();
                System.out.println("===============================");
                System.out.println("Menggunakan Sequential Search Method FindBuku");
                ModifikasiBuku[] foundBooks = data.FindJudulBuku(cari);
                if (foundBooks != null) {
                    for (ModifikasiBuku buku : foundBooks) {
                        buku.tampilDataBuku();
                    }

                    if (foundBooks.length > 1) {
                        System.out.println("Ditemukan lebih dari 1 data buku dengan judul " + cari);
                    }

                } else {
                    System.out.println("Data tidak ditemukan");
                }

                System.out.println();
                System.out.println("===============================");
                System.out.println("Menggunakan Binary Search");
                data.findAllJudulBukuBinarySearch(cari, 0, jumBuku - 1);
                break;


            default:
                System.out.println("Mohon Maaf, pilihan Anda tidak tersedia.");
                break;
        }
        
        
    }   
    
}


package TestSearching;
import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);

    PencarianBuku03 data = new PencarianBuku03();
    int jumBuku = 5;

    System.out.println("----------------------------");
    System.out.println("Masukkan data Buku Secara Urut dari KodeBuku Terkecil: ");
    for(int i = 0; i < jumBuku; i++){
        System.out.println("-------------------------");
        System.out.print("Kode Buku     : ");
        int kodeBuku = s.nextInt();
        System.out.print("Judul Buku    : ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun Terbit  : ");
        int tahunTerbit = s.nextInt();
        System.out.print("Pengarang     : ");
        String pengarang = s1.nextLine();
        System.out.print("Stock         : ");
        int stock = s.nextInt();

        Buku m = new Buku(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
        }

        System.out.println("===============================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("===============================");
        System.out.println("Pencarian Data  :");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku   : ");
        int cari = s.nextInt();
        System.out.print("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("===============================");
        System.out.println("Menggunakan Sequential Search Method FindBuku");
        Buku dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("===============================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        data.TampilData(cari, posisi);
        
    }   
    
}


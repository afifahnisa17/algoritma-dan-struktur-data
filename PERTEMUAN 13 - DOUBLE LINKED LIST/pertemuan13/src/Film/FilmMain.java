package Film;
import java.util.Scanner;

public class FilmMain {
    public static void main(String[] args) throws Exception {
        Scanner sc03 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        FilmDLL daftar = new FilmDLL();
        boolean antri = true;

        while (antri){
            System.out.println("===========================");
            System.out.println("  DAFTAR FILM LAYAR LEBAR ");
            System.out.println("===========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film - DESC");
            System.out.println("10. Keluar");
            System.out.println("===========================");
            System.out.print("MAsukkan Pilihan Anda: ");
            int pilihan = sc03.nextInt();

            switch(pilihan){
                case 1:
                    System.out.println("Masukkan data film posisi awal");
                    System.out.print("ID Film   : ");
                    int ID = sc03.nextInt();
                    System.out.print("Judul Film: ");
                    String judul = sc3.nextLine();
                    System.out.print("Rating    : ");
                    double rating = sc03.nextDouble();
                    daftar.addFirst(ID, judul, rating);
                    break;
                
                case 2:
                    System.out.println("Masukkan data film posisi Akhir");
                    System.out.print("ID Film   : ");
                    ID = sc03.nextInt();
                    System.out.print("Judul Film: ");
                    judul = sc3.nextLine();
                    System.out.print("Rating    : ");
                    rating = sc03.nextDouble();
                    daftar.addLast(ID, judul, rating);
                    break;
                
                case 3:
                    System.out.println("Masukkan data film Urutan Tertentu");
                    System.out.print("ID Film   : ");
                    ID = sc03.nextInt();
                    System.out.print("Judul Film: ");
                    judul = sc3.nextLine();
                    System.out.print("Rating    : ");
                    rating = sc03.nextDouble();
                    System.out.print("Data ini akan masuk di urutan ke-: ");
                    int index = sc03.nextInt();
                    daftar.add(ID, judul, rating, index);
                    break;
                
                case 4:
                    daftar.removeFirst();
                    break;
                
                case 5:
                    daftar.removeLast();
                    break;
                
                case 6:
                    System.out.print("Masukkan index film yang ingin dihapus: ");
                    index = sc03.nextInt();
                    daftar.remove(index);
                    break;
                
                case 7:
                    System.out.println("Cetak Data: ");
                    daftar.print();
                    break;
                
                case 8:
                    System.out.println("Masukkan ID Film yang ingin dicari: ");
                    ID = sc03.nextInt();
                    daftar.cariFilm(ID);
                    break;

                case 9:
                    daftar.insertionSort();
                    daftar.print();
                    break;
                
                case 10:
                    antri = false;
                    break;
                
                default:
                    System.out.println("Pilihan Anda Tidak Valid.");
                    break;
            }
        }
    }
}

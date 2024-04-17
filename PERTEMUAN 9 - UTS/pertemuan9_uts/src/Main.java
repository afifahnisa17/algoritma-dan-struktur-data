import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Nilai objek = new Nilai();

        System.out.println("Angka-angka sebelum diurutkan: ");
        objek.tampilAll();
        System.out.println();

        System.out.print("Masukkan angka yang dicari: ");
        int cari = sc.nextInt();

        //Pencarian nilai sebelum diurutkan
        int hasil = objek.findBinarySearch(cari, 0, objek.nilai.length - 1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println();
        System.out.println("Nilai-nilai yang diurutkan secara Ascending: ");
        objek.nilaiSelectionSort();
        objek.tampilAll();
        System.out.println();
        hasil = objek.FindBinarySearchAsc(cari, 0, objek.nilai.length-1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println();
        System.out.println("Nilai-nilai yang diurutkan secara Descending: ");
        objek.nilaiSelectionSortDes();
        objek.tampilAll();
        System.out.println();
        hasil = objek.FindBinarySearchDesc(cari, 0, objek.nilai.length-1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println();
        System.out.print("Masukkan Angka Lain: ");
        cari = sc.nextInt();

        System.out.println("Pencarian secara Ascending: ");
        objek.nilaiSelectionSort();
        hasil = objek.FindBinarySearchAsc(cari, 0, objek.nilai.length-1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }

        System.out.println("Pencarian secara Descending: ");
        objek.nilaiSelectionSortDes();
        hasil = objek.FindBinarySearchAsc(cari, 0, objek.nilai.length-1);
        if (hasil != -1) {
            System.out.println("Angka " + cari +" ditemukan pada indeks: " + hasil);
        } else {
            System.out.println("Angka tidak ditemukan.");
        }


    }
}

package minggu5;

public class Main03 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting: "); 
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk (Bubble Sort)"); // Bubble sort
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (Selection Sort)"); // Selection Sort
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (Inserting Sort)"); // Insertion sort desc
        list.insertionSortDesc();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk (Inserting Sort)"); // Insertion sort asc
        list.insertionSortAsc();
        list.tampil();

    }
}

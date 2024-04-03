<h1 align="center">LAPORAN ALGORITMA DAN STRUKTUR DATA
PERTEMUAN  8 - STACK

<br>
<img src="picture/logopolinema.png" height="300">
</h1>

<h2>Nama &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;Afifah Khoirunnisa
<br>
Kelas &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;TI-1B
<br>
NIM&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;2341720250
<br>
No.Abs&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;03</h2>

### 2.1 PERCOBAAN 1: PENYIMPANAN TUMBUKAN BARANG DALAM GUDANG
### 2.1.1 LANGKAH-LANGKAH PERCOBAAN
### Class Barang
<img src="picture/code - Barang3.png">

### Class Gudang
<img src="picture/code - Gudang3.png">

### Class Utama
<img src="picture/code - Utama.png">

### 2.1.2 VERIFIKASI HASIL PERCOBAAN
<img src="picture/output - Barang 1.png">
<img src="picture/output - Barang 2.png">

### 2.1.3 PERTANYAAN
### 1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki?
### Jawaban:
    Pada jobsheet, pemilihan berisi if(!isEmpty()). Hal tersebut salah, seharusnya adalah (!cekKosong()), karena nama method yang digunakan asalah cekKosng().
```java
    public Barang3 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang3 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
```
    Pada bagian perulangan for, untuk method tampilkanBarang(), seharusnya menggunakan kode sebagai berikut:
```java
    for(int i = top; i >= 0; i--){
                System.out.printf("Kode %d: %s (Kateori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
```
    Pada class Utama, seharusnya dideklarasikan boolean supaya perulangan bisa berhenti jika kondisi tertentu. Pada program yang saya buat, perulangan akan berhenti jika konfirmasi = false;
```java
    boolean konfirmasi  = true;

        while (konfirmasi)
```

### 2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya!
### Jawaban: 
    Data yang dapat ditampung dalam tumpukan adalah 7, sesuai dengan kode berikut:
```java
    Gudang3 gudang = new Gudang3(7);
```

### 3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?
### Jawaban:
    Pengecekan kondisi !cekKosong() perlu dilakukan untuk mengecek data dalam stack kosong atau tidak. Apabila dihapus, maka tidak akan terdeteksi barang yang aada dalam stack kosong atau ada isinya.

### 4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
### Jawaban: 
    Berikut adalah kode program modifikasi:
```java
   
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
```
    Outputnya yaitu sebagai berikut:
```java
    Tentukan Kapasitas Gudang: 6
    Kapasitas gudang saat ini adalah 6

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 21
    Masukkan nama barang  : Jaket
    Masukkan nama kategori: Pakaian
    Barang Jaket berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 31
    Masukkan nama barang  : Oppo A1k
    Masukkan nama kategori: Smartphone
    Barang Oppo A1k berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Keluar
    Pilih operasi: 5
```
### 2.2 PERCOBAAN 2: KONVERSI KODE BARANG KE BINER
### 2.2.1 LANGKAH-LANGKAH PERCOBAAN
### CLASS StackKonversi()
```java
    package GudangBarang;

    public class StackKonversi {
        int size;
        int[] tumpukanBiner;
        int top;

        public StackKonversi(){
            this.size = 32; //asumsi 32 bit
            tumpukanBiner = new int[size];
            top = -1;
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public boolean isFull(){
            return top == size -1;
        }

        public void push(int data){
            if(isFull()){
                System.out.println("Stack penuh");
            } else {
                top++;
                tumpukanBiner[top] = data;
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack kosong.");
                return -1;
            } else{
                int data = tumpukanBiner[top];
                top--;
                return data;
            }
        }
    }
```
### KODE PADA KELAS MAIN
```java
    public String konversiDesimalKeBiner(int kode){
        StackKonversi stack = new StackKonversi();
        while (kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }

    public Barang3 ambilBarang(){
        if(!cekKosong()){
            Barang3 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
```

### 2.2.2 VERIFIKASI HASIL PERCOBAAN
``` 
    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 13
    Masukkan nama barang  : Setrika
    Masukkan nama kategori: Elektronik
    Barang Setrika berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Keluar
    Pilih operasi: 2
    Barang Setrika diambil dari Gudang.
    Kode unik dalam biner: 1101
```
### 2.2.3 PERTANYAAN

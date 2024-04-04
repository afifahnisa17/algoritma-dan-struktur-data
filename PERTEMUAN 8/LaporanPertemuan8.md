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
### 1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
### Jawaban:
-  Saat diberikan angka yang lebih dari nol, maka program akan berjalan seperti sebelumnya. Hal tersebut dikarenakan kode sebelumnya akan menjalankan perintah untuk angka yang lebih dari nol.
- Saat diberikan angka bernilai kurang dari nol, maka output program yaitu sebagai berikut. Hal tersebut dikarenakan, program tidak bisa mengeksekusi angka yang kurang dari nol.
```
    Kode unik dalam biner: -1-10-1
```
- Saat diberikan angka nol, maka tidak ada output yang ditempilkan.
### 2. Jelaskan alur kerja dari method konversiDesimalKeBiner!
### Jawaban:
    Berikut adalah alur dari method konversiDesimalKeBiner

    1. Metode `konversiDesimalKeBiner` menerima satu parameter `kode` yang merupakan bilangan desimal yang ingin dikonversi menjadi bilangan biner. Tipe data parameter tersebut adalah `int`.

    2. Dalam metode tersebut, sebuah objek `StackKonversi` dibuat untuk menyimpan sisa pembagian bilangan desimal dengan 2. Ini adalah bagian dari algoritma konversi desimal ke biner dengan menggunakan operasi pembagian dan modulus.

    3. Selama nilai `kode` masih lebih besar dari 0, langkah-langkah berikut diulang:
    - Hitung sisa pembagian (`sisa`) dari `kode` dibagi dengan 2.
    - Sisa tersebut kemudian dimasukkan ke dalam stack menggunakan metode `push`.
    - Nilai `kode` diperbarui dengan pembagian bilangan desimal tersebut dengan 2, sehingga pada iterasi berikutnya, kita akan mendapatkan digit berikutnya dari biner.

    4. Setelah selesai iterasi pertama, dilakukan iterasi kedua dengan tujuan untuk mengambil nilai dari stack dan membangun string biner.
    - String `biner` dibuat.
    - Selama stack tidak kosong (`!stack.isEmpty()`), digit dari biner diambil dari stack menggunakan metode `pop()`, dan ditambahkan ke string `biner`.

    5. String `biner` yang berisi representasi biner dari bilangan desimal tersebut dikembalikan sebagai output dari metode.

### 2.3 PERCOBAAN 3: KONVERSI NOTASI INFIX KE POSTFIX
### 2.3.1 LANGKAH-LANGKAH PERCOBAAN
### CLASS Postfix3
```java
    package Konversi_Infix_Postfix;

    public class Postfix3 {
        int n, top;
        char stack[];

        Postfix3(int total){
            n = total;
            top = -1;
            stack = new char[10];
            push ('(');
        }

        public void push (char c){
            top++;
            stack[top] = c;
        }

        public char pop(){
            char item = stack[top];
            top--;
            return item;
        }

        public boolean IsOperand(char c){
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') 
                || (c >= '0' && c <= '9') || c == ' ' || c == '.'){
                    return true;
            } else{
                return false;
            }
        }

        public boolean IsOperator(char c){
            if(c == '^' || c == '%' || c == '/' ||c == '*' || c == '-' || c == '+' ){
                return true;
            } else{
                return false;
            }
        }

        public int derajat(char c){
            switch (c){
                case '^':
                    return 3;
                case '%':
                    return 2;
                case '/':
                    return 2;
                case '*':
                    return 2;
                case '-':
                    return 1;
                case '+':
                    return 1;
                default:
                    return 0;
            }
        }

        public String konversi(String Q){
            String P = " ";
            char c;

            for(int i = 0; i < n; i++){
                c = Q.charAt(i);

                if(IsOperand(c)){
                    P = P + c;
                }
                if ( c == '('){
                    push(c);
                }
                if ( c == ')'){
                    while (stack[top] != '('){
                        P = P + pop();
                    }
                    pop();
                }
                if (IsOperator(c)){
                    while (derajat(stack[top]) >= derajat(c)){
                        P = P + pop();
                    }
                    push(c);
                }
            }
            return P;
        }
    }

```

### CLASS PostfixMain3
```java
    package Konversi_Infix_Postfix;
    import java.util.Scanner;

    public class PostfixMain3 {
        public static void main(String[] args) {
            Scanner sc3 = new Scanner(System.in);
            String P, Q;
            System.out.print("Masukkan ekspresi matematika (infix): ");
            Q = sc3.nextLine();
            Q = Q.trim();
            Q = Q + ")";

            int total = Q.length();
            Postfix3 post = new Postfix3(total);
            P = post.konversi(Q);
            System.out.println("Postfix: " + P);

        }
        
    }

```
### 2.3.2 VERIFIKASI HASIL PERCOBAAN
```
    Masukkan ekspresi matematika (infix): a+b*(c+d-e)/f
    Postfix:  abcd+e-*f/+
```
### 2.3.3 PERTANYAAN
### 1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila returnvalue diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?
### Jawaban: 
    Return value beberapa case bernilai sama karena menunjukkan tingkat prioritas dari suatu operasi. Semakin tinggi nilai suatu operasi, maka semakin tinggi pula prioritas operasi tersebut. Dalam method derajat, return value yang memiliki nilai sama berarti memiliki kesetaraan/prioritas yang dengan operasi dengan return value yang sama. Sebagai contoh, operasi "%", "/", dan "*" memiliki return value yang sama sehingga ketiga operasi tersebut memiliki prioritas yang sama. Apabila return value memiliki nilai yang berbeda-beda setiap case nya, maka tingkat prioritas juga berbeda, dan tidak sesuai dengan kaidah prioritas suatu operasi.

### 2. Jelaskan alur kerja method konversi!
### Jawaban:
    Berikut adalah alur kerja method konversi:

    1. Inisialisasi Variabel: 
        - `P` adalah string yang akan menyimpan ekspresi postfix.
        - `c` adalah variabel karakter yang digunakan untuk membaca setiap karakter dari ekspresi input `Q`.

    2. Iterasi Melalui Ekspresi Input:
        - Iterasi dilakukan melalui setiap karakter dari ekspresi input `Q`.

    3. Memeriksa Karakter:
        - Jika karakter adalah operand (bilangan atau variabel), maka karakter tersebut langsung ditambahkan ke dalam string `P`.
        - Jika karakter adalah tanda kurung buka `(`, maka tanda kurung tersebut dimasukkan ke dalam stack.
        - Jika karakter adalah tanda kurung tutup `)`, maka dilakukan proses pengosongan stack hingga menemukan tanda kurung buka yang sesuai.
        - Jika karakter adalah operator, maka dilakukan pengecekan derajat operator pada stack. Jika derajat operator pada stack lebih besar atau sama dengan derajat operator yang sedang diproses, maka operator pada stack dihapus dan dimasukkan ke dalam string `P`.

    4. Pengembalian String Hasil:
        - Setelah iterasi selesai, hasil ekspresi postfix disimpan dalam string `P` dan dikembalikan.

    5. Fungsi Tambahan**: 
        - Fungsi `IsOperand` digunakan untuk memeriksa apakah suatu karakter adalah operand.
        - Fungsi `IsOperator` digunakan untuk memeriksa apakah suatu karakter adalah operator.
        - Fungsi `derajat` digunakan untuk mendapatkan prioritas (derajat) operator.


### 3. Pada method konversi, apa fungsi dari potongan kode berikut?
```java
    c = Q.charAt(i);
```
### Jawaban: 
    Pernyataan `c = Q.charAt(i);` memiliki maksud untuk mengambil karakter pada posisi indeks `i` dari string `Q` dan menyimpannya ke dalam variabel `c`. 

    Dalam konteks fungsi `konversi`, `Q` adalah ekspresi matematika dalam bentuk string yang ingin diubah dari infix menjadi postfix. Dengan menggunakan `charAt(i)`, kita dapat mengakses karakter satu per satu dari string tersebut selama proses iterasi. Variabel `c` kemudian digunakan untuk mewakili karakter saat ini yang sedang diproses dalam ekspresi tersebut.

### 2.4 LATIHAN PRAKTIKUM
### Perhatikan dan gunakan kembali kode program pada Percobaan 1. Tambahkan dua method berikutpada class Gudang:
- ### Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah
### KODE PROGRAN
```java
    public Barang3 lihatBarangTerbawah(){
            if(!cekKosong()){
                Barang3 barangTerbawah = tumpukan[0];
                System.out.println("Barang terbawah: " + barangTerbawah.nama);
                return barangTerbawah;
            } else{
                System.out.println("Tumpukan barang kosong.");
                return null;
            }
        }
```
### OUTPUT 
```
    Tentukan Kapasitas Gudang: 12
    Kapasitas gudang saat ini adalah 12

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 23
    Masukkan nama barang  : Jaket
    Masukkan nama kategori: Pakaian
    Barang Jaket berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 45
    Masukkan nama barang  : Sprite
    Masukkan nama kategori: Minuman
    Barang Sprite berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 5
    Barang terbawah: Jaket
```
- ### Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode barangnya atau nama barangnya
### KODE PROGRAM CARI BARANG DENGAN KODE BARANG
```java
    public int CariBarangKode(int cari){
        int posisi = -1;
        for(int j = 0; j<tumpukan.length; j++){
            if(tumpukan[j].kode == cari){
                posisi = j;
                break;
                
            }
        }
        return posisi;
    }

    public void TampilData(int x, int pos){
        if (pos != -1){
            System.out.println("Kode Barang       : " + tumpukan[pos].kode);
            System.out.println("Nama Barang       : " + tumpukan[pos].nama);
            System.out.println("Kategori Barang   : " + tumpukan[pos].kategori);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void Tampilposisi(int x, int pos){
        if(pos!= -1){
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan ");
        }
    }
```
### OUTPUT CARI BARANG DENGAN MENGGUNAKAN KODE BARANG
```
    Tentukan Kapasitas Gudang: 10
    Kapasitas gudang saat ini adalah 10

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 26
    Masukkan nama barang  : Jaket
    Masukkan nama kategori: Pakaian
    Barang Jaket berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 33
    Masukkan nama barang  : Pizza
    Masukkan nama kategori: Makanan
    Barang Pizza berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 6
    Cari Barang Berdasarkan:
    1. Kode Barang
    2. Nama barang
    Masukkan Pilihan Anda: 1
    =============================
    Pencarian berdasarkan Kode Barang
    Masukkan kode barang: 33
    Data: 33 ditemukan pada indeks 1
    Kode Barang       : 33
    Nama Barang       : Pizza
    Kategori Barang   : Makanan
```
### KODE PROGRAM CARI BARANG DENGAN NAMA BARANG
```java
    public void TampilDataString(String x, int pos){
        if (pos != -1){
            System.out.println("Kode Barang       : " + tumpukan[pos].kode);
            System.out.println("Nama Barang       : " + tumpukan[pos].nama);
            System.out.println("Kategori Barang   : " + tumpukan[pos].kategori);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilposisiString(String x, int pos){
        if(pos!= -1){
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan ");
        }
    }
    
    public int CariBarangNama(String cari2){
        int posisi = -1;
        for(int j = 0; j<tumpukan.length; j++){
            if (tumpukan[j] != null && tumpukan[j].nama.equalsIgnoreCase(cari2)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
```
### OUTPUT CARI BARANG DENGAN MENGGUNAKAN NAMA BARANG
```
    Tentukan Kapasitas Gudang: 12
    Kapasitas gudang saat ini adalah 12

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 23
    Masukkan nama barang  : Bakso
    Masukkan nama kategori: Makanan
    Barang Bakso berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 67
    Masukkan nama barang  : Sweater
    Masukkan nama kategori: Pakaian
    Barang Sweater berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 1
    Masukkan kode barang  : 33
    Masukkan nama barang  : Pulpen
    Masukkan nama kategori: Peralatan Sekolah
    Barang Pulpen berhasil ditambahkan ke Gudang

    Menu:
    1. Tambah Barang
    2. Ambil Barang
    3. Tampilkan Tumpukan Barang
    4. Lihat Barang Teratas
    5. Lihat Barang Terbawah
    6. Cari Barang
    7. Keluar
    Pilih operasi: 6
    Cari Barang Berdasarkan:
    1. Kode Barang
    2. Nama barang
    Masukkan Pilihan Anda: 2
    =============================
    Pencarian berdasarkan Nama Barang
    Masukkan nama barang: sweater
    Data: sweater ditemukan pada indeks 1
    Kode Barang       : 67
    Nama Barang       : Sweater
    Kategori Barang   : Pakaian
```
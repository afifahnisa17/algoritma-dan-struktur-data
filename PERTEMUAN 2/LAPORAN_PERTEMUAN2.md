
<h1 align="center">LAPORAN ALGORITMA DAN STRUKTUR DATA
PERTEMUAN 2 

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



## 2.1 Percobaan 1: Deklarasi Class, Atribut, dan Method
## 2.1.1 Langkah Percobaan
### Kode program:
<img src="picture/Buku03.png">

## 2.1.2 Verifikasi Hasil Percobaan
<img src="picture/errorBuku03.png">

## 2.1.3 Pertanyaan
### 1. &nbsp;&nbsp;Sebutkan dua karakteristik class atau object!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban: 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Class merupakan objek yang masih berupa struktur/perencanaan.
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- Objek merupakan class yang berhasil direalisasikan.

### 2.&nbsp;&nbsp; Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban: 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Class buku memiliki 5 atribut, yaitu :
- judul = String
- pengarang = String
- halaman = int
- stok = int 
- harga = int

### 3.&nbsp;&nbsp; Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban: 
Ada 4 method yang dimiliki class tersebut, yaitu: 
- void tampilInformasi() 
- void terjual(int jml) 
- void restock(int jml) 
- void gantiHarga(int hrg) 

### 4. &nbsp;&nbsp; Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban: 
<img src="picture/modifTerjual..png">

### 5. &nbsp;&nbsp; Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
Karena hanya terdapat satu parameter yang dibutuhkan untuk method restock() yaitu bilangan int.

## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
## 2.2.1 Langkah-langkah Percobaan
### Kode Program:
<img src="picture/BukuMain03.png">

## 2.2.2 Verifikasi Hasil Percobaan
<img src="picture/outputBukuMain3.png">

## 2.2.3 Pertanyaan

### 1. &nbsp;&nbsp; Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
Berikut adalah baris program yang digunakan untuk proses instansiasi:
<img src="picture/instansiasi.png">

    Nama object yang dihasilkan adalah bk1

### 2.&nbsp;&nbsp; Bagaimana cara mengakses atribut dan method dari suatu objek?
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
    Cara mengakses atribut yaitu dengan memberikan titik setelah nama objek tanpa spasi.

### 3.&nbsp;&nbsp; Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
Pada method yang pertama, kode program mengikuti data yang berada diatas method tampilInformasi() pertama, sementara pada method yang kedua, kode program membaca data dibawah mathod tampilInformasi() pertama sehingga menghasilkan hasil yang berbeda. 

## 2.3 Percobaan 3: Membuat Konstruktor
## 2.3.1 Langkah-langkah Percobaan

### 1. Menambahkan dua method di dalam class buku yang terdiri dari datu konstruktor default dan satu konstruktor berparameter.
### Kode Program
<img src="picture/tambah2Method.png">

### 2. Menambahkan object lagi bernama bk2
### Kode Program
<img src="picture/tambahBk2.png">

## 2.3.2 Verifikasi Hasil percobaan 
<img src="picture/outputPercobaan3.png">

## 2.3.3 2.3.3 Pertanyaan
### 1. &nbsp;&nbsp;Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
Berikut adalah kode program yang mendeklarasikan konstruktor berparameter.
<img src="picture/methodParameter.png">

### 2. &nbsp;&nbsp; Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?
<img src="picture/Bk2.png">

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
    Baris program tersebut dapat langsung memasukkan value secara otomatis karena terhubung dengan method berparameter. Method berparameter dapat mempersingkat kode progfam sehingga kode lebih efisien.

### 3. &nbsp;&nbsp; Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
Berikut adalah hasil setelah konstruktor default dihapus pada class Buku03.
<img src="picture/errorKonstruktor.png">
Untuk mengatasi hal tersebut, maka kita harus menambah parameter pada konstruktor yang berada pada BukuMain.

### 4.&nbsp;&nbsp; Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
Setelah melakukan instansiasi object, maka method dalam class Buku tidak harus dipanggil secara berurutan karena terpanggilnya method tergantung dari method yang kita masukkan terlebih dahulu dalam class BukuMain.

### 5.&nbsp;&nbsp; Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku!
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jawaban:
### Kode Program
<img src="picture/methodBaruMahasiswa.png">

## 2.4 Latihan Praktikum

### 1. &nbsp;&nbsp;Membuat class Buku yang telah dibuat dengan menambahkan tiga method yaitu hitungHargaTotal(), hitungDiskon(), dan hitungHargaBayar().
### Kode Program
<img src="picture/praktikum1.png">

### Output:
<img src="picture/jawaban soal1.png">

### &nbsp;&nbsp;2. Membuat Game Dragon:
### Kode Program
<img src="picture/dragon.png">
<img src="picture/dragonmain.png">

### Output:
<img src="picture/OutputGame.png">

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

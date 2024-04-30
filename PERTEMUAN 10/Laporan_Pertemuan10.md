<h1 align="center">LAPORAN ALGORITMA DAN STRUKTUR DATA
PERTEMUAN  10 - QUEUE

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

## 10.2 PRAKTIKUM 1
## 10.2.1 Langkah-Langkah Percobaan
### Class QueueMain

```java
    package Praktikum1;
    import java.util.Scanner;

    public class QueueMain {
        public static void menu() {
            System.out.println("Masukkan operasi yang diinginkan: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("--------------------------");
        }

        public static void main(String[] args) {
            Scanner sc03 = new Scanner(System.in);
            System.out.print("Masukkan kapasitas queue: ");
            int n = sc03.nextInt();

            Queue Q = new Queue(n);
            int pilih;

            do {
                menu();
                pilih = sc03.nextInt();
                switch (pilih){
                    case 1:
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc03.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;

                    case 2:
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0){
                            System.out.println("Data yang dikeluarkan");
                            break;
                        }

                    case 3:
                        Q.print();
                        break;
                    
                    case 4:
                        Q.peek();
                        break;

                    case 5:
                        Q.clear();
                        break;
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        }
    }

```java
    package Praktikum1;

    public class Queue {
        int[] data;
        int front;
        int rear;
        int size;
        int max;

        public Queue(int n){
            max = n;
            data = new int[max];
            size = 0;
            front = rear = -1;
        }

        public boolean IsEmpty(){
            if (size == 0){
                return true;
            } else {
                return false;
            }
        }

        public boolean IsFull(){
            if (size == max){
                return true;
            } else {
                return false;
            }
        }


        public void peek(){
            if (!IsEmpty()){
                System.out.println("Elemen Terdepan: " + data[front]);
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void print(){
            if (IsEmpty()){
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear){
                    System.out.println(data[i] + " ");
                    i = (i + 1) % max;
                }
                System.out.println(data[i] + " ");
                System.out.println("Jumlah elemen = " + size);
            }
        }

        public void clear() {
            if (!IsEmpty()){
                front = rear = -1;
                size = 0;
                System.out.println("Queue berhasil dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
            }
        }

        public void Enqueue (int dt) {
            if (IsFull()) {
                System.out.println("Queue sudah penuh");
            } else {
                if (IsEmpty()){
                    front = rear = 0;
                } else {
                    if (rear == max - 1) {
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                data[rear] = dt;
                size++;
            }
        }

        public int Dequeue(){
            int dt = 0;
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                dt = data[front];
                size--;
                if(IsEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max -1){
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return dt;
        }
    }
```
### Class Queue
## 10.2.2 Verifikasi Hasil Percobaan
```
    Masukkan kapasitas queue: 4
    Masukkan operasi yang diinginkan: 
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    --------------------------
    1
    Masukkan data baru: 15
    Masukkan operasi yang diinginkan: 
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    --------------------------
    1
    Masukkan data baru: 31
    Masukkan operasi yang diinginkan:
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    --------------------------
    4
    Elemen Terdepan: 15
    Masukkan operasi yang diinginkan:
    1. Enqueue
    2. Dequeue
    3. Print
    4. Peek
    5. Clear
    --------------------------
    4
    Elemen Terdepan: 15
```

## 10.2.3 Pertanyaan
### 1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
### Jawaban:
Pada konstruktor, nilai awal atribut front dan rear diatur menjadi -1 karena dalam struktur data queue, -1 menandakan bahwa antrian kosong. Sedangkan atribut size diatur menjadi 0 karena pada awalnya tidak ada elemen yang masuk ke dalam antrian.

### 2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
    if (rear == max - 1) {
        rear = 0;
```
### Jawaban:
Potongan kode if (rear == max - 1) { rear = 0; } digunakan untuk menangani kondisi di mana rear (ujung belakang) queue sudah mencapai batas maksimum (max - 1). Jika kondisi ini terpenuhi, rear diatur kembali ke indeks awal (0), sehingga elemen dapat dimasukkan ke dalam queue dari awal.

### 3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
    if (front == max - 1) {
        front = 0;
```
### Jawaban:
Potongan kode if (front == max - 1) { front = 0; } digunakan untuk menangani kondisi di mana front (ujung depan) queue sudah mencapai batas maksimum (max - 1). Jika kondisi ini terpenuhi, front diatur kembali ke indeks awal (0), sehingga elemen dapat dikeluarkan dari queue dari awal.

### 4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
### Jawaban:
Pada method print, proses perulangan dimulai dari nilai front karena front menunjukkan pada indeks elemen terdepan dalam queue. Dengan memulai perulangan dari nilai front, kita dapat memastikan bahwa elemen-elemen yang dicetak dimulai dari elemen terdepan dan diurutkan sesuai dengan struktur queue.

### 5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
```java
    i = (i+1) %max;
```
### Jawaban:
Potongan kode i = (i+1) % max; digunakan untuk memindahkan indeks i ke elemen berikutnya dalam queue dengan memanfaatkan operator modulo (%). Ini berguna karena ketika i mencapai batas maksimum (max - 1), operasi i+1 akan membuat i kembali ke indeks awal (0), memungkinkan perulangan queue berlanjut.

### 6. Tunjukkan potongan kode program yang merupakan queue overflow!
### Jawaban:
Queue overflow terjadi ketika mencoba menambahkan elemen baru ke dalam queue yang sudah penuh. Potongan kode program yang menyebabkan overflow adalah saat memanggil method Enqueue ketika queue sudah penuh, yaitu ketika kondisi IsFull() bernilai true.

### 7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan.
### Jawaban:
Untuk menghentikan program saat terjadi queue overflow dan queue underflow, kita dapat menambahkan perintah System.exit(0); setelah mencetak pesan informasi pada kondisi tersebut.
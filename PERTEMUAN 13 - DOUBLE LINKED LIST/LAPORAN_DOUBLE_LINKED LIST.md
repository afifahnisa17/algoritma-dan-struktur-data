<h1 align="center">LAPORAN ALGORITMA DAN STRUKTUR DATA
PERTEMUAN  13 - DOUBLE LINKED LIST

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

## 12.2 Kegiatan Praktikum 1
## 12.2.1 Tahapan Percobaan
### Class Node
```java
    package doublelinkedlists;

    public class Node {
        int data;
        Node prev, next;

        Node(Node prev, int data, Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }
```
### Class DoubleLinkedLists
```java
    package doublelinkedlists;

    public class DoubleLinkedLists {
        Node head;
        int size;

        public DoubleLinkedLists(){
            head = null;
            size = 0;
        }

        public boolean isEmpty(){
            return head == null;
        }

        public void addFirst(int item){
            if(isEmpty()){
                head = new Node(null, item, null);
            } else {
                Node newNode = new Node(null, item, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast (int item){
            if(isEmpty()){
                addFirst(item);
            } else {
                Node current = head;
                while (current.next != null){
                    current = current.next;
                }
                Node newNode = new Node(current, item, null);
                current.next = newNode;
                size++;
            }
        }

        public void add(int item, int index) throws Exception {
            if(isEmpty()){
                addFirst(item);
            } else if (index < 0 || index > size){
                throw new Exception("Nilai indeks di luar batas");
            } else {
                Node current = head;
                int i = 0;
                while (i < index){
                    current = current.next;
                    i++;
                } 
                if(current.prev == null){
                    Node newNode = new Node(null, item, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node newNode = new Node(current.prev, item, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    newNode.prev.next = newNode;
                    current.prev = newNode;
                }
            }
            size++;
        }

        public int size(){
            return size;
        }

        public void clear(){
            head = null;
            size = 0;
        }

        public void print(){
            if(!isEmpty()){
                Node tmp = head;
                while (tmp != null){
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
                System.out.println("\nberhasil diisi");
            } else {
                System.out.println("Linked lists Kosong");
            }
        }
    }
```
### Class DoubleLinkedListMain
```java
    package doublelinkedlists;

    public class DoubleLinkedListMain {
        public static void main(String[] args) throws Exception {
            DoubleLinkedLists dll = new DoubleLinkedLists();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("======================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("======================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("======================================");
            dll.clear();
            dll.print();
            System.out.println("Size: " + dll.size());
        }
    }
```
## 12.2.2 Verifikasi Hasil Percobaan
```
    Linked lists Kosong
    Size: 0
    ======================================
    7       3       4
    berhasil diisi
    Size: 3
    ======================================
    7       40      3       4
    berhasil diisi
    Size: 4
    ======================================
    Linked lists Kosong
    Size: 0
    PS D:\algoritma-dan-struktur-data\PERTEMUAN 13 - DOUBLE LINKED LIST>
```

## 12.2.3 Pertanyaan Percobaan
### 1. Jelaskan perbedaan antara single linked list dengan double linked lists!
### Jawaban: 
```
Dalam single linked list, tidak terdapat Node previous dan hanya memuat Node next. Selain itu, dalam single linked list, terdapat Pointer tail, sedangkan pada double linked list tidak terdapat pointer tail. 
```
## 2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut?
### Jawaban: 
``` Atribut next berfungsi untuk menunjukkan node setelahnya, sedangkan pointer previous berfungsi untuk menjunjuk node sebelumnya.
```
## 3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
```java
    public DoubleLinkedLists(){
            head = null;
            size = 0;
        }
```
### Jawaban: 
``` Inisiasi tersebut berfungsi untuk mengatur head adalah nol dan size berupa nol karena belum ada data satupun yang terdapat pada linked list.
```
### 4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?
```java
    Node newNode = new Node(null, item, head);
```
### Jawaban: 
```
Karena method addFirst berfungsi untuk menambahkan data ke posisi index null dari linked list. Maka dari itu, konstruktor dari node previous berisi null karena elemen ke-0 pastinya tidak memiliki previous.
```
### 5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
### Jawaban: 

### 6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan parameter prev dengan current, dan next dengan null?
```java
    Node newNode = new Node(current, item, null);
```
### Jawaban: 
```
Method addLast() berfungsi untuk menambahkan item pada index terakhir. Maka dari itu, current adalah nilai dari index paling akhir saat ini, item adalah nilai yang akan ditambahkan, sedangkan null adalah pointer next. Next bernilai null karena setelah elemen terakhir, tidak terdapat node lagi.
```
### 7. Pada method add(), terdapat potongan kode program sebagai berikut. Jelaskan maksud dari bagian yang ditandai dengan kotak kuning.
```java
    if(current.prev == null){
        Node newNode = new Node(null, item, current);
        current.prev = newNode;
        head = newNode;
    }
```
### Jawaban: 
```
Jika elemen saat ini adalah elemen pertama, maka program akan membuat node baru 'newNode'  menjadi elemen pertama. Ubah elemen sebelumnya (yang bernilai null) menjadi 'newNode' dan perbarui head yang tadinya null ke 'newNode' juga
```
## 12.3 Kegiatan Praktikum 2
## 12.3.1 Tahapan Percobaan
### Class DoubleLinkedLists
```java
public void removeFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
```
### Class DoubleLinkedListsMain
```java
    dll.addLast(50);
    dll.addLast(40);
    dll.addLast(10);
    dll.addLast(20);
    dll.print();
    System.out.println("Size: " + dll.size());
    System.out.println("======================================");
    dll.removeFirst();
    dll.print();
    System.out.println("Size: " + dll.size());
    System.out.println("======================================");
    dll.removeLast();
    dll.print();
    System.out.println("Size: " + dll.size());
    System.out.println("======================================");
    dll.remove(1);
    dll.print();
    System.out.println("Size: " + dll.size());
```
## 12.3.2 Verifikasi Hasil Percobaan
```
    50      40      10      20
    berhasil diisi
    Size: 4
    ======================================
    40      10      20
    berhasil diisi
    Size: 3
    ======================================
    40      10
    berhasil diisi
    Size: 2
    ======================================
    40
    berhasil diisi
    Size: 1
    PS D:\algoritma-dan-struktur-data\PERTEMUAN 13 - DOUBLE LINKED LIST>
```
## 12.3.3 Pertanyaan Percobaan
### 1. Apakah maksud statement berikut pada method removeFirst()?
```java
    head = head.next;
    head.prev = null;
```
### Jawaban:
```
Jika ingin menghapus index yang paling awal, dan memiliki size lebih dari 1. Maka, pointer head dipindahkan ke index selanjutnya, serta head selanjutnya diubah nilainya menjadi nol.
``` 
### 2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
### Jawaban: 
```
Jika linked list kosong, maka akan menampilkan tulisan throw Exception. Jika posisi setelah head = null, maka head diubah nilainya menjadi null. Jika, posisi saat ini ditambah 2 posisi setelahnya tidak sama dengan null, maka akan terjadi perulangan untuk mencari posisi terakhir. Jika sudah menemukan posisi terakhir, maka index terakhir dihapus.
```
### 3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
```java
    Node tmp = head.next;
    tmp.next = tmp.next;
    tmp.next.prev= head;
```
### Jawaban:
```
Karena kode tersebut kurang spesifik untuk struktur data double linked list, dimana dalam struktur data ini membutuhkan pointer prev dan next. Dalam kode tersebut, hanya terdapat pointer next dan tidak terdapat pointer previous sehingga jika salah satu data di tengah list dihapus, maka kedua data yang berada diantara data yang dihapus tidak dapat terhubung.
```
### 4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
```java
    current.prev.next = current.next;
    current.next.prev = current.prev;
```
### Jawaban: 
```
Jika elemen saat ini berada di tengah list, hubungkan elemen sebelumnya dan elemen sesudahnya. Dengan demikian, elemen saat ini dihapus dari list.
```
## 12.4 Kegiatan Praktikum 3
## 12.4.1 Tahapan Percobaan
### Class DoubleLinkedLists
```java
    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list kosong");
        } 
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
```
### Class DoubleLinkedListsMain
```java
    dll.print();
    System.out.println("Size: " + dll.size());
    System.out.println("======================================");
    dll.addFirst(3);
    dll.addLast(4);
    dll.addFirst(7);
    dll.print();
    System.out.println("Size: " + dll.size());
    System.out.println("======================================");
    dll.add(40, 1);
    dll.print();
    System.out.println("Size: " + dll.size());
    System.out.println("======================================");
    System.out.println("Dat awal pada Linked Lists adalah   : " + dll.getFirst());
    System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
    System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
```
## 12.4.2 Verifikasi Hasil Percobaan
```
    Linked lists Kosong
    Size: 0
    ======================================
    7       3       4
    berhasil diisi
    Size: 3
    ======================================
    7       40      3       4
    berhasil diisi
    Size: 4
    ======================================
    Data awal pada Linked Lists adalah          : 7
    Data akhir pada Linked Lists adalah         : 4
    Data indeks ke-1 pada Linked Lists adalah   : 40
    PS D:\algoritma-dan-struktur-data\PERTEMUAN 13 - DOUBLE LINKED LIST> 
```
## 12.4.3 Pertanyaan Percobaan
### 1. Jelaskan method size() pada class DoubleLinkedLists!
### Jawaban: 
```
Method size() berfungsi untuk memperbarui jumlah data dalam linked list secara otomatis.
```
### 2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1!
### Jawaban:
```
Supaya indeks dapat dimulai dari indeks ke-1, maka pada method 'add' dan 'remove', perlu dimodifikasi sehingga indeks yang diterima adalah indeks berbasis 1.  
```
### 3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
### Jawaban:
```
- DLL memiliki dua pointer (prev dan next), sedangkan SLL hanya memiliki satu (next).
- Pada DLL, kita mengatur kedua pointer (prev dan next) untuk node-node terkait, sedangkan pada SLL hanya mengatur next.
```
### 4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
```java
    public boolean isEmpty() {
        if (size ==0){
            return true;
        } else {
            return false;
        }
    }
```
```java
    public boolean isEmpty(){
        return head == null;
    }
```
### Jawaban:
```
Pada method isEmpty() yang pertama, jika size bernilai nol, maka nilai kembalian adalah benar, dan jika size tidak sama dengan nol, maka nilai kembalian adalah salah.

Pada method isEmpty() yang kedua, method tersebut memiliki nilai kembalian head = nol. 
```
## 12.5 Praktikum
### 1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang telah divaksinasi di menu Hapus Data(2) harus ada)
### Kode Program
### Class Vaksinasi
```java
    package Vaksinasi;

    public class Vaksinasi {
        int nomor;
        String nama;
        Vaksinasi prev, next;

        Vaksinasi(Vaksinasi prev, int nomor, String nama, Vaksinasi next){
            this.nomor = nomor;
            this.nama = nama;
            this.prev = prev;
            this.next = next;
        }
    }
```
### Class VaksinasiDLL
```java
    package Vaksinasi;

    public class VaksinasiDLL {
        int size;
        Vaksinasi head;

        VaksinasiDLL(){
            head = null;
            size = 0;
        }

        public boolean isEmpty(){
            return head == null;
        }

        public void addFirst(int nomor, String nama){
            if(isEmpty()){
                head = new Vaksinasi(null, nomor, nama, null);
            } else {
                Vaksinasi newNode = new Vaksinasi(null, nomor, nama, head);
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void addLast (int nomor, String nama){
            if(isEmpty()){
                addFirst(nomor, nama);
            } else {
                Vaksinasi current = head;
                while (current.next != null){
                    current = current.next;
                }
                Vaksinasi newNode = new Vaksinasi(current, nomor, nama, null);
                current.next = newNode;
                size++;
            }
        }

        public int size() {
            return size;
        }

        public void print(){
            if(!isEmpty()){
                Vaksinasi tmp = head;
                System.out.printf("%-27s %n", "----------------------");
                System.out.println("Daftar Pengantri Vaksin");
                System.out.printf("%-27s %n", "----------------------");
                System.out.printf("| %-3s | %-12s |%n", "No.", "Nama");
                System.out.printf("%-27s %n", "----------------------");
                while (tmp != null){
                    System.out.printf("| %-3d | %-12s |%n", tmp.nomor, tmp.nama);
                    tmp = tmp.next;
                }
                System.out.printf("%-27s ","----------------------");
                System.out.println();
                System.out.println("Sisa Antrian: " + size);
                
            } else {
                System.out.println("Linked lists Kosong");
            }
        }

        public void removeFirst() throws Exception {
            Vaksinasi tmp = head;
            if (isEmpty()){
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (size == 1){
                removeLast();
                System.out.println(tmp.nama + " telah selesai divaksinasi.");
            } else {
                head = head.next;
                head.prev = null;
                size--;
                System.out.println(tmp.nama + " telah selesai divaksinasi.");
            }
        }

        public void removeLast() throws Exception {
            if (isEmpty()){
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (head.next == null){
                head = null;
                size--;
                return;
            }

            Vaksinasi current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }

    }
```

### Class VaksinasiMain
```java
    package Vaksinasi;
    import java.util.Scanner;

    public class VaksinasiMain {
        public static void main(String[] args) throws Exception {
            Scanner sc03 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);
            VaksinasiDLL antre = new VaksinasiDLL();
            boolean ulang = true;

            while(ulang){
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
                System.out.println("+++++++++++++++++++++++++++++");
                System.out.println("1. Tambah Data Penerima Vaksin");
                System.out.println("2. Hapus Data Penerima Vaksin");
                System.out.println("3. Daftar Penerima Vaksin");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan Anda: ");
                int pilihan = sc03.nextInt();

                switch(pilihan){
                    case 1 :
                        System.out.println();
                        System.out.println("+++++++++++++++++++++++++++++");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("+++++++++++++++++++++++++++++");
                        System.out.print("Nomor Antrian: ");
                        int nomor = sc03.nextInt();
                        System.out.print("Nama Penerima: ");
                        String nama = sc3.nextLine();
                        antre.addLast(nomor, nama);
                        System.out.println();
                        break;
                    
                    case 2 :
                        System.out.println();
                        antre.removeFirst();
                        System.out.println();
                        break;
                    
                    case 3:
                        System.out.println();
                        antre.print();
                        break;

                    case 4:
                        ulang = false;
                        break;
                    
                    default: 
                        System.out.println();
                        System.out.println("Pilihan Anda tidak valid.");

                }
            }

        }

    }
```
### Output
```
    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 1

    +++++++++++++++++++++++++++++
    Masukkan Data Penerima Vaksin
    +++++++++++++++++++++++++++++
    Nomor Antrian: 123
    Nama Penerima: Joko

    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 1

    +++++++++++++++++++++++++++++
    Masukkan Data Penerima Vaksin
    +++++++++++++++++++++++++++++
    Nomor Antrian: 124
    Nama Penerima: Mely

    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 1

    +++++++++++++++++++++++++++++
    Masukkan Data Penerima Vaksin
    +++++++++++++++++++++++++++++
    Nomor Antrian: 125
    Nama Penerima: Johan

    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 1

    +++++++++++++++++++++++++++++
    Masukkan Data Penerima Vaksin
    +++++++++++++++++++++++++++++
    Nomor Antrian: 146
    Nama Penerima: Rosi

    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 3

    ----------------------
    Daftar Pengantri Vaksin
    ----------------------
    | No. | Nama         |
    ----------------------
    | 123 | Joko         |
    | 124 | Mely         |
    | 125 | Johan        |
    | 146 | Rosi         |
    ----------------------
    Sisa Antrian: 4
    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 2

    Joko telah selesai divaksinasi.

    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 3

    ----------------------
    Daftar Pengantri Vaksin
    ----------------------
    | No. | Nama         |
    ----------------------
    | 124 | Mely         |
    | 125 | Johan        |
    | 146 | Rosi         |
    ----------------------
    Sisa Antrian: 3
    +++++++++++++++++++++++++++++
    PENGANTRI VAKSIN EXTRAVAGANZA
    +++++++++++++++++++++++++++++
    1. Tambah Data Penerima Vaksin
    2. Hapus Data Penerima Vaksin
    3. Daftar Penerima Vaksin
    4. Keluar
    Masukkan pilihan Anda: 4
    PS D:\algoritma-dan-struktur-data\PERTEMUAN 13 - DOUBLE LINKED LIST> 
```

## 2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara descending. Class Film wajib diimplementasikan dalam soal ini.
### Class Film
```java
    package Film;

    public class Film {
        int id;
        String judul;
        double rating;
        Film prev, next;

        Film (Film prev, int id, String judul, double rating, Film next ){
            this.prev = prev;
            this.id = id;
            this.judul = judul;
            this.rating = rating;
            this.next = next;
        }
    }
```
### Class FilmDLL
```java
    package Film;

    public class FilmDLL {
        int size;
        Film head;

        FilmDLL(){
            head = null;
            size = 0;
        }

        public boolean isEmpty(){
            return head == null;
        }

        public int size(){
            return size;
        }

        public void addFirst(int id, String judul, double rating){
            if(isEmpty()){
                head = new Film(null, id, judul, rating,  null);
                System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
            } else {
                Film newNode = new Film(null, id, judul, rating, head);
                head.prev = newNode;
                head = newNode;
                System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
            }
            size++;
        }

        public void addLast (int id, String judul, double rating){
            if(isEmpty()){
                addFirst(id, judul, rating);
                System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
            } else {
                Film current = head;
                while (current.next != null){
                    current = current.next;
                }
                Film newNode = new Film(current, id, judul, rating,  null);
                current.next = newNode;
                System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
                size++;
            }
        }

        public void add(int id, String judul, double rating, int index) throws Exception {
            if (isEmpty()) {
                addFirst(id, judul, rating);
            } else if (index < 0 || index > size) {
                throw new Exception("Nilai indeks di luar batas");
            } else if (index == size) { 
                addLast(id, judul, rating);
            } else {
                Film current = head;
                int i = 0;
                while (i < index) {
                    current = current.next;
                    i++;
                }
                Film newNode = new Film(current.prev, id, judul, rating, current);
                if (current.prev != null) {
                    current.prev.next = newNode;
                } else {
                    head = newNode; 
                }
                current.prev = newNode;
                System.out.println("Film " + judul + " telah dimasukkan dalam daftar.");
            }
            size++;
        }
        

        public void removeFirst() throws Exception {
            Film tmp = head;
            if (isEmpty()){
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (size == 1){
                removeLast();
                System.out.println(tmp.judul + " telah dihapus dari daftar.");
            } else {
                head = head.next;
                head.prev = null;
                size--;
                System.out.println(tmp.judul + " telah dihapus dari daftar.");
            }
        }

        public void removeLast() throws Exception {
            if (isEmpty()){
                throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
            } else if (head.next == null){
                head = null;
                size--;
                return;
            }

            Film current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            System.out.println(current.judul + " telah dihapus dari daftar.");
            current.next = null;
            size--;
        }

        public void remove(int index) throws Exception {
            if(isEmpty() || index >= size){
                throw new Exception("Nilai index di luar batas");
            } else if (index == 0){
                removeFirst();
            } else {
                Film current = head;
                int i = 0;
                while (i < index){
                    current = current.next;
                    i++;
                }
                if (current.next == null){
                    current.prev.next = null;
                } else if (current.prev == null){
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                System.out.println(current.judul + " telah dihapus dari daftar.");
                size--;
            }
        }

        public void print(){
            if(!isEmpty()){
                Film tmp = head;
                while (tmp != null){
                    System.out.println("ID  : " + tmp.id);
                    System.out.println("    Judul Film  : " + tmp.judul);
                    System.out.println("    IPK         : " + tmp.rating);
                    tmp = tmp.next;
                }
                
            } else {
                System.out.println("Linked lists Kosong");
            }
        }

        public int cariFilm(int cari) {
            if (isEmpty()) {
                System.out.println("Tidak ada film yang ditemukan.");
                return -1;
            }
        
            Film tmp = head;
            int posisi = -1;
            for (int j = 0; j < size; j++) {
                if (tmp.id == cari) {
                    posisi = j;
                    break;
                }
                tmp = tmp.next;
            }
        
            if (posisi != -1) {
                System.out.println("Data ID Film: " + tmp.id + " berada di node ke-" + posisi);
                System.out.println("IDENTITAS   : ");
                System.out.println("    ID Film     : " + cari);
                System.out.println("    Judul Film  : " + tmp.judul);
                System.out.println("    IMDB Rating : " + tmp.rating);
            } else {
                System.out.println("Film dengan ID " + cari + " tidak ditemukan.");
            }
        
            return posisi;
        }
        
        
        public void insertionSort() {
            if (head == null || head.next == null) {
                return; 
            }

            Film current = head.next;
            while (current != null) {
                Film nextNode = current.next;
                Film sorted = current.prev;

                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                    while (sorted != null && sorted.rating < current.rating) { 
                    sorted = sorted.prev;
                }

                if (sorted == null) {
                    current.next = head;
                    head.prev = current;
                    current.prev = null;
                    head = current;
                } else {
                    current.next = sorted.next;
                    current.prev = sorted;
                    if (sorted.next != null) {
                        sorted.next.prev = current;
                    }
                    sorted.next = current;
                }
                current = nextNode;
            }
        }
        
    }    
```
### Class FilmMain
```java
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
```
### Output:
```
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 1
    Masukkan data film posisi awal
    ID Film   : 1222
    Judul Film: Spider-Man : No Way Home 
    Rating    : 8.7
    Film Spider-Man : No Way Home telah dimasukkan dalam daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 2
    Masukkan data film posisi Akhir
    ID Film   : 1346
    Judul Film: Uncharted
    Rating    : 6.7
    Film Uncharted telah dimasukkan dalam daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 2
    Masukkan data film posisi Akhir
    ID Film   : 1765   
    Judul Film: Skyfall
    Rating    : 7.8
    Film Skyfall telah dimasukkan dalam daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 3
    Masukkan data film Urutan Tertentu
    ID Film   : 1234
    Judul Film: Death on The Nile
    Rating    : 6.6
    Data ini akan masuk di urutan ke-: 3
    Film Death on The Nile telah dimasukkan dalam daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 1567
    Pilihan Anda Tidak Valid.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 1
    Masukkan data film posisi awal
    ID Film   : 1567
    Judul Film: The Dark Knight Rises
    Rating    : 8.4
    Film The Dark Knight Rises telah dimasukkan dalam daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 7
    Cetak Data:
    ID  : 1567
        Judul Film  : The Dark Knight Rises
        IPK         : 8.4
    ID  : 1222
        Judul Film  : Spider-Man : No Way Home
        IPK         : 8.7
    ID  : 1346
        Judul Film  : Uncharted
        IPK         : 6.7
    ID  : 1765
        Judul Film  : Skyfall
        IPK         : 7.8
    ID  : 1234
        Judul Film  : Death on The Nile
        IPK         : 6.6
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 9
    ID  : 1222
        Judul Film  : Spider-Man : No Way Home
        IPK         : 8.7
    ID  : 1567
        Judul Film  : The Dark Knight Rises
        IPK         : 8.4
    ID  : 1765
        Judul Film  : Skyfall
        IPK         : 7.8
    ID  : 1346
        Judul Film  : Uncharted
        IPK         : 6.7
    ID  : 1234
        Judul Film  : Death on The Nile
        IPK         : 6.6
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 8
    Masukkan ID Film yang ingin dicari:
    1222
    Data ID Film: 1222 berada di node ke-0
    IDENTITAS   :
        ID Film     : 1222
        Judul Film  : Spider-Man : No Way Home
        IMDB Rating : 8.7
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 4
    Spider-Man : No Way Home telah dihapus dari daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 5
    Uncharted telah dihapus dari daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 6
    Masukkan index film yang ingin dihapus: 2
    Uncharted telah dihapus dari daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 7
    Cetak Data:
    ID  : 1567
        Judul Film  : The Dark Knight Rises
        IPK         : 8.4
    ID  : 1765
        Judul Film  : Skyfall
        IPK         : 7.8
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 6
    Masukkan index film yang ingin dihapus: 1
    Skyfall telah dihapus dari daftar.
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 7
    Cetak Data:
    ID  : 1567
        Judul Film  : The Dark Knight Rises
        IPK         : 8.4
    ===========================
    DAFTAR FILM LAYAR LEBAR
    ===========================
    1. Tambah Data Awal
    2. Tambah Data Akhir
    3. Tambah Data Index Tertentu
    4. Hapus Data Pertama
    5. Hapus Data Terakhir
    6. Hapus Data Tertentu
    7. Cetak
    8. Cari ID Film
    9. Urut Data Rating Film - DESC
    10. Keluar
    ===========================
    MAsukkan Pilihan Anda: 
```
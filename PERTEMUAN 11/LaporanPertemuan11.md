<h1 align="center">LAPORAN ALGORITMA DAN STRUKTUR DATA
PERTEMUAN  11 - LINKED LIST

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


## 2.1 Pembuatan Single Linked List
### Class Node
```java
    package minggu11;

    public class Node {
        int data;
        Node next;

        Node (int nilai, Node berikutnya){
            data = nilai;
            next = berikutnya;
        }

    }
```

### Class SingleLinkedList
```java
    package minggu11;

    public class SingleLinkedList {
        Node head, tail;

        boolean isEmpty(){
            return head == null;
        }

        void print(){
            if(!isEmpty()){
                Node tmp = head;
                System.out.print("Isi Linked List:      ");
                while (tmp != null){
                    System.out.print(tmp.data + "\t");
                    tmp = tmp.next;
                }
                System.out.println(" ");
            } else {
                System.out.println("linked List Kosong");
            }
        }

        void addFirst(int input){
            Node ndInput = new Node(input, null);
            if (isEmpty()){
                head = ndInput;
                tail = ndInput;

            } else {
                ndInput.next = head;
                head = ndInput;
            }
        }

        void addLast(int input) {
            Node ndInput = new Node(input, null);
            tail.next = ndInput;
            tail = ndInput;
        }

        void insertAfter(int key, int input) {
            Node ndInput = new Node(input, null);
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    if (ndInput.next == tail) {
                        tail = ndInput;
                    }
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Key " + key + " tidak ditemukan");
            }
        }
        
        void insertAt (int index, int input){
        Node temp = head;
        if (index < 0) {
            System.out.println("Indeks tidak valid!");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        }
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Indeks melebihi panjang linked list!");
            return;
        }

        temp.next = new Node(input, temp.next);
        if(temp.next.next == null){
            tail = temp.next; 
            }
        }
    }
```
## 2.1.1 Verifikasi Hasil Percobaan
```
    linked List Kosong
    Isi Linked List:      890        
    Isi Linked List:      890       760      
    Isi Linked List:      700       890     760      
    Isi Linked List:      700       999     890     760      
    Isi Linked List:      700       999     890     833     760      
    PS D:\ALGORITMA DAN STRUKTUR DATA\PERTEMUAN 11>
```
## 2.1.2 Pertanyaan
### 1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
### Jawaban: 
```
Karena belum ada data apapun yang dimasukkan dalam linked list. 
```
### 2. Jelaskan kegunaan variable temp secara umum pada setiap method!
### Jawaban: 
```
Variabel  "temp" sering digunakan untuk menyimpan referensi sementara ke node saat melakukan iterasi atau operasi tertentu, seperti pencarian, penyisipan, atau penghapusan. Dengan menggunakan "temp", kita dapat mengakses dan memanipulasi node saat ini tanpa mengubah atau kehilangan referensi ke node asli yang sedang diproses, sehingga memungkinkan untuk melakukan operasi dengan aman dan efisien.
```
### 3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut!
```java
    if(temp.next.next == null){
                tail = temp.next; 
    }
```
### Jawaban: 
```
Kode tersebut digunakan untuk memeriksa apakah node yang ditunjuk oleh `temp.next` adalah node terakhir dalam linked list atau tidak. Jika `temp.next.next` adalah `null`, ini menunjukkan bahwa `temp.next` adalah node terakhir dalam linked list, karena tidak ada node setelahnya. Dalam konteks ini, kode `tail = temp.next;` mengatur `tail` ke node terakhir dalam linked list, karena kita telah menyisipkan node baru setelah node `temp`, sehingga node baru tersebut sekarang menjadi node terakhir dalam linked list. Dengan cara ini, kita memastikan bahwa `tail` selalu menunjuk ke node terakhir yang valid dalam linked list setelah operasi penyisipan.
```
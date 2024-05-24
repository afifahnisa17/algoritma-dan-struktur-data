package Tugas2;

public class SLL_Queue {
    Node front, rear;

    //Konstruktor untuk membuat Queue Kosong
    SLL_Queue(){
        this.front = this.rear = null;
    }

    // Method untuk mencetak elemen-elemen di Queue
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            Node current = front;
            while (current != null) {
                System.out.println("Mahasiswa: " + current.mahasiswa + ", NIM: " + current.NIM + ", Nama: " + current.nama);
                current = current.next;
            }
        }
    }

    //Method untuk menambahkan elemen ke Queue
    public void enqueue(String mahasiswa, int NIM, String nama){
        Node newNode = new Node(mahasiswa, NIM, nama, null);

        //Jika Queue kosong, maka front dan rear adalah node baru
        if(this.rear == null){
            this.front = this.rear = newNode;
            return;
        }

        //Tambahkan node baru di akhir queur dan ubah rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    //Method untuk menghapus elemen dari Queue
    public Node dequeue(){
        //jika queue kosong, berikan pengecualian
        if(this.front == null){
            throw new IllegalStateException("Queue kosng!!");
        }

        Node temp = this.front;
        this.front= this.front.next;

        if(this.front == null){
            this.rear = null;
        }

        return temp;
    }

    // Method untuk memeriksa apakah queue kosong
    public boolean isEmpty() {
        return this.front == null;
    }

    // Method untuk mendapatkan elemen depan tanpa menghapusnya
    public Node peek() {
        if (this.front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return this.front;
    }
}

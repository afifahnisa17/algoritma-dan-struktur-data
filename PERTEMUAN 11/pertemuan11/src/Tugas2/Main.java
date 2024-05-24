package Tugas2;

public class Main{
    public static void main(String[] args) {
        SLL_Queue Mhs = new SLL_Queue();

        //menambahkan elemen
        Mhs.enqueue("Mhs1", 111, "Anton");
        Mhs.enqueue("Mhs2", 112, "Prita");
        Mhs.enqueue("Mhs3", 113, "Yusuf");
        Mhs.enqueue("Mhs4", 114, "Doni");
        Mhs.enqueue("Mhs5", 115, "Sari");
        Mhs.print();

        // Hapus elemen dari queue
        System.out.println();
        Node node = Mhs.dequeue();
        System.out.println("Dequeued            : " + node.mahasiswa + ", " + node.NIM + ", " + node.nama);

         // Lihat elemen depan
        node = Mhs.peek();
        System.out.println("Peek                : " + node.mahasiswa + ", " + node.NIM + ", " + node.nama);

         // Cek apakah queue kosong
        System.out.println("Apakah Quqeue Kosong? " + Mhs.isEmpty());
    }
}
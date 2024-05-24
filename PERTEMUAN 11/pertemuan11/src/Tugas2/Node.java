package Tugas2;

public class Node {
    String mahasiswa, nama;
    int NIM;
    Node next;

    Node(String mahasiswa, int NIM, String nama, Node next){
        this.mahasiswa = mahasiswa;
        this.NIM = NIM;
        this.nama= nama;
        this.next = next;
    }
}
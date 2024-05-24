package Tugas1;

public class Mhs {
    String mahasiswa, nama;
    int NIM;
    Mhs next;

    Mhs(String mahasiswa, int NIM, String nama, Mhs next){
        this.mahasiswa = mahasiswa;
        this.NIM = NIM;
        this.nama= nama;
        this.next = next;
    }

}

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

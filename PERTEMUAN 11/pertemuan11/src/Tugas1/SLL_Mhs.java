package Tugas1;

public class SLL_Mhs {
    Mhs head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Mhs tmp = head;
            while (tmp != null){
                System.out.println("Urutan      : " + tmp.mahasiswa);
                System.out.println("NIM         : " + tmp.NIM);
                System.out.println("Nama        : " + tmp.nama);
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println(" ");
        } else {
            System.out.println("linked List Kosong");
        }
    }

    public void addFirst(String mahasiswa, int NIM, String nama) {
        Mhs ndInput = new Mhs(mahasiswa, NIM, nama, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String mahasiswa, int NIM, String nama) {
        Mhs ndInput = new Mhs(mahasiswa, NIM, nama, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, String mahasiswa, int NIM, String nama) {
        Mhs ndInput = new Mhs(mahasiswa, NIM, nama, null);
        Mhs temp = head;
        do {
            if(temp.NIM == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while(temp != null);
    }
    

    public void insertAt(int index, String mahasiswa, int NIM, String nama) {
        if(index < 0) {
            System.out.println("Indeks salah!");
        } else if(index == 0) {
            addFirst(mahasiswa, NIM, nama);
        } else {
            Mhs temp = head;
            for(int i = 0; i < index - 1; i++) {
                if(temp.next == null) break;
                temp = temp.next;
            }
            temp.next = new Mhs(mahasiswa, NIM, nama, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }

}

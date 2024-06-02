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

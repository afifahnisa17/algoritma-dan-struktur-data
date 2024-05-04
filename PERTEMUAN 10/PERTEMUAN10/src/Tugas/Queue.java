package Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n){
        max = n;
        antrian = new Pembeli[max];
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

    public void Enqueue (Pembeli antri) {
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
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli Dequeue(){
        Pembeli dt = new Pembeli();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
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

    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {

            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen Terdepan: " + antrian[front].nama + " " + antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        int behind = front + (size - 1);
        if (!IsEmpty()){
            System.out.println("Elemen Terbelakang: " + antrian[behind].nama + " " + antrian[behind].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    

    public void peekPosition(String cari){
        for (int i = 0; i < size; i++) {
            if (antrian[i].nama.equals(cari)) {
                System.out.println("Pembeli " + cari + " ditemukan pada posisi: " + i+1);
                return;
            }
        }
        System.out.println("Pembeli " + cari + " tidak ditemukan dalam antrian.");
    }
    
    

    public void daftarPembeli(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            System.out.println("Daftar semua pembeli: ");
            int i = front;
            while (i != rear){
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    

}

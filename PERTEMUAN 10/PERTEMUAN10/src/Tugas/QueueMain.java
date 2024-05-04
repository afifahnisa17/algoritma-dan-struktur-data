package Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Pembeli baru");
        System.out.println("2. Pembeli keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Pembeli");
        System.out.println("5. Cek Antrian Terbelakang");
        System.out.println("6. Cari Pembeli");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 
        
        Queue antri = new Queue(jumlah);
        int pilih;
        
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); 
            switch(pilih){
                case 1:
                    System.out.print("Nama          : ");
                    String nama = sc.nextLine();
                    System.out.print("No. Hp        : ");
                    int noHp = sc.nextInt();
                    sc.nextLine(); 
                    Pembeli pembeliBaru = new Pembeli(nama, noHp);
                    antri.Enqueue(pembeliBaru);
                    break;
        
                case 2:
                    if (!antri.IsEmpty()) {
                        Pembeli pembeliKeluar = antri.Dequeue();
                        System.out.println("Antrian yang keluar: " + pembeliKeluar.nama + " " + pembeliKeluar.noHp);
                    } else {
                        System.out.println("Queue masih kosong");
                    }
                    break;
                
                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.print();
                    break;
                    
                case 5:
                    antri.peekRear();
                    break;
                    
                case 6:
                    System.out.print("Masukkan nama pembeli: ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
    
    
}

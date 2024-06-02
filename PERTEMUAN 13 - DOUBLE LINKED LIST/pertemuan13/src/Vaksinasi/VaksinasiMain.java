package Vaksinasi;
import java.util.Scanner;

public class VaksinasiMain {
    public static void main(String[] args) throws Exception {
        Scanner sc03 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        VaksinasiDLL antre = new VaksinasiDLL();
        boolean ulang = true;

        while(ulang){
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = sc03.nextInt();

            switch(pilihan){
                case 1 :
                    System.out.println();
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.print("Nomor Antrian: ");
                    int nomor = sc03.nextInt();
                    System.out.print("Nama Penerima: ");
                    String nama = sc3.nextLine();
                    antre.addLast(nomor, nama);
                    System.out.println();
                    break;
                
                case 2 :
                    System.out.println();
                    antre.removeFirst();
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println();
                    antre.print();
                    break;

                case 4:
                    ulang = false;
                    break;
                
                default: 
                    System.out.println();
                    System.out.println("Pilihan Anda tidak valid.");

            }
        }

    }

}

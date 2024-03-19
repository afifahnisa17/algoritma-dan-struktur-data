package Pangkat;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc03.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc03.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc03.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
            png[i].nilai = nilai;
            png[i].pangkat = pangkat;
        }

        System.out.println("Masukkan pilihan Anda: ");
        System.out.println("1. Menghitung Menggunakan BRUTE FORCE");
        System.out.println("2. Menghitung menggunakan DIVIDE and CONQUER");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = sc03.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i=0; i < elemen; i++){
                    System.out.println
                    ("Hasil dari "+ png[i].nilai+ " pangkat "+ png[i].pangkat+ " adalah "+ png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i=0; i < elemen; i++){
                    System.out.println
                    ("Hasil dari "+ png[i].nilai+ " pangkat "+ png[i].pangkat+ " adalah "+ png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            
            default:
                System.out.println("Mohon maaf, pilihan Anda tidak Valid.");
        }
    }
}

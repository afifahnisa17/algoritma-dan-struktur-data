package pertemuan3.src.LatihanPraktikum1;
import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG BANGUN RUANG");
        System.out.println("1. Kerucut");
        System.out.println("2. Limas Segi Empat");
        System.out.println("3. Bola");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = sc.nextInt();
        
        switch (pilihan){
            case 1:
                kerucut kerucut = new kerucut();
                System.out.print("Masukkan jari-jari: ");
                double r = sc.nextDouble();
                System.out.println("Masukkan Sisi Miring Kerucut: ");
                double s = sc.nextDouble();
        
                System.out.println("Luas permukaan kerucut: " +  kerucut.hitungLuasKerucut(s, r));
                System.out.println("Volume kerucut: " + kerucut.hitungVolume(s, r));
                break;

            case 2:
                LimasSegiEmpat LimasSegiEmpat = new LimasSegiEmpat();
                System.out.print("Masukkan sisi limas: ");
                double sisiLimas = sc.nextDouble();
                System.out.println("Tinggi limas: ");
                double TLimas= sc.nextDouble();

                System.out.println("Luas permukaan Limas: " +  LimasSegiEmpat.hitungluasPermukaanLimas(sisiLimas, TLimas));
                System.out.println("Volume kerucut: " + LimasSegiEmpat.hitungVolumeLimas(sisiLimas, TLimas));
                break;

            case 3:
                Bola bola = new Bola();
                System.out.println("Masukkan jari-jari bola: ");
                double rBola = sc.nextDouble();

                System.out.println("Luas permukaan Bola: " +  bola.hitungluasPermukaanBola(rBola));
                System.out.println("Volume kerucut: " + bola.hitungvolumeBola(rBola));
                break;
            
            default:
                System.out.println("Pilihan Anda Tidak Valid");
                break;
        }
    }
}

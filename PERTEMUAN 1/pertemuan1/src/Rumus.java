import java.util.Scanner;

public class Rumus {
    static Scanner sc = new Scanner(System.in);
    static int jarak, waktu;
    static double kecepatan;
    public static void main(String[] args) {
        System.out.println("PROGRAM MENGHITUNG RUMUS KECEPATAN, JARAK, DAN WAKTU");
        System.out.println("====================================================");
        menu();
    }

    static void menu() {
        System.out.println("Pilihan Menu: ");
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("Masukkan Pilihan Anda (1/2/3): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1: 
                System.out.println("Menghitung Kecepatan");
                System.out.print("Masukkan jarak: ");
                jarak = sc.nextInt();
                System.out.print("Masukkan Waktu: ");
                waktu = sc.nextInt();
                rumusKecepatan(jarak, waktu);
                break;

            case 2: 
                System.out.println("Menghitung Jarak");
                System.out.print("Masukkan kecepatan: ");
                kecepatan = sc.nextInt();
                System.out.print("Masukkan Waktu: ");
                waktu = sc.nextInt();
                rumusJarak(kecepatan, waktu);
                break;
            
            case 3: 
                System.out.println("Menghitung Kecepatan");
                System.out.print("Masukkan jarak: ");
                jarak = sc.nextInt();
                System.out.print("Masukkan Waktu: ");
                kecepatan = sc.nextInt();
                rumusWaktu(jarak, kecepatan);
                break;
            
            default:
                System.out.println("Pilihan Anda Tidak Valid");
            
        }
    }

    static double rumusKecepatan(int jarak, int waktu){
        double kecepatan = (double) jarak/waktu;
        System.out.println("Kecepatan : " + kecepatan + " m/s");
        return kecepatan;
    }

    static double rumusJarak(double kecepatan, int waktu){
        double jarak = (double) kecepatan*waktu;
        System.out.println("Jarak: " + jarak + " m");
        return jarak;
    }

    static double rumusWaktu(int jarak, double kecepatan){
        double waktu = jarak/kecepatan;
        System.out.println("Waktu: " + waktu + " s");
        return waktu;
    }
}

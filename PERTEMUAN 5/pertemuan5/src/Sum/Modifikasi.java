package Sum;
import java.util.Scanner;

public class Modifikasi {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        System.out.println("Program Menghitung Keuntungan Perusahaan");
        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlCompany = sc03.nextInt();

        sum modifikasi[] = new sum[jmlCompany];
        for(int i = 0; i < jmlCompany; i++){
            System.out.print("Masukkan jumlah bulan di perusahaan " + (i+1) + " :");
            int jmlBulan = sc03.nextInt();
            modifikasi[i] = new sum(jmlBulan);
            for(int j = 0; j < modifikasi[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke - "+ (j+1) + " = ");
                modifikasi[i].keuntungan[j] = sc03.nextDouble();
            }
        }

        for(int i = 0; i < modifikasi.length; i++){
            System.out.println("=============================================");
            System.out.println("Algoritma Brute Force "+ (i+1));
            System.out.println("Total Keuntungan perusahaan ke- " + (i+1)+ " selama " + modifikasi[i].elemen + " bulan adalah " + modifikasi[i].totalBF(modifikasi[i].keuntungan));
            System.out.println("=============================================");
            System.out.println("Algoritma Divide Conquer"+ (i+1));
            System.out.println("Total Keuntungan perusahaan ke-" + (i+1) + " selama " + modifikasi[i].elemen + " bulan adalah " + modifikasi[i].totalDC(modifikasi[i].keuntungan, 0, modifikasi[i].elemen-1));
        }
    }
    
}

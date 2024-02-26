import java.util.Scanner;

public class nilai {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String kualifikasi, nilaihuruf;  
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS  : ");
        int nilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS  : ");
        int nilaiUAS = sc.nextInt();
        System.out.println("==============================");

        double nilaiAkhir = (nilaiTugas * (0.2)) + (nilaiKuis* (0.2)) + (nilaiUTS * (0.3)) + (nilaiUAS * (0.4));
        System.out.println("Nilai Akhir         : " + nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaihuruf = "A";
            kualifikasi = "Sangat Baik";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaihuruf = "B+";
            kualifikasi = "Lebih dari Baik";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaihuruf ="B";
            kualifikasi ="Baik";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else if (nilaiAkhir >60 && nilaiAkhir <= 65){
            nilaihuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaihuruf = "C";
            kualifikasi = "Cukup";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaihuruf= "D";
            kualifikasi= "Kurang";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 39){
            nilaihuruf ="E";
            kualifikasi= "Gagal";
            System.out.println("Nilai Huruf         : " + nilaihuruf );
            System.out.println("Kualifikasi         : " + kualifikasi);
        } else {
            System.out.println("NILAI TIDAK VALID.");
        }

        System.out.println("==============================");
        if(nilaiAkhir > 60 && nilaiAkhir <= 100){
            System.out.println("SELAMAT, ANDA LULUS");
        } else if (nilaiAkhir >=0 && nilaiAkhir <= 60 && nilaiAkhir > 100){
            System.out.println("MOHON MAAF, ANDA TIDAK LULUS ATAU NILAI AKHIR TIDAK VALID");
        } 
        System.out.println("==============================");
    }
}
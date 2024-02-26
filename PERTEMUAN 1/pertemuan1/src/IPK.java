import java.util.Scanner;

public class IPK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nilai= new double[8];
        String[] nilaihuruf = new String[8];
        double[] bobotNilai = new double[8];
        String MK[] ={"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", 
        "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        int SKS[] = { 2, 2, 2, 3, 2, 2, 3, 2};
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        for (int i = 0; i< MK.length; i++){
            System.out.print("Masukkan Nilai Angka untuk MK " + MK[i] + " : " );
            nilai[i] = sc.nextInt();
        }

        System.out.println("==============================");
        System.out.println("     Hasil Konversi Nilai     ");
        System.out.println("==============================");

        System.out.printf("%-50s %-20s %-19s %-11s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalNilai = 0;
        for (int i = 0; i < MK.length; i++) {
            if (nilai[i] > 80 && nilai[i] <= 100){
                nilaihuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilai[i]  > 73 && nilai[i]  <= 80){
                nilaihuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilai[i]  > 65 && nilai[i]  <= 73){
                nilaihuruf[i] ="B";
                bobotNilai[i] = 3.00;
            } else if (nilai[i]  >60 && nilai[i]  <= 65){
                nilaihuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilai[i]  > 50 && nilai[i]  <= 60){
                nilaihuruf[i]= "C";
                bobotNilai[i] = 2.50;
            } else if (nilai[i]  > 39 && nilai[i] <= 50){
                nilaihuruf[i]= "D";
                bobotNilai[i]= 2.00;
            } else if (nilai[i]  >= 0 && nilai[i]  <= 39){
                nilaihuruf[i]="E";
                bobotNilai[i]= 1;
            } else {
                System.out.println("NILAI TIDAK VALID.");
            }
            
            double NxS = bobotNilai[i] * SKS[i];
            totalNilai += NxS;
            System.out.printf("%-53s %-23s %-17s %-11s%n", MK[i], nilai[i], nilaihuruf[i], bobotNilai[i]);

            if(i == MK.length - 1) {
                System.out.println("==============================");
                System.out.println("IP : " + (totalNilai/18));
            }
        }

    }
}

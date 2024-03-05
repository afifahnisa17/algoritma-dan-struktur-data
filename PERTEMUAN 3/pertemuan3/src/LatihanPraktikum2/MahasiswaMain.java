package pertemuan3.src.LatihanPraktikum2;

import java.util.Scanner;
public class MahasiswaMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM MENAMPILKAN NILAI IPK");

        Mahasiswa[] MhsArray = new Mahasiswa[3];
        for (int i = 0; i < 3; i++) {
            MhsArray[i] = new Mahasiswa();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama         : ");
            MhsArray[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM          : ");
            MhsArray[i].NIM = sc.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            MhsArray[i].jenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK          : ");
            MhsArray[i].IPK = sc.nextDouble();
            sc.nextLine(); // Membersihkan buffer setelah nextDouble()
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama            : " + MhsArray[i].nama);
            System.out.println("NIM             : " + MhsArray[i].NIM);
            System.out.println("Jenis Kelamin   : " + MhsArray[i].jenisKelamin);
            System.out.println("Nilai IPK       : " + MhsArray[i].IPK);
        }
        System.out.println();

        Mahasiswa umum = new Mahasiswa();
        System.out.println("Rata-Rata IPK: " + umum.rata2_IPK(MhsArray));
        umum.nilaiTertinggi(MhsArray);
    }
}

package pertemuan3.src.ArrayObjects;
import java.util.Scanner;

public class PersegiPanjangMain03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan berapa jumlah persegi panjang yang dimasukkan: ");
        int konfir= sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[konfir];

        for (int i = 0; i < konfir; i++){
            ppArray[i] = new PersegiPanjang();

            System.out.println("Persegi Panjang ke- " + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < konfir; i++){
            System.out.println("Persegi Panjang ke-"+ i);
            System.out.println("Panjang: "+ ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

    }
}







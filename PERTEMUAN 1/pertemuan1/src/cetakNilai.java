import java.util.Scanner;

public class cetakNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String NIM = sc.nextLine();
        String duaDigit = NIM.substring(NIM.length() - 2);
        int Digit= Integer.parseInt(duaDigit);

        System.out.println("=================");
        System.out.println("n: " + duaDigit);

        for(int i= 2; i<= Digit; i+= 2){
            if (i != 6 && i != 10) {
                System.out.print( "* " + i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}


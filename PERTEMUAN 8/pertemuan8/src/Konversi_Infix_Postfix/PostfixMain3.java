package Konversi_Infix_Postfix;
import java.util.Scanner;

public class PostfixMain3 {
    public static void main(String[] args) {
        Scanner sc3 = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (infix): ");
        Q = sc3.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix3 post = new Postfix3(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);

    }
    
}

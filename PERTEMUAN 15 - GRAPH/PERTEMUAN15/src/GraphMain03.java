import java.util.Scanner;

public class GraphMain03 {
    
    public static void main(String[] args) throws Exception{
        Scanner sc03 = new Scanner(System.in);
        Graph03 gedung = new Graph03(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan Gedung Asal: ");
        int asal = sc03.nextInt();
        System.out.print("Masukkan Gedung Tujuan: ");
        int tujuan = sc03.nextInt();
        gedung.sejalur(asal, tujuan);
        System.out.println();

        GraphMatriks03 gdg = new GraphMatriks03(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil penghapusan Edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        gdg.degreeMatriks(2);
    }
}

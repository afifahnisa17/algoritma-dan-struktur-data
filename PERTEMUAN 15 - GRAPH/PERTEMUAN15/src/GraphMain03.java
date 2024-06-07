import java.util.Scanner;

public class GraphMain03 {
    
    public static void main(String[] args) throws Exception{
        Scanner sc03 = new Scanner(System.in);
        Graph03 gedung = new Graph03(6);
        boolean graph = true;

        while(graph){
            System.out.println("==========================");
            System.out.println("           GRAPH         ");
            System.out.println("==========================");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak Edge");
            System.out.println("7. Hitung jumlah Edge dalam graph");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = sc03.nextInt();

            switch(pilihan){
                case 1: 
                    System.out.print("Masukkan Asal Edge: ");
                    int asal = sc03.nextInt();
                    System.out.print("Masukkan Tujuan Edge: ");
                    int tujuan = sc03.nextInt();
                    System.out.print("Masukkan Jarak Edge: ");
                    int jarak = sc03.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    System.out.println("Edge baru telah dimasukkan!!");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("1. Hapus semua Edge");
                    System.out.println("2. Hapus edge tertentu");
                    System.out.print("Masukkan pilihan Anda: ");
                    pilihan = sc03.nextInt();

                    switch(pilihan){
                        case 1:
                            gedung.removeAllEdges();
                            System.out.println("Semua Edge Telah dihapus!");
                            break;
                        
                        case 2:
                            System.out.println("Masukkan Edge yang ingin Anda Hapus");
                            System.out.print("Asal Edge: ");
                            asal = sc03.nextInt();
                            System.out.print("Tujuan Edge: ");
                            tujuan = sc03.nextInt();
                            gedung.removeEdge(asal, tujuan);
                            System.out.println("Edge berhasil dihapus!!");
                            break;

                        default:
                            System.out.println("Pilihan Anda tidak valid");
                            break;
                    }
                    break;

                case 3:
                    System.out.print("Masukkan degree yang ingin Anda cari: ");
                    int degree = sc03.nextInt();
                    gedung.degree(degree);
                    break;

                case 4:
                    System.out.println("Daftar Graph: ");
                    gedung.printGraph();
                    break;

                case 5:
                    System.out.println("Cek Edge: ");
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc03.nextInt();
                    gedung.cekGraph(asal, tujuan);
                    break;

                case 6:
                    System.out.print("Masukkan Gedung Asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan Gedung Tujuan: ");
                    tujuan = sc03.nextInt();
                    System.out.print("Masukkan Jarak Baru: ");
                    jarak = sc03.nextInt();
                    gedung.updateJarak(asal - 1, tujuan - 1, jarak);
                    System.out.println("Jarak baru telah di update!");
                    break;

                case 7: 
                    System.out.println("Menghitung jumlah edge dalam graph...");
                    int edgeCount = gedung.hitungEdge();
                    System.out.println("Jumlah edge dalam graf: " + edgeCount);
                    break;

                case 8: 
                    graph = false;
                    break;

                default:
                    System.out.println("Pilihan Anda tidak valid.");
                    break;
            }

        }

    }
}

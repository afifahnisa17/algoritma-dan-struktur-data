import java.util.Scanner;

public class platMobil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {{'B', 'A', 'N', 'T', 'E', 'N'},
                        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                        {'B', 'O', 'G', 'O', 'R'},
                        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                        {'S', 'E', 'M', 'A', 'R','A', 'N', 'G'},
                        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                        {'M', 'A', 'L', 'A', 'N', 'G'},
                        {'T', 'E', 'G', 'A', 'L'}};
        
        

        System.out.print("Berapa jumlah plat mobil yang ingin Anda cari: ");
        int konfirmasi = sc.nextInt();

        for (int l = 0; l< konfirmasi; l++){
            System.out.print("Masukkan kode plat mobil: ");
            char inputUser = sc.next().charAt(0);

            switch (inputUser){
                case 'A': 
                    for (int i = 0; i <=0 ; i++){
                        System.out.print("Plat " + KODE[0] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[0]. length; j++){
                            System.out.print( KOTA[i][j]);
                        }
                            System.out.println();
                    }
                    break;
    
                case 'B': 
                    for (int i = 1; i <=1; i++){
                        System.out.print("Plat " + KODE[1] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[1]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                            System.out.println();
                    }
                    break;
    
                case 'D': 
                    for (int i = 2; i <=2; i++){
                        System.out.print("Plat " + KODE[2] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[2]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                            System.out.println();
                    }
                    break;
                
                case 'E': 
                    for (int i = 3; i <=3; i++){
                        System.out.print("Plat " + KODE[3] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[3]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'F': 
                    for (int i = 4; i <=4; i++){
                        System.out.print("Plat " + KODE[4] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[4]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        System.out.println();

                    }
                    break;
                
                case 'G': 
                    for (int i = 5; i <=5; i++){
                        System.out.print("Plat " + KODE[5] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[5]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'H': 
                    for (int i = 6; i <=6; i++){
                        System.out.print("Plat " + KODE[6] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[6]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'L': 
                    for (int i = 7; i <=7; i++){
                        System.out.print("Plat " + KODE[7] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[7]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'N': 
                    for (int i = 8; i <=8; i++){
                        System.out.print("Plat " + KODE[8] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[8]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                
                case 'T': 
                    for (int i = 9; i <=9; i++){
                        System.out.print("Plat " + KODE[9] + " merupakan plat mobil di kota: ");
                        for(int j = 0; j <KOTA[9]. length; j++){
                            System.out.print(KOTA[i][j]);
                        }
                        
                    }
                    break;
                
                default:
                    System.out.println("PLAT NOMOR YANG ANDA MASUKKAN TIDAK VALID. ");

            }
            }
            
        }


    }



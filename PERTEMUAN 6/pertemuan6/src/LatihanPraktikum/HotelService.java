package LatihanPraktikum;

public class HotelService {
    Hotel namaHotel[] = new Hotel[10];
    int jml;
    
    void tambah(Hotel H){
        if(jml<namaHotel.length){
            namaHotel[jml] = H;
            jml++;
        } 
    }

    public void tampilAll(){
        for(Hotel H : namaHotel){
            if(H != null) {
                System.out.println("-----------------------------");
                System.out.println("Nama Hotel    : "+ H.nama);
                System.out.println("Kota          : "+ H.kota);
                System.out.println("Harga         : Rp"+ H.harga);
                System.out.println("Bintang       : "+ H.bintang);
                
            }
        }
    }

    void HargabubbleSort(){
        for(int i=0; i<jml-1; i++){
                        for(int j=1; j <jml -i; j++){
                                if(namaHotel[j].harga < namaHotel[j-1].harga){
                                    Hotel tmp = namaHotel[j];
                                    namaHotel[j] = namaHotel[j-1];
                                    namaHotel[j-1] = tmp;
                                }
                        }
                }
    }

    void RatingselectionSort(){
        for(int i=0; i<jml - 1; i++){
            int idxMax = i;
            for(int j = i+1; j < jml; j++){
                    if(namaHotel[j]. bintang > namaHotel[idxMax].bintang){
                            idxMax = j;
                    }
            }
            // swap
            Hotel tmp = namaHotel[idxMax];
            namaHotel[idxMax] = namaHotel[i];
            namaHotel[i] = tmp;
    }
    }
}

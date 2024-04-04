package TestSearching;

public class PencarianBuku03 {
    Buku listBk[] = new Buku[5];
    int idx;

    void tambah(Buku m){
        if(idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j<listBk.length; j++){
            if(listBk[j].kodeBuku == cari){
                posisi = j;
                break;
                
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if(pos!= -1){
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan ");
        }
    }

    public void TampilData(int x, int pos){
        if (pos != -1){
            System.out.println("Kode Buku       : " + x);
            System.out.println("Judul           : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit    : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang       : " + listBk[pos].pengarang);
            System.out.println("Stock           : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        for(int i=0; i<listBk.length-1; i++){
            for(int j=1; j <listBk.length -i; j++){
                if(listBk[j].kodeBuku < listBk[j-1].kodeBuku){
                    Buku tmp = listBk[j];
                    listBk[j] = listBk[j-1];
                    listBk[j-1] = tmp;
                }
            }
        }

        if (right >= left){
            mid = (left + right)/2;
            if (cari == listBk[mid].kodeBuku){
                return mid;
            } else if ( listBk[mid].kodeBuku > cari){
                return FindBinarySearch(cari, left, mid);
            } else {
                return FindBinarySearch(cari, mid, right);
            }
        }
        return -1;
    }

    public Buku FindBuku(int cari){
        for(int j = 0; j<listBk.length; j++){
            if(listBk[j].kodeBuku == cari){
                return listBk[j];
                
            }
        }
        return null;
    }
}


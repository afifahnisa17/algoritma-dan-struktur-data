package ModifikasiBuku;

public class ModifikasiPencarianBuku03 {
    ModifikasiBuku listBk[] = new ModifikasiBuku[5];
    int idx;

    void tambah(ModifikasiBuku m){
        if(idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (ModifikasiBuku m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for(int j = 0; j<listBk.length; j++){
            if(listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
                
            }
        }
        return posisi;
    }

    public void Tampilposisi(String x, int pos){
        if(pos!= -1){
            System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan ");
        }
    }

    public void TampilData(String x, int pos){
        if (pos != -1){
            for (int i = pos; i < listBk.length; i++) {
                System.out.println("Kode Buku       : " + listBk[pos].kodeBuku);
                System.out.println("Judul           : " + listBk[pos].judulBuku);
                System.out.println("Tahun Terbit    : " + listBk[pos].tahunTerbit);
                System.out.println("Pengarang       : " + listBk[pos].pengarang);
                System.out.println("Stock           : " + listBk[pos].stock);
            }
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public String FindBinarySearch(String cari, int left, int right) {
        boolean isSorted = false;
        for (int i = 0; i < idx - 1; i++) {
            if (listBk[i].kodeBuku.compareTo(listBk[i + 1].kodeBuku) > 0) {
                isSorted = false;
                break;
            } else {
                isSorted = true;
            }
        }

        if (!isSorted) {
            // Bubble sort untuk mengurutkan array
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 1; j < idx - i; j++) {
                    if (listBk[j].kodeBuku.compareTo(listBk[j - 1].kodeBuku) < 0) {
                        ModifikasiBuku tmp = listBk[j];
                        listBk[j] = listBk[j - 1];
                        listBk[j - 1] = tmp;
                    }
                }
            }
        }

        // Pencarian biner
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = cari.compareTo(listBk[mid].kodeBuku);
            
            if (compareResult == 0) {
                return listBk[mid].kodeBuku;
            } else if (compareResult < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Jika elemen tidak ditemukan
    }
    
    public ModifikasiBuku FindBuku(String cari){
        for(int j = 0; j<listBk.length; j++){
            if(listBk[j].kodeBuku.equals(cari)){
                return listBk[j];
                
            }
        }
        return null;
    }

    public ModifikasiBuku[] FindJudulBuku(String cari) {
        ModifikasiBuku[] foundBooks = new ModifikasiBuku[listBk.length];
        int count = 0;

        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(cari)) {
                foundBooks[count] = listBk[j];
                count++;
            }
        }

        if (count > 0) {
            ModifikasiBuku[] result = new ModifikasiBuku[count];
            System.arraycopy(foundBooks, 0, result, 0, count);
            return result;
        } else {
            return null;
        }
    }

    public void findAllJudulBukuBinarySearch(String cari, int left, int right) {
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i=0; i<listBk.length-1; i++){
            for(int j=1; j <listBk.length -i; j++){
                if(listBk[j].judulBuku.compareTo(listBk[j - 1].judulBuku) < 0){
                    ModifikasiBuku tmp = listBk[j];
                    listBk[j] = listBk[j-1];
                    listBk[j-1] = tmp;
                }
            }
        }
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.compareTo(cari) == 0) {
                firstIndex = mid;
                lastIndex = mid;
                // Temukan indeks pertama
                while (firstIndex > left && listBk[firstIndex - 1].judulBuku.compareTo(cari) == 0) {
                    firstIndex--;
                    System.out.println("===================================");
                }
                // Temukan indeks terakhir
                while (lastIndex < right && listBk[lastIndex + 1].judulBuku.compareTo(cari) == 0) {
                    lastIndex++;
                }
                break;
            } else if (listBk[mid].judulBuku.compareTo(cari) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        if (firstIndex != -1 && lastIndex != -1) {
            boolean multipleBooksFound = firstIndex != lastIndex;
            for (int i = firstIndex; i <= lastIndex; i++) {
                if (listBk[i].judulBuku.equals(cari)) {
                    System.out.println("Kode Buku       : " + listBk[i].kodeBuku);
                    System.out.println("Judul           : " + listBk[i].judulBuku);
                    System.out.println("Tahun Terbit    : " + listBk[i].tahunTerbit);
                    System.out.println("Pengarang       : " + listBk[i].pengarang);
                    System.out.println("Stock           : " + listBk[i].stock);
                    System.out.println("===============================");
                }
            }

            if (multipleBooksFound) {
                System.out.println("Ditemukan lebih dari 1 data buku dengan judul " + cari);
            }
            
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
    

    


}


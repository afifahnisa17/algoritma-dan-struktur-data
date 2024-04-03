package GudangBarang;

public class Gudang3 {
    Barang3[] tumpukan;
    int size;
    int top;

    public Gudang3(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang3[size];
        top = -1;
    }

    public boolean cekKosong(){
        if (top == -1){
            return true;
        } else{
            return false;
        }
    }

    public boolean cekPenuh(){
        if (top == size -1){
            return true;
        } else{
            return false;
        }
    }

    public void tambahBarang(Barang3 brg){
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else{
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang3 ambiBarang(){
        if (!cekKosong()){
            Barang3 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            return delete;
        } else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang3 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang3 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for(int i = top; i >= 0; i--){
                System.out.printf("Kode %d: %s (Kateori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else{
            System.out.println("Tumpukan barang kosong.");
        }
    }
}

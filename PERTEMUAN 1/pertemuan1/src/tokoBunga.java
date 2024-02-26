public class tokoBunga {
    public static void main(String[] args) {
        System.out.print("Pendapatan Toko RoyalGarden 1: " );
        PendapatanToko(10, 5, 15, 7);
        System.out.println();
        System.out.print("Pendapatan Toko RoyalGarden 2: " );
        PendapatanToko(6, 11, 9, 12);
        System.out.println();
        System.out.print("Pendapatan Toko RoyalGarden 3: " );
        PendapatanToko(2, 10, 10, 5);
        System.out.println();
        System.out.print("Pendapatan Toko RoyalGarden 4: " );
        PendapatanToko(5, 7, 12, 9);

        System.out.println();
        System.out.println("Jumlah Stok Setiap Jenis Bunga di Toko RoyalGarden 4");
        System.out.print("Stok Bunga Aglonema: ");
        jumlahStok(5, 1);
        System.out.println();
        System.out.print("Stok Bunga Keladi  : ");
        jumlahStok(7, 2);
        System.out.println();
        System.out.print("Stok Bunga Alocasia: ");
        jumlahStok(12, 0);
        System.out.println();
        System.out.print("Stok Bunga Mawar   : ");
        jumlahStok(9, 5);
    }

    static int PendapatanToko(int Aglonema, int Keladi, int Alocasia, int Mawar){
        int TotalPendapatanToko = (75000 * Aglonema ) + (50000 * Keladi) + (60000 + Alocasia) + ((10000 * Mawar));
        System.out.print(TotalPendapatanToko);
        return TotalPendapatanToko;
    }

    static int jumlahStok(int x, int y){
        int jumlahStock = x - y;
        System.out.print(jumlahStock);
        return jumlahStock;
    }

}

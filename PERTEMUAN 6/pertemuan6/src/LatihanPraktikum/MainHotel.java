package LatihanPraktikum;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        
        Hotel Hotel1 = new Hotel("Cempaka", "Surabaya", 2000000, (byte) 2);
        Hotel Hotel2 = new Hotel("King Red", "Malang", 1200000, (byte) 1);
        Hotel Hotel3 = new Hotel("Ratu", "Kediri", 7000000, (byte) 5);
        Hotel Hotel4 = new Hotel("Melati", "Batu", 5000000, (byte) 4);
        Hotel Hotel5 = new Hotel("Front One", "Nganjuk", 4000000, (byte) 3);
        
        list.tambah(Hotel1);
        list.tambah(Hotel2);
        list.tambah(Hotel3);
        list.tambah(Hotel4);
        list.tambah(Hotel5);

        System.out.println("Harga Hotel Mulai Dari Termurah Hingga Tertinggi: ");
        list.HargabubbleSort();
        list.tampilAll();
        System.out.println();

        System.out.println("Rating Hotel Mulai Tertinggi Hingga Terendah: ");
        list.RatingselectionSort();
        list.tampilAll();


    }
}

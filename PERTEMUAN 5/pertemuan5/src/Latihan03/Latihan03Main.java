package Latihan03;

public class Latihan03Main {
    public static void main(String[] args) {
        String[] merk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Valkswagen"};
        String[] tipe = new String[]{"M2 Coupe","Fiesta ST","370Z","BRZ","Impreza WRX STI","AE86 Trueno","86/GT86", "Golf GTI"};
        String[] tahun = {"2016", "2014", "2009", "2014", "2013", "1986", "2014", "2014"};
        int[] top_acceleration = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
        double[] top_power = {728, 575, 657, 609, 703, 553, 609, 631};

        Latihan03 topTertinggi = new Latihan03();
        int maxIndex = topTertinggi.Tertinggi(top_acceleration, 0, top_acceleration.length - 1);
        int maxAcceleration = top_acceleration[maxIndex]; 

        System.out.println("Top Acceleration Tertinggi yaitu: " + maxAcceleration);
        System.out.println("Merk        : " + merk[maxIndex]);
        System.out.println("Tipe        : " + tipe[maxIndex]);
        System.out.println("Tahun       : " + tahun[maxIndex]);
        System.out.println("Top Power   : " + top_power[maxIndex]);

        Latihan03 topTerendah = new Latihan03();
        int minIndex = topTerendah.Terendah(top_acceleration, 0, top_acceleration.length - 1);
        int minAcceleration = top_acceleration[minIndex]; 

        System.out.println("Top Acceleration Terendah yaitu: " + minAcceleration);
        System.out.println("Merk        : " + merk[minIndex]);
        System.out.println("Tipe        : " + tipe[minIndex]);
        System.out.println("Tahun       : " + tahun[minIndex]);
        System.out.println("Top Power   : " + top_power[minIndex]);

        Latihan03 topPower = new Latihan03();
        double rata2_power = topPower.rataRata(top_power);
        System.out.println("Rata-rata Top Power adalah: " + rata2_power);
    }
        
        
    }


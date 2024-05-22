package motoGP_2023;

public class Node {
    String rider, nama_tim, motor;
    int poin, lap, totalPoints;
    double waktu, interval, km_per_jam;
    Node next;

    Node (String rider, String nama_tim, int lap, double waktu, double interval, double km_per_jam, int poin, String motor, Node next){
        this.rider = rider;
        this.nama_tim = nama_tim;
        this.lap = lap;
        this.waktu = waktu;
        this.interval = interval;
        this.km_per_jam = km_per_jam;
        this.motor = motor;
        this. poin = poin;
        this.next = next;
    }

}

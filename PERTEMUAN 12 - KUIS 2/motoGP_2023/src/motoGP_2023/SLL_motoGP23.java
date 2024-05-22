package motoGP_2023;

public class SLL_motoGP23 {
    Node head, tail;
    int size = 0;

    boolean isEmpty(){
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            System.out.println("                                =======================================================");
            System.out.println("                                KLASEMEN AKHIR PERTANDINGAN MOTOGP SEPANJANG TAHUN 2023");
            System.out.println("                                =======================================================");
            System.out.println();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("| %-8s | %-19s | %-27s | %-4s | %-8s | %-9s | %-8s | %-5s | %-10s |%n",
                            "Posisi", "Rider", "Nama Tim", "Lap", "Waktu", "Interval", "Km/jam", "Poin", "Motor");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            
            Node tmp = head;
            for (int i = 1; tmp != null; i++) {
                System.out.printf("| %-8d | %-19s | %-27s | %-4d | %-8.3f | %-9.3f | %-8.2f | %-5d | %-10s |%n", 
                                i, tmp.rider, tmp.nama_tim, tmp.lap, tmp.waktu, tmp.interval, tmp.km_per_jam, tmp.poin, tmp.motor);
                tmp = tmp.next;
            }
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(String rider, String nama_tim, int lap, double waktu, double interval, double km_per_jam, int poin, String motor) {
        Node newNode = new Node(rider, nama_tim, lap, waktu, interval, km_per_jam, poin, motor, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            boolean riderExists = false; // Tandai apakah pembalap sudah ada
    
            // Variabel untuk menghitung total lap, interval, waktu, dan km_per_jam
            double totalWaktu = 0.0;
            double totalInterval = 0.0;
            double totalKmPerJam = 0.0;
            int count = 0; // Variabel untuk menghitung jumlah pembalap dengan nama yang sama
    
            // Periksa apakah pembalap sudah ada dalam linked list
            while (current != null) {
                if (current.rider.equals(rider)) {
                    // Jika pembalap sudah ada, tambahkan nilai poin baru ke nilai poin yang sudah ada
                    current.poin += poin;
                    current.lap += lap;
    
                    // Update total lap, waktu, interval, dan km_per_jam
                    totalWaktu += current.waktu;
                    totalInterval += current.interval;
                    totalKmPerJam += current.km_per_jam;
                    count++;
    
                    riderExists = true;
                }
                current = current.next;
            }
    
            // Jika pembalap belum ada, tambahkan entri baru
            if (!riderExists) {
                newNode.next = head;
                head = newNode;
            } else {
                // Hitung rata-rata jika ada pembalap dengan nama yang sama
                double averageWaktu = totalWaktu / (double) count;
                double averageInterval = totalInterval / (double) count;
                double averageKmPerJam = totalKmPerJam / (double) count;
    
                // Perbarui nilai rata-rata ke pembalap dengan nama yang sama
                current = head;
                while (current != null) {
                    if (current.rider.equals(rider)) {
                        current.waktu = averageWaktu;
                        current.interval = averageInterval;
                        current.km_per_jam = averageKmPerJam;
                    }
                    current = current.next;
                }
            }
        }
    }
    
    

    void sort(String attribute) {
        if (!isEmpty()) {
            boolean swapped;
            do {
                swapped = false;
                Node current = head;
                Node prev = null;
                Node next = null;
                while (current != null && current.next != null) { 
                    next = current.next;
                    boolean condition = false;
                    
                    //Atribut digunakan untuk mengurutkan pertandingan berdasarkan kolom tertentu
                    switch (attribute.toLowerCase()) {
                        case "rider":
                            condition = current.rider.compareTo(next.rider) < 0;
                            break;
                        case "nama_tim":
                            condition = current.nama_tim.compareTo(next.nama_tim) < 0;
                            break;
                        case "lap":
                            condition = current.lap < next.lap;
                            break;
                        case "waktu":
                            condition = current.waktu < next.waktu;
                            break;
                        case "interval":
                            condition = current.interval < next.interval;
                            break;
                        case "km_per_jam":
                            condition = current.km_per_jam < next.km_per_jam;
                            break;
                        case "poin":
                            condition = current.poin < next.poin;
                            break;
                        case "motor":
                            condition = current.motor.compareTo(next.motor) < 0;
                            break;
                    }
    
                    if (condition) {
                        if (prev != null) {
                            Node tmp = next.next;
                            prev.next = next;
                            next.next = current;
                            current.next = tmp;
                        } else {
                            Node tmp = next.next;
                            head = next;
                            next.next = current;
                            current.next = tmp;
                        }
                        swapped = true;
                    }
    
                    prev = current;
                    current = current.next;
                }
                tail = current;
            } while (swapped);
        }
    }


}

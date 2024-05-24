package Tugas1;

public class Mhs_Main {
    public static void main(String[] args) {
        SLL_Mhs data = new SLL_Mhs();

        data.addFirst("Mhs1", 111, "Anton");
        data.insertAfter(111, "Mhs2", 112, "Prita");
        data.insertAt(3, "Mhs3", 113, "Yusuf");
        data.insertAfter(113, "Mhs4", 114, "Doni");
        data.addLast("Mhs5", 115, "Sari");
        data.print();
    }
}

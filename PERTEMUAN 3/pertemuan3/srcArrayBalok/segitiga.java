package pertemuan3.srcArrayBalok;
import java.lang.Math;

public class segitiga {
    public int alas;
    public int tinggi;

    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public int hitungLuas(int a, int t){
        return a*t;
    }

    public int hitungKeliling(int a, int t){
        int kelilingSegitiga = a + t + (int)Math.sqrt(a*a + t*t);
        return kelilingSegitiga;
    }
}

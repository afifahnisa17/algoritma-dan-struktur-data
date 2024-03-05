package pertemuan3.src.ArrayBalok;
import java.lang.Math;

public class segitiga {
    public int alas;
    public int tinggi;

    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public int hitungLuas(){
        int luas = (alas*tinggi)/2;
        return luas;
    }

    public int hitungKeliling(){
        int kelilingSegitiga = alas + tinggi + (int)Math.sqrt(alas*alas + tinggi*tinggi);
        return kelilingSegitiga;
    }
}

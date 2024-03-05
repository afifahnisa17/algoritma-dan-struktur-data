
package pertemuan3.src.LatihanPraktikum1;

public class Bola {
    double phi = Math.PI;
    double r;

    public double hitungluasPermukaanBola(double r){
        double luasPermukaan = 4*phi*r*r;
        return luasPermukaan;
    }

    public double hitungvolumeBola(double r){
        double volume = (4*phi*r*r)/3;
        return volume;
    }
}

package pertemuan3.src.LatihanPraktikum1;

public class kerucut {
    double phi = Math.PI;
    double s, t, r;
    
    public double hitungLuasKerucut(double s, double r){
        t = Math.sqrt(s*s - r*r);

        double luasPermukaanKerucut = (int)phi * r * s;
        return luasPermukaanKerucut;
    }

    public double hitungVolume(double s, double r){
        t = Math.sqrt(s*s - r*r);
        double VolumeKerucut =  (int)phi * r * r * t;

        return VolumeKerucut;
    }
}

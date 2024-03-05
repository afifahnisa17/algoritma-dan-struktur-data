package pertemuan3.src.LatihanPraktikum1;

public class LimasSegiEmpat {
    double sisi, Tlimas;

    public double hitungluasPermukaanLimas(double sisi, double Tlimas){
        double t = Math.sqrt((sisi/2)*(sisi/2) + Tlimas * Tlimas);
        double luaspermukaan = (sisi*sisi) + (4*(t*sisi/2));
        return luaspermukaan;
    }

    public double hitungVolumeLimas(double sisi, double Tlimas){
        double volume = (sisi*sisi *Tlimas)/3;
        return volume;
    }
}

package pertemuan3.src.LatihanPraktikum2;

public class Mahasiswa {
    public String nama;
    public String NIM;
    public String jenisKelamin;
    public double IPK;

    public double rata2_IPK(Mahasiswa[] ipkMhs){
        double total =0;
        for(int i =0; i < ipkMhs.length; i++){
            total += ipkMhs[i].IPK;
        }
        return (total/ipkMhs.length);
    }

    void nilaiTertinggi(Mahasiswa[] ipkMhs){
        double max = ipkMhs[0].IPK;
        
        for(int i=0; i<ipkMhs.length; i++){
            if(ipkMhs[i].IPK > max){
                max = ipkMhs[i].IPK;
                System.out.println("MAHASISWA DENGAN NILAI TERTINGGI");
                System.out.println("Nama Mahasiswa  : "+ ipkMhs[i].nama);
                System.out.println("NIM             : "+ ipkMhs[i].NIM);
                System.out.println("Jenis Kelamin   : "+ ipkMhs[i].jenisKelamin);
                System.out.println("Nilai IPK       : "+ max);

                }
            }
        }    
}

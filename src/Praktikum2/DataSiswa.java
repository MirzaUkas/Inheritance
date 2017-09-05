package Praktikum2;
/**
 *
 * @author MirzaUY
 */
public class DataSiswa extends Siswa{
    String kelas,sekolah;
    public DataSiswa(String nama,String kelas,int abs, String sekolah){
    super(nama,abs);
    this.kelas = kelas;
    this.sekolah = sekolah;
    }
    //Overiding
    public void data(){
    super.data();
    System.out.println("Kelas : " +this.kelas);
    System.out.println("Sekolah : " +this.sekolah);
   
    }
}

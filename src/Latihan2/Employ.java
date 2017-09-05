package Latihan2;
/**
 *
 * @author MirzaUY
 */
class Employ extends Person {
    private String noKaryawan;
    //Constructor
    public Employ(String noKaryawan, String nama,int usia){
        super(nama,usia);
        this.noKaryawan = noKaryawan;
    }
    //Method
    public void info(){
    System.out.println("No.Karyawan : " + this.noKaryawan);
    super.info();
    }
}

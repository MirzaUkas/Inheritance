/*  DOCUMENTATION
 * key "static" -> bisa dipanggil tanpa membuat objek || tidak bisa override
 * 
 */
package Latihan1;
/**
 *
 * @author MirzaUY
 */
class TestPertamaKedua {
    public static void main(String[]args){
    Kedua D2 = new Kedua(); //Membuat Objek dr Class Kedua
    D2.BacaSuper();
    D2.info();
    System.out.println("----------------------------");
    Pertama S1 = new Pertama();
    S1.terprotek();
    S1.info();
    }
}

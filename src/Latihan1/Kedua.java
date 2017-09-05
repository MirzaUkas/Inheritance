/*      DOCUMENTATION
 * key "extends" -> inheritance antara parent & child class
 */
package Latihan1;
/**
 *
 * @author MirzaUY
 */
class Kedua extends Pertama {
    private int b = 8;
  protected void BacaSuper(){
      System.out.println("Nilai b = " + b);
      terprotek();
      info();
  }  
}

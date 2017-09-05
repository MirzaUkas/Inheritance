package Latihan3;
/**
 *
 * @author MirzaUY
 */
public class Gajah extends Hewan{
    public static void testClassMethod(){
    System.out.println("The Class Method in Hewan...");    
   }
    //overriding
   public void testInstanceMethod(){
    System.out.println("The Instance Method in Gajah...");
   }
   public static void main(String[]args){
   Gajah myGajah = new Gajah();
   Hewan myHewan = myGajah;
   Hewan.testClassMethod();
   myHewan.testInstanceMethod();
   }
}

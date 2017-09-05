/* DOCUMENTATION
 *      Default||Public||Protected||Private
 *  satupackage||bedapackage||satupackage||class itu sendiri
 *             ||import||extends||
 * key "this" mengacu pada nama class diatasnya
 */
package Latihan1;
/**
 *
 * @author MirzaUY
 */
class Pertama {
    private int a = 10;
    protected void terprotek(){
        System.out.println("Method ini hanya untuk child class");   
    }
    public void info(){
    System.out.println("a = " +a);
    System.out.println("Dipanggil pada = "+ this.getClass().getName());
    }
}


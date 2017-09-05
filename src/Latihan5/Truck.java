package Latihan5;
/**
 *
 * @author MirzaUY
 */
public class Truck {
    public int cadence,gear,speed;
    public Truck(int startCadence, int startSpeed, int startGear){
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    }
    public void setCadence(int newVal){
    cadence = newVal;
    }
    public void setGear(int newVal){
    gear = newVal;
    }
    public void applybrake(int decrement){
    speed = decrement;
    }
    public void speedUp(int increment){
    speed = increment;
    }
}

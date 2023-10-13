/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Flyable extends Drivable {
    public void changeAltitude(float change);
    public float getAltitude();
    
    public class Airplane extends Vehicle implements Flyable {
   public Airplane(String make, String type, int numPassengers) {
       this.make = make;
       this.type = type;
       this.numPassengers = numPassengers;
       numWings = 2;
   }
   @Override
   public void accelerate(float speed) {
       // Implement acceleration logic for an airplane
   }
   @Override
   public void brake() {
       // Implement braking logic for an airplane
   }
   @Override
   public void turn(float angle) {
       // Implement turning logic for an airplane
   }
   @Override
   public float getDirection() {
       return direction;
   }
   @Override
   public float getSpeed() {
       return speed;
   }
   @Override
   public String getMake() {
       return make;
   }
   @Override
   public String getType() {
       return type;
   }
   @Override
   public void changeAltitude(float change) {
       // Implement altitude change logic for an airplane
   }
   @Override
   public float getAltitude() {
       return 0; // Implement altitude tracking
   }
 }
}

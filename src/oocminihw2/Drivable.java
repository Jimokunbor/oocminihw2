/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Drivable {
    public void accelerate(float speed);
    public void brake();
    public void turn(float angle);
    public float getDirection(); 
    public float getSpeed();   
    public String getMake();    
    public String getType();
    
     public class Car extends Vehicle implements Drivable {
   public Car(String make, String type, int numPassengers) {
       this.make = make;
       this.type = type;
       this.numPassengers = numPassengers;
       numWheels = 4;
   }
   @Override
   public void accelerate(float speed) {
       // Implement acceleration logic for a car
   }
   @Override
   public void brake() {
       // Implement braking logic for a car
   }
   @Override
   public void turn(float angle) {
       // Implement turning logic for a car
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
 }
}
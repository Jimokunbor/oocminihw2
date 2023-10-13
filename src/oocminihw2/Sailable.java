/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Sailable {
    /* Sets the sail to hoisted*/
    public void hoistSail();
    public void lowerSail();
    public boolean isSailHoisted();
    public void landHo();
    
    public class Sailboat extends Vehicle implements Sailable {
   public Sailboat(String make, String type, int numPassengers) {
       this.make = make;
       this.type = type;
       this.numPassengers = numPassengers;
       numSails = 1;
   }
   @Override
   public void hoistSail() {
       // Implement hoisting sail logic for a sailboat
   }
   @Override
   public void lowerSail() {
       // Implement lowering sail logic for a sailboat
   }
   @Override
   public boolean isSailHoisted() {
       // Implement sail hoist status check for a sailboat
       return false;
   }
   @Override
   public void landHo() {
       // Implement landing ho logic for a sailboat
   }
 }
}

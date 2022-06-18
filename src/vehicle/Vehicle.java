/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author shail
 */
public class Vehicle {
    private int odometer;
    private int milesPerGallon;
    private double gallonsOfGas;
    public void go (int distance){
        double gallonsConsumed = distance/ milesPerGallon;
        gallonsOfGas -=gallonsConsumed;
        odometer+=distance;
        
    }
    public int getOdometer(){
        return odometer;
    }
    public void setOdometer(int inOdometer){
        odometer= inOdometer;
    }

    /**
     * @return the milesPerGallon
     */
    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    /**
     * @param milesPerGallon the milesPerGallon to set
     */
    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    /**
     * @return the gallonsOfGas
     */
    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    /**
     * @param gallonsOfGas the gallonsOfGas to set
     */
    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    @Override
    public String toString() {
        return "Gallons Of gas  :" +   gallonsOfGas +   " Odometer : " +   odometer;
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}

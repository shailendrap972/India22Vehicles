/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicle;

import javax.swing.JOptionPane;

/**
 *
 * @author shail
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("In driver Main");
        promptUser();
     
    }
    public static void promptUser(){    
        System.out.println("In prompt User");
        System.out.println("Enter Again");
        //Create an object of type Vehicle , and store it in the variable called myVehicle
        Vehicle myVehicle =new Vehicle();
        System.out.println(myVehicle.toString());
        String strGallonsOfGas = JOptionPane.showInputDialog("Enter gallons of gas");
        double dblGallonOfGas = Double.parseDouble(strGallonsOfGas);
        myVehicle.setGallonsOfGas(dblGallonOfGas);
        final String strMilesPerGallon = JOptionPane.showInputDialog("Enter miles per Gallon");
        final int intMilesPerGallon = Integer.parseInt(strMilesPerGallon);
        myVehicle.setMilesPerGallon(intMilesPerGallon);
        
        final String strOdometer = JOptionPane.showInputDialog("Enter Odometer");
        final int intOdometer = Integer.parseInt(strOdometer);
        myVehicle.setOdometer(intOdometer);
        final String strDistanceTravelled = JOptionPane.showInputDialog("Enter distance to travel");
        final int intDistance = Integer.parseInt(strDistanceTravelled);
        System.out.println(myVehicle.toString());
        myVehicle.go(intDistance);
        System.out.println(myVehicle.toString());
        
    }
   
}

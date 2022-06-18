/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicle;

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
        
        myVehicle.setGallonsOfGas(12.0);
        myVehicle.setMilesPerGallon(20);
        myVehicle.setOdometer(10000);
        
        myVehicle.go(40);
        System.out.println(myVehicle.toString());
        
    }
   
}

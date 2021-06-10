/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalproject;

import java.util.Scanner;

/**
 *
 * @author Emilia Raya Ouriel
 */

public class Car {

    // attributes of Car
    String registrationNumber;
    String maker;
    String model;
    String milage;
    String type;
    String ac;
    String fuelType;
    String category;

    
    // default constructor
    public Car(String registrationNumber, String maker, String model, String milage, String type, String ac, String fuelType, String category) {
        this.registrationNumber = registrationNumber;
        this.maker = maker;
        this.model = model;
        this.milage = milage;
        this.type = type;
        this.ac = ac;
        this.fuelType = fuelType;
        this.category = category;
    }

    // default constructor
    public Car() {
    }

    //setter and getter
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
        this.milage = milage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    // display function
    public void printInfo(){
        System.out.println("\nRegisterarion: "+this.registrationNumber+"\nMaker: "+this.maker+"\nModel Number: "+this.model+"\nMileage: "
                +this.milage+"\nCar Type: "+this.type+"\nAircondition Info: "+this.ac+"\nFuel Type: "+this.fuelType+"\nCategory: "+this.category);
    }
    
    // add car function
    public Car addCar()
    {
        Car temCar=new Car();
        System.out.println("\n\n\t ****** You Have To Enter Car Information ***********");
        System.out.println("Enter Registration Number : ");
        Scanner input=new Scanner(System.in);
        String txt = input.nextLine();
        temCar.setRegistrationNumber(txt);
        
        System.out.println("Enter Maker : ");
         input=new Scanner(System.in);
         txt = input.nextLine();
        temCar.setMaker(txt);
        
        
        System.out.println("Enter Model Number : ");
        input=new Scanner(System.in);
        txt = input.nextLine();
        temCar.setModel(txt);
        
        System.out.println("Enter Milage : ");
        input=new Scanner(System.in);
        txt = input.nextLine();
        temCar.setMilage(txt);
        
        
        System.out.println("Enter Car Type : ");
        input=new Scanner(System.in);
        txt = input.nextLine();
        temCar.setType(txt);
        
        
        System.out.println("Enter Aircondition Info : ");
        input=new Scanner(System.in);
        txt = input.nextLine();
        temCar.setAc(txt);
        
        System.out.println("Enter Fuel Type : ");
        input=new Scanner(System.in);
        txt = input.nextLine();
        temCar.setFuelType(txt);
        
        System.out.println("Enter Category : ");
        input=new Scanner(System.in);
        txt = input.nextLine();
        temCar.setCategory(txt);
        
        return temCar;
    }
    
}

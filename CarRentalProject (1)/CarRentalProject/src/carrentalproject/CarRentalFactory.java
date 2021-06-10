/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalproject;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRentalFactory {

   
    // list to store customer data
    ArrayList<Customer> customer;
    //list to maintain car data
    ArrayList<Car> car;
    //attributes of this class
    String rentalDescription;
    int rentalDuration;
    int perDayPayment;
    int noOfDays;

    // default constructor
    public CarRentalFactory() {
        car = new ArrayList<Car>();
        customer = new ArrayList<Customer>();
        this.rentalDescription = null;
        this.rentalDuration = 0;
        this.perDayPayment = 0;
        this.noOfDays = 0;
    }

    
    //parameterized constructor
    public CarRentalFactory(String rentalDescription, int rentalDuration, int perDayPayment, int noOfDays) {
        this.rentalDescription = rentalDescription;
        this.rentalDuration = rentalDuration;
        this.perDayPayment = perDayPayment;
        this.noOfDays = noOfDays;
        car = new ArrayList<Car>();
        customer = new ArrayList<Customer>();
    }

    
    
    // add car function to access the add function of class car
    public void addCar() {
        // create new instance of car
        Car temcar = new Car();
        car.add(temcar.addCar());
        System.out.println("\n\n******Car Added Successfully**********");
    }

    
    // edit car function to access the edit function of class car
    public void editCar() {

        System.out.println("Enter Registration Number : ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int index = -1;
        for (int i = 0; i < car.size(); i++) {
            if (txt.matches(car.get(i).registrationNumber)) {
                index = i;
                break;
            }
        }
        
        // taking the updated inputs
        car.get(index).setRegistrationNumber(txt);
        System.out.println("Enter Maker : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setMaker(txt);

        System.out.println("Enter Model Number : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setModel(txt);

        System.out.println("Enter Milage : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setMilage(txt);

        System.out.println("Enter Car Type : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setType(txt);

        System.out.println("Enter Aircondition Info : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setAc(txt);

        System.out.println("Enter Fuel Type : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setFuelType(txt);

        System.out.println("Enter Category : ");
        input = new Scanner(System.in);
        txt = input.nextLine();
        car.get(index).setCategory(txt);
        System.out.println("\n\n******Car Updated Successfully**********");
    }

    
    // edit customer function to access the edit function of class customer
    public void editCustomer() {

        System.out.print("Enter Customer Name: ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int index = -1;
        for (int i = 0; i < customer.size(); i++) {
            if (txt.matches(customer.get(i).name)) {
                index = i;
                break;
            }
        }

        customer.get(index).setName(txt);

        
        // taking new inputs
        
        System.out.println("Enter Customer Email");
        txt = input.nextLine();
        customer.get(index).setEmail(txt);
        System.out.println("Enter Customer Address");
        txt = input.nextLine();
        customer.get(index).setAddress(txt);
        System.out.println("Enter Customer Phone Number");
        txt = input.nextLine();
        customer.get(index).setTelephoneNumber(txt);
        System.out.println("\n\n******Customer Updated Successfully**********");
    }
 
    
    // delete car function to access the delete function of class car
    public void removeCar() {
        System.out.println("Enter Registration Number : ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int index = -1;
        
        //loop to remove the any car from the car list
        for (int i = 0; i < car.size(); i++) {
            if (txt.matches(car.get(i).registrationNumber)) {
                index = i;
                break;
            }
        }
        car.remove(index);
        System.out.println("\n\n******Car Deleted Successfully**********");
    }
    
    // find car function to access the find function of class car
    public void findCar() {
        System.out.println("Enter Registration Number : ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int index = -1;
        // loop to iterate array
        for (int i = 0; i < car.size(); i++) {
            if (txt.matches(car.get(i).registrationNumber)) {
                index = i;
                break;
            }
        }
        car.get(index).printInfo();;
    }

    // display all car functions
    public void allCar() {
        
        // loop to iterate car list
        for (int i = 0; i < car.size(); i++) {
            car.get(i).printInfo();
        }
    }

    // remove customer function
    public void removeCustomer() {

        System.out.println("Enter customer name : ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int index = -1;
        
        // loop to iterate the customer list
        for (int i = 0; i < customer.size(); i++) {
            if (txt.matches(customer.get(i).name)) {
                index = i;
                break;
            }
        }
        customer.remove(index);
        System.out.println("\n\n******Customer Deleted Successfully**********");
    }

    
    // add customer function
    public void addCustomer() {
        Customer cust = new Customer();
        customer.add(cust.addCustomer());
        System.out.println("\n\n******Customer Added Successfully**********");
    }

    
    // find customer function
    public void findCustomer() {

        System.out.println("Enter Customer Name : ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();
        int index = -1;
        
        //looop to iterate
        for (int i = 0; i < customer.size(); i++) {
            if (txt.matches(customer.get(i).name)) {
                index = i;
                break;
            }
        }
        customer.get(index).printInfo();;
    }

    // display all customer function
    public void allCustomer() {
        
        //loop to iterate
        for (int i = 0; i < customer.size(); i++) {
            customer.get(i).printInfo();
        }
    }

    
    // this function will make the rentals
    public void makeRental() {
        System.out.println("\n\n\t ******You Have To Enter Car Information First***********");
        System.out.println("Enter Registration Number : ");
        Scanner input = new Scanner(System.in);
        String txt = input.nextLine();

        // loop to iterate
        for (Car cr : car) {
            if (cr.getRegistrationNumber().equals(txt)) {
                System.out.println("");
            }
        }
    }
}

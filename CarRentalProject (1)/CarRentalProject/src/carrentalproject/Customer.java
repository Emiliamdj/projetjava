/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalproject;

import java.util.Scanner;

/**
 *
 * @author RAYA  OURIEL EMILIA
 */
public class Customer {
    
    // attributes of Customer
    String name;
    String email;
    String address;
    String telephoneNumber;

    // parameterized constructor
    public Customer(String name, String email, String address, String telephoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    
    // default constructor
    public Customer() {
        this.name = null;
        this.email = null;
        this.address = null;
        this.telephoneNumber = null;
    }

    // setter and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
    public void printInfo(){
        System.out.println("\nCustomer: "+this.name+"\nCustomer Email: "+this.email+"\nCustomer Address: "+this.address+"\nPhone Number: "+this.telephoneNumber);
    }
    
    
    // add customer to add Customers
    public Customer addCustomer()
    {
        Customer customer=new Customer();
        Scanner input=new Scanner(System.in);
        System.out.println("\n********Enter Customer Information *********");
        System.out.println("Enter Customer Name");
        String in=input.nextLine();
        customer.setName(in);
        
        
        System.out.println("Enter Customer Email");
        in=input.nextLine();
        customer.setEmail(in);
        
        
        System.out.println("Enter Customer Address");
        in=input.nextLine();
        customer.setAddress(in);
        
        System.out.println("Enter Customer Phone Number");
        in=input.nextLine();
        customer.setTelephoneNumber(in);
        
        return customer;
    }
}

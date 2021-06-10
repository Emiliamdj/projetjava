package carrentalproject;

import java.util.Scanner;

public class CarRentalProject {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String opt="0";
        int input;
        CarRentalFactory proj=new CarRentalFactory();
        // Menu Loop to display the customer
        while(opt!="1")
        {
            System.out.println("*************Car Management**************");
            System.out.println("1 : Add Car");
            System.out.println("2 : Edit Car");
            System.out.println("3 : Remove Car");
            System.out.println("4 : Find Car");
            System.out.println("5 : Display All Cars");
            System.out.println("*************Customer Management***********");
            System.out.println("6 : Add Customer");
            System.out.println("7 : Edit Customer");
            System.out.println("8 : Remove Customer");
            System.out.println("9 : Find Customer");
            System.out.print("10 : Display All Customer\nYour Choice: ");
            input=in.nextInt();
            
            // switch case  to manage cases 
            switch(input)
            {
                case 1:
                    proj.addCar(); break;
                case 2:
                    proj.editCar();break;
                case 3:
                    proj.removeCar();break;
                case 4:
                    proj.findCar();break;
                case 5:
                    proj.allCar();break;      
                case 6:
                    proj.addCustomer(); break;
                case 7:
                    proj.editCustomer();break;
                case 8:
                    proj.removeCustomer();break;
                case 9:
                    proj.findCustomer();break;
                case 10:
                    proj.allCustomer();break;    
            }
        }
    }
    
}

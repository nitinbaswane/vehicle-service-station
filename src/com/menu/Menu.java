package src.com.menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("Main Menu");
            System.out.println("*********");
            System.out.println("0. Exit");
            System.out.println("1. Customer");
            System.out.println("2. Vehicles");
            System.out.println("3. Service Request");
            System.out.println("4. Parts");
            System.out.println("5. Today's Business");
            System.out.println("6. Given Date's Business");
            System.out.print("Enter Your Choice from above List: ");
            choice = scanner.nextInt();

            
            switch (choice) {
                case 0:
                    System.out.println("Exiting the program.");
                    break;
                case 1:
                    System.out.println("Customer selected.");
                    
                    break;
                case 2:
                    System.out.println("Vehicles selected.");
                  
                    break;
                case 3:
                    System.out.println("Service Request selected.");
                   
                    break;
                case 4:
                    System.out.println("Parts selected.");
                   
                    break;
                case 5:
                    System.out.println("Today's Business selected.");
                    
                    break;
                case 6:
                    System.out.println("Given Date's Business selected.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0); 

        scanner.close();
    }
}

package src.com.menu;

import java.util.Scanner;

import src.com.manageoperation.*;

public class Menu {
	
	
public void customerMenu(int choice) {
	//scanner = new Scanner(System.in);
    
	
}
    public static void main(String[] args) {
        int choice;
       Scanner scanner = new Scanner(System.in);
       //Menu mn= new Menu();
        do {
            
            System.out.println("Main Menu");
            System.out.println("---------");
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
                	CustomerOp co = new CustomerOp();
                	do {
                        
                        System.out.println("Customer Menu");
                        System.out.println("-------------");
                        System.out.println("0. Exit");
                        System.out.println("1. add Customer");
                        System.out.println("2. display all customer");
                        System.out.println("3. find customer ");
                        System.out.println("4. edit customer");
                        System.out.println("5. delete customer");
                       
                        choice = scanner.nextInt();

                        
                        switch (choice) {
                        	//case 0:
                        		//break;
                          
                            case 1:
                                co.addCustomer();
                                break;
                            case 2:
                                co.displayAllCustomer();
                              
                                break;
                            case 3:
                                co.findCustomer();
                                break;
                            case 4:
                                co.editCustomer();
                               
                                break;
                            case 5:
                                co.deleteCustomer();;
                                
                                break;
                           
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    } while (choice != 0); 
                    
                   break;
                case 2:
                    System.out.println("Vehicles selected.");
                  
                    break;
                case 3:
                    System.out.println("Service Request selected.");
                   
                    break;
                case 4:
                	PartsOp po=new PartsOp();
                	do {
                        
                        System.out.println("Customer Menu");
                        System.out.println("*********");
                        System.out.println("0. Go back");
                        System.out.println("1. add part");
                        System.out.println("2. display all parts");
                        System.out.println("3. edit parts ");
                        System.out.println("4. delete parts");
                        System.out.println("5. find part");
                       
                        choice = scanner.nextInt();

                        
                        switch (choice) {
                        	case 0:
                        		choice =0;
                        		break;
                          
                            case 1:
                            	po.addPart();
                                
                                break;
                            case 2:
                                po.displayAllParts();
                              
                                break;
                            case 3:
                                po.editPartPrice();
                                break;
                            case 4:
                                po.deletePart();
                               
                                break;
                            case 5:
                                po.displayAllParts();
                                
                                break;
                           
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }} while (choice != 0); 
                   
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

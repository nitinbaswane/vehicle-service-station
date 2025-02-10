package servicesstation;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ServiceStationMenu {
    private static  Scanner scanner = new Scanner(System.in);
    private static ServiceStation serviceStation = new ServiceStation("My Service Station");

    public static void main(String[] args) throws ServiceStationException {
        int mainChoice;
        do {
            printMainMenu();
            mainChoice = getInput("Enter Your Choice from above List = ");
            switch (mainChoice) {
                case 1:
                    customerMenu();
                    break;
                case 2:
                    vehicleMenu();
                    break;
                case 3:
                    serviceRequestMenu();
                    break;
                case 4:
                    partsMenu();
                    break;
                case 5:
                    calculateTodaysBusiness();
                    
                    break;
                case 6:
                    calculateGivenDateBusiness();
                    break;
                case 0:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (mainChoice != 0);
    }

    private static void printMainMenu() {
        System.out.println("\nMain Menu\n*");
        System.out.println("0. Exit");
        System.out.println("1. Customer");
        System.out.println("2. Vehicles");
        System.out.println("3. Service Request");
        System.out.println("4. Parts");
        System.out.println("5. Today's Business");
        System.out.println("6. Given Date's Business");
    }

    private static void customerMenu() throws ServiceStationException {
        int choice;
        do {
            System.out.println("\nCustomer Menu\n*");
            System.out.println("0. Go Back");
            System.out.println("1. Add Customer");
            System.out.println("2. Display All Customers");
            System.out.println("3. Display Customer Details");
            System.out.println("4. Edit Customer");
            System.out.println("5. Delete Customer");
            choice = getInput("Enter Your Choice from above List = ");
            switch (choice) {
                case 1:
                	serviceStation.addCustomer();
                    break;
                case 2:
                	serviceStation.displayAllCustomers();
                    break;
                case 3:
                	serviceStation.displayCustomerDetails();
                    break;
                case 4:
                	//serviceStation.editCustomer();
                    break;
                case 5:
                	serviceStation.removeCustomer();
                    break;
                case 0:
                    System.out.println("Going back to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 0);
    }

    private static void vehicleMenu() throws ServiceStationException {
        int choice;
        do {
            System.out.println("\nVehicle Menu\n*");
            System.out.println("0. Go Back");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display ALL Vehicles");
            System.out.println("3. Display Customer Vehicles");
            System.out.println("4. Edit Vehicle");
            System.out.println("5. Delete Vehicle");
            choice = getInput("Enter Your Choice from above List = ");
            switch (choice) {
                case 1:
                	serviceStation.addVehicle();
                    break;
                case 2:
                	serviceStation.displayAllVehicles();
                	
                    break;
                case 3:
                    displayCustomerVehicles();
                    break;
                case 4:
                    editVehicle();
                    break;
                case 5:
                    deleteVehicle();
                    break;
                case 0:
                    System.out.println("Going back to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 0);
    }

    private static void serviceRequestMenu() {
        int choice;
        do {
            System.out.println("\nService Request Menu\n*");
            System.out.println("0. Go Back");
            System.out.println("1. Select Customer Vehicle");
            System.out.println("2. Process Request");
            System.out.println("3. Prepare and Display Bill");
            System.out.println("4. Get bill payment from customer");
            choice = getInput("Enter Your Choice from above List = ");
            switch (choice) {
                case 1:
                    selectCustomerVehicle();
                    break;
                case 2:
                    processRequestSubMenu();
                    break;
                case 3:
                    //prepareAndDisplayBill();
                    break;
                case 4:
                   // getPaymentFromCustomer();
                    break;
                case 0:
                    System.out.println("Going back to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 0);
    }

    

	private static void processRequestSubMenu() {
        int choice;
        do {
            System.out.println("\nProcess Request Submenu\n*");
            System.out.println("0. Go Back");
            System.out.println("1. New Service");
            System.out.println("2. Existing Service");
            System.out.println("3. Maintenance");
            System.out.println("4. Repairing");
            System.out.println("5. Engine Oil Change / Additives");
            choice = getInput("Enter Your Choice from above List = ");
            switch (choice) {
                case 1:
                    newService();
                    break;
                case 2:
                    existingService();
                    break;
                case 3:
                    maintenance();
                    break;
                case 4:
                    repairing();
                    break;
                case 5:
                    oilChange();
                    break;
                case 0:
                    System.out.println("Going back to Service Request Menu...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 0);
    }

    private static void partsMenu() {
        int choice;
        do {
            System.out.println("\nParts Menu\n*");
            System.out.println("0. Go Back");
            System.out.println("1. Add Part");
            System.out.println("2. Display All Parts");
            System.out.println("3. Edit Part Price");
            System.out.println("4. Delete Part");
            choice = getInput("Enter Your Choice from above List = ");
            switch (choice) {
                case 1:
                    //addPart();
                    break;
                case 2:
                    //displayAllParts();
                    break;
                case 3:
                    //editPartPrice();
                    break;
                case 4:
                    //deletePart();
                    break;
                case 0:
                    System.out.println("Going back to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        } while (choice != 0);
    }

    private static void calculateTodaysBusiness() {
        LocalDate today = LocalDate.now();
        double total = serviceStation.calculateTodaysBusiness(today);
        System.out.println("Total Business for Today (" + today + "): $" + total);
    }

    private static void calculateGivenDateBusiness() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        double total = serviceStation.calculateBusinessForDate(date);
        System.out.println("Total Business for " + date + ": $" + total);
    }

    private static int getInput(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    // Placeholder methods for menu options
    

    private static void displayCustomerVehicles() { System.out.println("Display Customer Vehicles functionality here."); }
    private static void editVehicle() { System.out.println("Edit Vehicle functionality here."); }
    private static void deleteVehicle() { System.out.println("Delete Vehicle functionality here."); }

    private static void selectCustomerVehicle() { System.out.println("Select Customer Vehicle functionality here."); }
    private static void newService() { System.out.println("New Service functionality here."); }
    private static void existingService() { System.out.println("Existing Service functionality here."); }
    private static void maintenance() { System.out.println("Maintenance functionality here."); }
    private static void repairing() { System.out.println("Repairing functionality here."); }
    private static void oilChange() { System.out.println("Engine Oil Change/Additives functionality here."); }

   // private static void addPart() { System.out.println("Add Part functionality here."); }
   // private static void displayAllParts() { System.out.println("Display All Parts functionality here."); }
   // private static void editPartPrice() { System.out.println("Edit Part Price functionality here."); }
   // private static void deletePart() { System.out.println("Delete Part functionality here."); }
}

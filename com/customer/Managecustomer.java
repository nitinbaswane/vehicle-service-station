package com.customer;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Managecustomer {
    private HashMap<String, Customer> customers = new HashMap<>();
    private static final String FILE_NAME = "customers.dat";

    public  Managecustomer() {
        loadCustomersFromFile();
    }

    public void manageCustomers(Scanner scanner) {
        while (true) {
            System.out.println("\n0. Exit");
            System.out.println("1. Add Customer");
            System.out.println("2. Display All Customers");
            System.out.println("3. Edit Customer");
            System.out.println("4. Delete Customer");
            System.out.print("Enter Your Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 0:
                    saveCustomersToFile();
                    System.out.println("Exiting...");
                    return;
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    displayAllCustomers();
                    break;
                case 3:
                    editCustomer(scanner);
                    break;
                case 4:
                    deleteCustomer(scanner);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addCustomer(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        String mobileNumber = scanner.nextLine();

        customers.put(mobileNumber, new Customer(name, address, mobileNumber));
        System.out.println("Customer added successfully.");
    }

    private void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            customers.forEach((mobile, customer) -> System.out.println(
                "Customer [id=" + mobile.hashCode() + ", name=" + customer.getName() +
                ", address=" + customer.getAddress() +
                ", mobile=" + mobile + "]"
            ));
        }
    }

    private void editCustomer(Scanner scanner) {
        System.out.print("Enter mobile number of the customer to edit: ");
        String mobileNumber = scanner.nextLine();
        Customer customer = customers.get(mobileNumber);
        if (customer != null) {
            System.out.print("Enter new address: ");
            String address = scanner.nextLine();
            customer.setAddress(address);
            System.out.println("Customer updated successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

    private void deleteCustomer(Scanner scanner) {
        System.out.print("Enter mobile number of the customer to delete: ");
        String mobileNumber = scanner.nextLine();
        if (customers.remove(mobileNumber) != null) {
            System.out.println("Customer deleted successfully.");
        } else {
            System.out.println("Customer not found.");
        }
    }

	private void saveCustomersToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(customers);
			System.out.println("Customers saved to file.");
		} catch (IOException e) {
			System.out.println("Error saving customers to file: " + e.getMessage());
		}
	}

    private void loadCustomersFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                customers = (HashMap<String, Customer>) ois.readObject();
                System.out.println("Customers loaded from file.");
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading customers from file: " + e.getMessage());
            }
        }
    }
}

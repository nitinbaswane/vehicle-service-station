package servicesstation;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//import com.vehicleservicestation.Vehicle;

class ServiceStation implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
    private Set<Customer> customers;
    private List<Service> services;
    private List<Part> availableParts;
    private Scanner sc = new Scanner(System.in);
    
    public ServiceStation(String name) {
        this.name = name;
        this.customers = new HashSet<>();
        this.services = new LinkedList<>();
        this.availableParts = new LinkedList<>();
    }
    
    // Customer management
    public void addCustomer() throws ServiceStationException {
    	System.out.println("enter name");
		String name=(sc.nextLine());
		System.out.println("enter mobile number");
		String mob=(sc.nextLine());
	
		System.out.println("enter address");
		String address=(sc.nextLine());
    	Customer customer=new Customer(name,address,mob);
    	 if (customers.contains(customer)) {
    	        throw new ServiceStationException("Customer already exists.");
    	    }
    	    customers.add(customer);
    }
    
    
    
    public List<Customer> displayAllCustomers() {
        return new ArrayList<>(customers);
    }
    
    
    
    public Customer displayCustomerDetails() throws ServiceStationException {
    	String mobileNumber = null;
        Customer customer = findCustomer(mobileNumber);
        if (customer == null) {
            throw new ServiceStationException("Customer not found");
        }
        System.out.println(customer);
        return customer;
        
    }
    
    
    
    public void removeCustomer() throws ServiceStationException {
    	System.out.println("enter mobile number");
		String mobileNumber=(sc.nextLine());
        Customer customer = findCustomer(mobileNumber);
        if (customer != null) {
            customers.remove(customer);
        } else {
            throw new ServiceStationException("Customer not found");
        }
    }
    
    public Customer findCustomer(String mobileNumber) {
    	System.out.println("enter mobile number");
		String mobileNum=(sc.nextLine());
        for (Customer customer : customers) {
            if (customer.getMobileNumber().equals(mobileNum)) {
            	System.out.println(customer);
                return customer;
            }
        }
        return null;
    }
    
    
    
    
    
    
    
 // Vehicle Management
    public void addVehicle() throws ServiceStationException {
    	System.out.println("enter mobile number");
		String mobileNumber=(sc.nextLine());
		Customer customer = findCustomer(mobileNumber);
		if (customer == null) {
            throw new ServiceStationException("Customer not found");
        }
		System.out.print("Enter vehicle NO: ");
        String vehicleNumber= sc.nextLine();
        System.out.print("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        Vehicle vehicle = new Vehicle(vehicleNumber,manufacturer, model);
        
        
        customer.addVehicle(vehicle);
    }
    
    public List<Vehicle> displayAllVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        for (Customer customer : customers) {
            vehicles.addAll(customer.getVehicles().values());
        }
        return vehicles;
    }
    
    public List<Vehicle> displayCustomerVehicles(String mobileNumber) throws ServiceStationException {
        Customer customer = findCustomer(mobileNumber);
        if (customer == null) {
            throw new ServiceStationException("Customer not found");
        }
        return new ArrayList<>(customer.getVehicles().values());
    }
    
    public void editVehicle(String mobileNumber, String oldVehicleNumber, String newVehicleNumber) throws ServiceStationException {
        Customer customer = findCustomer(mobileNumber);
        if (customer == null) {
            throw new ServiceStationException("Customer not found");
        }
        Vehicle vehicle = customer.getVehicle(oldVehicleNumber);
        if (vehicle == null) {
            throw new ServiceStationException("Vehicle not found");
        }
        vehicle.setVehicleNumber(newVehicleNumber);
    }
    
    public void deleteVehicle(String mobileNumber, String vehicleNumber) throws ServiceStationException {
        Customer customer = findCustomer(mobileNumber);
        if (customer == null) {
            throw new ServiceStationException("Customer not found");
        }
        if (customer.getVehicle(vehicleNumber) == null) {
            throw new ServiceStationException("Vehicle not found");
        }
        customer.getVehicles().remove(vehicleNumber);
    }
    // Service Request Management
    public Service selectCustomerVehicle(String mobileNumber, String vehicleNumber) throws ServiceStationException {
        Customer customer = findCustomer(mobileNumber);
        if (customer == null) throw new ServiceStationException("Customer not found");

        Vehicle vehicle = customer.getVehicle(vehicleNumber);
        if (vehicle == null) throw new ServiceStationException("Vehicle not found");

        Service service = new Service(services.size() + 1, customer, vehicle);
        services.add(service);
        return service;
    }

    public void processRequest(Service service, String type, Object detail) {
        switch (type.toLowerCase()) {
            case "maintenance":
                service.addMaintenance((Maintenance) detail);
                break;
            case "oilchange":
                service.addOilChange((OilChange) detail);
                break;
            default:
                throw new IllegalArgumentException("Invalid service type");
        }
    }

    // Billing and Payments
    public String prepareAndDisplayBill(Service service) {
        StringBuilder bill = new StringBuilder();
        bill.append("Service ID: ").append(service.getServiceId()).append("\n")
            .append("Customer: ").append(service.getCustomer().getName()).append("\n")
            .append("Vehicle: ").append(service.getVehicle().getManufacturer()).append(" ")
            .append(service.getVehicle().getModel()).append("\n")
            .append("Service Date: ").append(service.getServiceDate()).append("\n")
            .append("Total Amount: $").append(service.getTotalAmount()).append("\n")
            .append("Paid: ").append(service.isPaid() ? "Yes" : "No").append("\n");
        return bill.toString();
    }

    public void getPaymentFromCustomer(Service service, double paymentAmount) throws ServiceStationException {
        if (service.isPaid()) {
            throw new ServiceStationException("Service is already paid");
        }
        if (paymentAmount < service.getTotalAmount()) {
            throw new ServiceStationException("Insufficient payment amount");
        }
        service.setPaid(true);
    }
    

    // Business Reports
    public double calculateTodaysBusiness(LocalDate today) {
        return services.stream()
                .filter(service -> service.getServiceDate().equals(today) && service.isPaid())
                .mapToDouble(Service::getTotalAmount)
                .sum();
    }

    public double calculateBusinessForDate(LocalDate date) {
        double total = 0.0;
        for (Service service : services) {
            if (service.getServiceDate().equals(date) && service.isPaid()) {
                total += service.getTotalAmount();
            }
        }
        return total;
    }


    
//    // Service management
//    public Service createService(Customer customer, Vehicle vehicle) {
//        Service service = new Service(services.size() + 1, customer, vehicle);
//        services.add(service);
//        return service;
//    }
//    
//    // Business reporting
//    public double calculateDailyBusiness(LocalDate date) {
//        return services.stream()
//                .filter(s -> s.getServiceDate().equals(date) && s.isPaid())
//                .mapToDouble(Service::getTotalAmount)
//                .sum();
//    }
    
    // Parts management
    public void addPart(Part part) {
        availableParts.add(part);
    }
    
    public void removePart(int partId) throws ServiceStationException {
        Part part = findPart(partId);
        if (part != null) {
            availableParts.remove(part);
        } else {
            throw new ServiceStationException("Part not found");
        }
    }
    
    public Part findPart(int partId) {
        for (Part part : availableParts) {
            if (part.getPartId() == partId) {
                return part;
            }
        }
        return null;
    }

    
    // Serialization
    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
        }
    }
    
    public static ServiceStation loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ServiceStation) ois.readObject();
        }
    }
}
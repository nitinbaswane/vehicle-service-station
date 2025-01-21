package src.com.manageoperation;

import java.util.HashMap;
import java.util.Scanner;

import src.com.vehicleservicestation.Customer;
import src.com.vehicleservicestation.Parts;
import src.com.vehicleservicestation.Vehicle;

public class VehicleOp extends Vehicle{
	private Scanner sc;
	Customer c;
	
	

	public VehicleOp() {
		super("","","");
		c=new Customer();
		this.sc=new Scanner(System.in);
	}
	
    public VehicleOp(String vehicleNumber, String manufacturer, String model, Customer c) {
		super(vehicleNumber, manufacturer, model);
		this.c = c;
	}

	public void addVehicle() {
    	while(true) {
    	//Customer v=c.findCustomer();
    	//if(v.getMobno()==mobno) {
    	System.out.print("Enter vehicle NO: ");
        String vehicleNumber= sc.nextLine();
        System.out.print("Enter manufacturer: ");
        String manufacturer = sc.nextLine();
        System.out.print("Enter model: ");
        String model = sc.nextLine();
        Vehicle vehicle = new Vehicle(vehicleNumber,manufacturer, model);
        //System.out.println(vehicle);
        
       // c.addVehicles(vehicles);
        c.addVehicle(vehicle);
        System.out.println("vehicle added successfully.");
        //break;
    	//}
//	else 
//   	{System.out.println("Enter correct mobile no from customer class NO: ");}
    	
    	}
        
        }

	
    public void displayAllVehicle() {
    	System.out.println("vehicles list:");
//    	for (Vehicle v:vehicles.values()) {
//    		System.out.println(v);
//    	}
		
	}
    public void displayCustomerVehicle() {
    	System.out.print("Enter mobile no from customer class NO:: ");
    	String mobno=sc.nextLine();
    	if(c.getMobno().equals(mobno)) {
    		Vehicle v=c.getVehicles(mobno);
    		System.out.println(v);
    	}
    	
	}
	public void deleteVehicle() {
		System.out.print("Enter mobile no from customer class NO:: ");
	}
	public void editVehicle() {
		System.out.print("Enter mobile no from customer class NO:: ");
		
	}
	

}

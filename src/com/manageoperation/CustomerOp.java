package src.com.manageoperation;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import src.com.vehicleservicestation.*;

public class CustomerOp extends Customer{
	private HashSet<Customer> customers;
    private Scanner sc;
    Customer c;

	public CustomerOp( ) {
		super("","","","");
		this.customers = new HashSet<Customer>();
		this.sc =new Scanner(System.in);
	}
	public void addCustomer() {
		System.out.println("enter name");
		String name=(sc.nextLine());
		System.out.println("enter mobile number");
		String mob=(sc.nextLine());
		System.out.println("enter email");
		String email=(sc.nextLine());
		System.out.println("enter address");
		String address=(sc.nextLine());
		
	   Customer c=new Customer(name,mob,email,address);
	   customers.add(c);
	}
    public void displayAllCustomer() {
    	for(Customer c :customers)
		System.out.println(c);
	}
    public Customer findCustomer() {
    	System.out.println("enter mobileNumber of customer");
    	String mn=sc.nextLine();
    	
    	for(Customer c :customers) {
    	if(c.getMobno().equals(mn)){
    		this.c=c;
    		System.out.println(c);
    		break;
    	}
    	}
    	return c;
	}
	public void deleteCustomer() {
		System.out.println("enter mobileNumber of customer");
    	String mn=sc.nextLine();
    	for(Customer c :customers) {
    	if(c.getMobno().equals(mn)){
    		customers.remove(c);
    		System.out.println("customer deleted sucessfully");
    		break;
    	}
    	else {System.out.println("customer not found ");}
    	}
		
	}
	public void editCustomer() {
		Customer c=findCustomer();
		if(c!=null) {
		System.out.println("enter name");
		c.setCname(sc.nextLine());
		System.out.println("enter mobile number");
		c.setMobno(sc.nextLine());
		System.out.println("enter email");
		c.setEmail(sc.next());
		System.out.println("enter address");
		c.setAddress(sc.nextLine());
		
	   	   customers.add(c);
		}
		else {System.out.println("customer not found ");}
		
		
	}
	
	

}

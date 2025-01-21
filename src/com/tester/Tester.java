package src.com.tester;
import java.util.ArrayList;
import java.util.Scanner;

import src.com.manageoperation.*;
import src.com.vehicleservicestation.Customer;
import src.com.vehicleservicestation.Parts;
public class Tester {

	public static void main(String []args) {
	//	Customer c = new Customer();
	Scanner sc =new Scanner(System.in);
//		//Customer c=new Customer();
////		Parts p=new Parts();
////	    PartsOp po=new PartsOp();
////		po.addPart(sc);
////		po.addPart(sc);
////		po.editPartPrice(sc);
////        po.deletePart(sc);
////        po.displayAllParts();
	CustomerOp co=new CustomerOp();
      co.addCustomer();
////		//co.editCustomer(sc);
////		co.findCustomer(sc);
////		co.displayAllCustomer();
////		co.deleteCustomer(sc);	
	VehicleOp vo=new VehicleOp();
     vo.addVehicle();
	//vo.displayAllVehicle();
	//vo.displayCustomerVehicle();	
	
	}

}

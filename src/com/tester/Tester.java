package src.com.tester;
import java.util.ArrayList;
import java.util.Scanner;

import src.com.manageoperation.*;
import src.com.vehicleservicestation.Customer;
public class Tester {

	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		//Customer c=new Customer();
	PartsOp po=new PartsOp();
		po.addPart(sc);
		po.addPart(sc);
		po.editPartPrice(sc);
        po.deletePart(sc);
        po.displayAllParts();
//		CustomerOp co=new CustomerOp();
//		co.addCustomer(sc);
//		//co.editCustomer(sc);
//		co.findCustomer(sc);
//		co.displayAllCustomer();
//		co.deleteCustomer(sc);
		
	}

}

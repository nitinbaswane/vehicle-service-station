package src.com.manageoperation;
import java.util.ArrayList;
import java.util.Scanner;

import src.com.vehicleservicestation.*;
public class PartsOp extends Parts{
  private Scanner sc;
  private ArrayList<Parts> parts;
  
	public PartsOp() {
		super("","", 0, 0);
		// TODO Auto-generated constructor stub
		parts = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	public void addPart(Scanner sc) {
	
		System.out.print("Enter part name: ");
        String pname = sc.nextLine();
        System.out.print("Enter description: ");
        String description = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        Parts op=new Parts(pname,description,price,id);
        parts.add(op);
        System.out.println("part added successfully.");
		
	}
    public void displayAllParts() {
//    	 if (parts.isEmpty()) {
//             System.out.println("No parts found!");
//             return;
//         }
    	 System.out.println("\nParts List:");
         for (Parts p : parts) {
             System.out.println(p);
         }
	}
    
	public void deletePart(Scanner sc) {
		 System.out.println("\nParts List:");
         for (Parts p : parts) {
             System.out.println(p);
         }
		System.out.print("Enter id to delete part: ");
        int id = sc.nextInt();
		for(Parts p:parts) {
			if(p.getId()==id) {
			parts.remove(p);
			 System.out.println("part removed successfully"); 
			 break;
			}
			
		}
		
	}
	public void editPartPrice(Scanner sc) {
		 System.out.println("\nParts List:");
         for (Parts p : parts) {
             System.out.println(p);
         }
		System.out.println("enter id to edit"); 
		int id=sc.nextInt();
		System.out.println("enter price"); 
		int price=sc.nextInt();
		for(Parts p:parts) {
			if(p.getId()==id) {
			  p.setPrice(price);
			 System.out.println("part edited  successfully"); 
			 break;
			}
			
		}
		
	}
	
//	public static void partmenu(Scanner sc) {
//		PartsOp partsOp=new PartsOp();
//		int choice;
//	do {
//        System.out.println("0. go back");
//        System.out.println("1. Add parts");
//        System.out.println("2. Display All parts");
//        System.out.println("3. Search Customer by ID");
//        System.out.println("4. Exit");
//        System.out.print("Enter your choice: ");
//        
//        choice = sc.nextInt();
//	}while
//	}

}

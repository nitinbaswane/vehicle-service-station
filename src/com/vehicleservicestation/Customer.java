package src.com.vehicleservicestation;

import java.util.HashMap;
import java.util.Objects;
import src.com.manageoperation.VehicleOp;

public  class Customer implements Comparable<Customer>{

	private String cname;
	private String mobno;
	private String email;
	private String address;
	private double lastBalance;
	private HashMap<String, Vehicle> vehicles;
	
	
	public Customer() {
		super();
	}

	public Customer(String cname, String mobno, String email, String address) {
		super();
		this.cname = cname;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
		this.vehicles= new HashMap<String ,Vehicle>();
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLastBalance() {
		return lastBalance;
	}

	public void setLastBalance(double lastBalance) {
		this.lastBalance = lastBalance;
	}

	public Vehicle getVehicles(String vehNo) {
		return this.vehicles.get(vehNo);
	}

//	public void addVehicles(HashMap<String, Vehicle> vehicles) {
//		this.vehicles = vehicles;
//	}
	/*
	 public void newVehicle(Vehicle veh) {
		this.vehList.put(veh.getNumber(), veh);
	}
	
	public Vehicle getVehicle(String vehNumber) {
		return this.vehList.get(vehNumber);
	}
	*/
	
	public void addVehicle(Vehicle vehicle) {
		
        this.vehicle.put(vehicle.getVehicleNumber(), vehicles);
       
       
    }

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", mobno=" + mobno + ", email=" + email + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return mobno == other.mobno;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}

	//@Override
//	public int compareTo(Customer o) {
//		 return String.compare(this.mobno,o.mobno);
//	}


	
	
}

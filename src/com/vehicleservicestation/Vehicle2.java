package com.vehicleservicestation;

public class Vehicle {
	String vehicleno;
	String model;
	String company;
	
	public Vehicle(String vehicleno, String model, String company) {
		super();
		this.vehicleno = vehicleno;
		this.model = model;
		this.company = company;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleno=" + vehicleno + ", model=" + model + ", company=" + company + "]";
	}
	

	
	
}

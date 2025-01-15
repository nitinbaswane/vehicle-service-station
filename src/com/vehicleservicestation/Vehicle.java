package com.vehicleservicestation;
import java.util.Objects;

<<<<<<< HEAD
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
	
=======
public class Vehicle implements Comparable<Vehicle>{
	 private String manufacturer;
	    private String model;
	    private String vehicleNumber;
		public Vehicle(String manufacturer, String model, String vehicleNumber) {
			super();
			this.manufacturer = manufacturer;
			this.model = model;
			this.vehicleNumber = vehicleNumber;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getVehicleNumber() {
			return vehicleNumber;
		}
		public void setVehicleNumber(String vehicleNumber) {
			this.vehicleNumber = vehicleNumber;
		}
		@Override
		public String toString() {
			return "Vehicle [manufacturer=" + manufacturer + ", model=" + model + ", vehicleNumber=" + vehicleNumber
					+ "]";
		}
		@Override
		public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
			return this.getVehicleNumber().compareTo(o.vehicleNumber );
		}
	    
>>>>>>> main

	
	
}

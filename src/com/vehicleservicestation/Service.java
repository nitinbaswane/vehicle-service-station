package com.vehicleservicestation;

import java.sql.Date;

public class Service {
	private String service;
	private double laborCost;
	private Date serviceDate;
	private double oilCharges;
	

	public Service(String service, double laborCost, Date serviceDate, double oilCharges) {
		super();
		this.service = service;
		this.laborCost = laborCost;
		this.serviceDate = serviceDate;
		this.oilCharges = oilCharges;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double getLaborCost() {
		return laborCost;
	}

	public void setLaborCost(double laborCost) {
		this.laborCost = laborCost;
	}
	

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public double getOilCharges() {
		return oilCharges;
	}

	public void setOilCharges(double oilCharges) {
		this.oilCharges = oilCharges;
	}

	@Override
	public String toString() {
		return "Service [service=" + service + ", laborCost=" + laborCost + ", serviceDate=" + serviceDate
				+ ", oilCharges=" + oilCharges + "]";
	}

	
	

}

package com.vehicleservicestation;

public class Parts{
	private String name;
	private String description;
	private int price;
	private int id;
	public Parts(String name, String description, int price, int id) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Parts [name=" + name + ", description=" + description + ", price=" + price + ", id=" + id + "]";
	}
	
	

}

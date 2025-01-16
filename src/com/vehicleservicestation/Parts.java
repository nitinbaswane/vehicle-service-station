package src.com.vehicleservicestation;

public class Parts{
	private String pname;
	private String description;
	private int price;
	private int id;
	public Parts(String pname, String description, int price, int id) {
		super();
		this.pname = pname;
		this.description = description;
		this.price = price;
		this.id = id;
	}
	public String getName() {
		return pname;
	}
	public void setName(String pname) {
		this.pname = pname;
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
		return "Parts [name=" + pname + ", description=" + description + ", price=" + price + ", id=" + id + "]";
	}
	
	

}

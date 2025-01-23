package servicesstation;

import java.io.Serializable;

class Part implements Serializable {
	private static final long serialVersionUID = 1L;
    private int partId;
    private String name;
    private double price;
    
    public Part(int partId, String name, double price) {
        this.partId = partId;
        this.name = name;
        this.price = price;
    }
    
    // Getters and setters
    public int getPartId() { return partId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

	@Override
	public String toString() {
		return "Part [partId=" + partId + ", name=" + name + ", price=" + price + "]";
	}
    
}


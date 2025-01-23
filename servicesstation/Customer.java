package servicesstation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
    private String name;
    private String address;
    private String mobileNumber;
    private Map<String, Vehicle> vehicles;
    
    public Customer(String name, String address, String mobileNumber) {
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.vehicles = new HashMap<>();
    }
    
    public void addVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getVehicleNumber(), vehicle);
    }
    
    public Vehicle getVehicle(String vehicleNumber) {
        return vehicles.get(vehicleNumber);
    }
    
    // Getters and setters
    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public Map<String, Vehicle> getVehicles() { return vehicles; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return mobileNumber.equals(customer.mobileNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(mobileNumber);
    }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + ", vehicles="
				+ vehicles + "]";
	}
    
}


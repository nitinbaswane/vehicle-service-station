package servicesstation;

import java.io.Serializable;
import java.util.Objects;

class Vehicle implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private String manufacturer;
    private String model;
    private String vehicleNumber;
    
    public Vehicle(String manufacturer, String model, String vehicleNumber) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.vehicleNumber = vehicleNumber;
    }
    
    // Getters and setters
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getManufacturer() { return manufacturer; }
    public String getModel() { return model; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleNumber.equals(vehicle.vehicleNumber);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(vehicleNumber);
    }

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + manufacturer + ", model=" + model + ", vehicleNumber=" + vehicleNumber + "]";
	}
    
}


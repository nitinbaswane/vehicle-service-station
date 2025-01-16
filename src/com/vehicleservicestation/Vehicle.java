package src.com.vehicleservicestation;
import java.util.Objects;


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
	    


	
	
}

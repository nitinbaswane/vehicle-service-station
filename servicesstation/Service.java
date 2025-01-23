package servicesstation;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

class Service implements Serializable {
	private static final long serialVersionUID = 1L;
    private static final double TAX_RATE = 12.6;
    private int serviceId;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate serviceDate;
    private List<Maintenance> maintenanceList;
    private List<OilChange> oilChangeList;
    private double totalAmount;
    private boolean isPaid;
    
    public Service(int serviceId, Customer customer, Vehicle vehicle) {
        this.serviceId = serviceId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.serviceDate = LocalDate.now();
        this.maintenanceList = new LinkedList<>();
        this.oilChangeList = new LinkedList<>();
        this.totalAmount = 0.0;
        this.isPaid = false;
    }
    
    public void addMaintenance(Maintenance maintenance) {
        maintenanceList.add(maintenance);
        calculateTotal();
    }
    
    public void addOilChange(OilChange oilChange) {
        oilChangeList.add(oilChange);
        calculateTotal();
    }
    
    private void calculateTotal() {
        totalAmount = 0.0;
        for (Maintenance m : maintenanceList) {
            totalAmount += m.getCost();
        }
        for (OilChange o : oilChangeList) {
            totalAmount += o.getCost();
        }
        totalAmount += (totalAmount * TAX_RATE / 100);
    }
    
    public double getTotalAmount() { return totalAmount; }
    public boolean isPaid() { return isPaid; }
    public void setPaid(boolean paid) { isPaid = paid; }
    public LocalDate getServiceDate() { return serviceDate; }
    public int getServiceId() { return serviceId; }

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
    
}


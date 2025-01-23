package servicesstation;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

class OilChange implements Serializable {
	private static final long serialVersionUID = 1L;
    private String oilType;
    private double quantity;
    private double pricePerUnit;
    private List<String> additives;
    
    public OilChange(String oilType, double quantity, double pricePerUnit) {
        this.oilType = oilType;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.additives = new LinkedList<>();
    }
    
    public void addAdditive(String additive) {
        additives.add(additive);
    }
    
    public double getCost() {
        return quantity * pricePerUnit;
    }
}

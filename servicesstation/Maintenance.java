package servicesstation;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

class Maintenance implements Serializable {
	private static final long serialVersionUID = 1L;
    private String description;
    private List<Part> replacedParts;
    private double laborCharges;
    
    public Maintenance(String description, double laborCharges) {
        this.description = description;
        this.laborCharges = laborCharges;
        this.replacedParts = new LinkedList<>();
    }
    
    public void addPart(Part part) {
        replacedParts.add(part);
    }
    
    public double getCost() {
        double partsCost = replacedParts.stream()
                .mapToDouble(Part::getPrice)
                .sum();
        return partsCost + laborCharges;
    }
}


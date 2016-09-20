
package jv1607.homeworks.ht_Interface.classes;

import jv1607.homeworks.ht_Interface.interfaces.Peellable;

public abstract class Plant{

    private double weight;
    private String color;
    private boolean maturity;
    private String status;
    private boolean brush=false;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMaturity() {
        return maturity;
    }

    public void setMaturity(boolean maturity) {
        this.maturity = maturity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isBrush() {
        return brush;
    }

    public void setBrush(boolean brush) {
        this.brush = brush;
    }

    public Plant() {
    }
    
    
    
    public Plant(double weight, String color, boolean maturity, String status, boolean brush) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.status = status;
        this.brush = brush;
    }
    
//Override
//    public void peell(double persent) {
//        weight = weight - (weight * persent);
//        brush = true;
//    }
    
    @Override
    public String toString() {
        return "Plant{" + "weight=" + weight + ", color=" + color + ", maturity=" + maturity + ", status=" + status + ", brush=" + brush + '}';
    }
}

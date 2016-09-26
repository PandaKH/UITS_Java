
package jv1607.homeworks.ht_Interface.classes;

import jv1607.homeworks.ht_Interface.interfaces.Peellable;

public abstract class Plant{

    private double weight;
    private String color;
    private boolean maturity;
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
    public boolean isBrush() {
        return brush;
    }

    public void setBrush(boolean brush) {
        this.brush = brush;
    }

    public Plant() {
    }
    
    public Plant(double weight, String color, boolean maturity, boolean brush) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.brush = brush;
    }

    @Override
    public String toString() {
        return "Plant{" + "weight=" + weight + ", color=" + color + ", maturity=" + maturity + ", brush=" + brush + '}';
    }
    
    
}

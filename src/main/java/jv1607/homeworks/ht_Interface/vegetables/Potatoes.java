package jv1607.homeworks.ht_Interface.vegetables;

import jv1607.homeworks.ht_Interface.classes.Vegetable;

public class Potatoes extends Vegetable{

    public Potatoes() {
    }

    public Potatoes(double weight, String color, boolean maturity, boolean brush) {
        super(weight, color, maturity, brush);
    }

    @Override
    public String toString() {
        return super.toString() + "(onion)";
    }
    
}

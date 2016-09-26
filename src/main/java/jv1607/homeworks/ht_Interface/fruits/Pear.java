package jv1607.homeworks.ht_Interface.fruits;

import jv1607.homeworks.ht_Interface.classes.Fruit;

public class Pear extends Fruit{

    public Pear() {
    }

    public Pear(double weight, String color, boolean maturity, boolean brush) {
        super(weight, color, maturity, brush);
    }

    @Override
    public String toString() {
        return super.toString() + "(pear)";
    }
    
}

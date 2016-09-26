package jv1607.homeworks.ht_Interface.fruits;

import jv1607.homeworks.ht_Interface.classes.Fruit;

public class Apple extends Fruit{

    public Apple() {
    }

    public Apple(double weight, String color, boolean maturity, boolean brush) {
        super(weight, color, maturity,brush);
    }
    
    @Override
    public String toString() {
        return super.toString() + "(apple)";
    }
    
}

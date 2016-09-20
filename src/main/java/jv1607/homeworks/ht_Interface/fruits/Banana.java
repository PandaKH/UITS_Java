
package jv1607.homeworks.ht_Interface.fruits;

import jv1607.homeworks.ht_Interface.classes.Fruit;

public class Banana extends Fruit{

    public Banana(double weight, String color, boolean maturity, String status, boolean brush) {
        super(weight, color, maturity, status, brush);
    }
    
    @Override
    public String toString() {
        return super.toString() + "(banana)";
    }
}

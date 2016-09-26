
package jv1607.homeworks.ht_Interface.vegetables;

import jv1607.homeworks.ht_Interface.classes.Vegetable;

public class Onions extends Vegetable{

    public Onions() {
    }

    public Onions(double weight, String color, boolean maturity, boolean brush) {
        super(weight, color, maturity, brush);
    }

    @Override
    public String toString() {
        return super.toString() + "(onion)";
    }
}


package jv1607.homeworks.ht_Interface.vegetables;

import jv1607.homeworks.ht_Interface.classes.Vegetable;

public class Onions extends Vegetable{

    public Onions(double weight, String color, boolean maturity, String status, boolean brush) {
        super(weight, color, maturity, status, brush);
    }

    @Override
    public String toString() {
        return super.toString() + "(onion)";
    }
}

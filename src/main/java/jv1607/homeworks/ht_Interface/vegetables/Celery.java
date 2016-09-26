
package jv1607.homeworks.ht_Interface.vegetables;

import jv1607.homeworks.ht_Interface.classes.Vegetable;

public class Celery extends Vegetable{

    public Celery() {
    }
    
    public Celery(double weight, String color, boolean maturity,  boolean brush) {
        super(weight, color, maturity, brush);
    }

    @Override
    public String toString() {
        return super.toString() + "(celery)";
    }
    
}

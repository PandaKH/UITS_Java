package jv1607.homeworks.ht_Interface.classes;

import jv1607.homeworks.ht_Interface.interfaces.Peellable;

public class Fruit extends Plant implements Peellable{

    public Fruit() {
    }
    
    public Fruit(double weight, String color, boolean maturity, String status, boolean brush) {
        super(weight, color, maturity, status, brush);
    }
    
    @Override
    public void peell(){
        this.setWeight(getWeight()*0.92);
        this.setBrush(true);
    }

    @Override
    public String toString() {
        return super.toString() + "is fruit";
    }
    
}

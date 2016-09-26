package jv1607.homeworks.ht_Interface.classes;

import jv1607.homeworks.ht_Interface.interfaces.Peellable;

public class Fruit extends Plant implements Peellable{

    public Fruit() {
    }
    
    public Fruit(double weight, String color, boolean maturity, boolean brush) {
        super(weight, color, maturity, brush);
    }
    
    @Override
    public void peell(){
        this.setWeight(getWeight()*0.98);
        this.setBrush(true);
    }

    @Override
    public String toString() {
        return super.toString() + "is fruit";
    }
    
}

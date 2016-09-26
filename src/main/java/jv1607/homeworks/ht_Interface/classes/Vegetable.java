
package jv1607.homeworks.ht_Interface.classes;

import jv1607.homeworks.ht_Interface.interfaces.Peellable;

public class Vegetable extends Plant implements Peellable{

    public Vegetable() {
    }
        
    public Vegetable(double weight, String color, boolean maturity,boolean brush) {
        super(weight, color, maturity, brush);
    }
    
    @Override
    public void peell(){
        this.setWeight(getWeight()*0.95);
        this.setBrush(true);
    }
    
    @Override
    public String toString() {
        return super.toString() + "is vegetable";
    }
}

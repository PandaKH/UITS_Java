
package jv1607.homeworks.ht_Interface.classes;

import jv1607.homeworks.ht_Interface.interfaces.Cutter;
import jv1607.homeworks.ht_Interface.interfaces.Peeller;
import jv1607.homeworks.ht_Interface.interfaces.Slicer;

public class Combine extends Fruit implements Cutter, Peeller, Slicer{

    @Override
    public double cut(Plant plant) {
        plant.setWeight(getWeight()*0.98);
        return plant.getWeight();
    }

    @Override
    public double peellItem(Plant plant) {
        System.out.println("Чистка!!");
        return plant.getWeight();
    }

    @Override
    public double slice(Plant plant) {
        System.out.println("Нарезка ломтиком");
        plant.setWeight(getWeight()*0.98);
        return plant.getWeight();
    }

    @Override
    public double cutAll(Plant[] plant) {
        double weight=0;
        for(int i=0;i<plant.length;i++){
            plant[i].setWeight(getWeight()*0.98);
            weight+=plant[i].getWeight();
        }
        return weight;
    }

    @Override
    public double peellItems(Plant[] plant) {
        double weight=0;
        System.out.println("Чистка!!");
        for(int i=0;i<plant.length;i++){
            weight+=plant[i].getWeight();
        }
        return weight;
    }

    @Override
    public double sliceAll(Plant[] plant) {
        double weight=0;
        System.out.println("Нарезка ломтиком");
        for(int i=0;i<plant.length;i++){
            weight+=plant[i].getWeight();
        }
        return weight;
    }
}

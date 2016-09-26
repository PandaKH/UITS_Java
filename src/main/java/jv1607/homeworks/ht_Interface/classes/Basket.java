
package jv1607.homeworks.ht_Interface.classes;

import java.util.Arrays;

public class Basket {
    private Plant[] basket;
    private static int counter=0;
    public Basket() {
    }
    
    public Basket(Plant[] basket) {
        this.basket = basket;
    }

    public Basket(Plant[] basket, int counter) {
        this.basket = basket;
        this.counter = counter;
    }
    
    public Plant[] getPlant() {
        return basket;
    }
    
    public void setPlant(Plant[] plant) {
        this.basket= plant;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public Plant[] extend(Plant[] basket){
        int n = ((3 * counter) / 2) + 1;
        Plant[] newBasket = new Plant[n];
        System.arraycopy(basket,0,newBasket,0,basket.length);
        return newBasket;
    }
    
    public void put(Plant plant){
        if (counter == basket.length) {
           basket = extend(basket);
        }
        basket[counter] = plant;
        counter ++;
    }
    
    public Plant extract(int index){
        Plant method = basket[index];
        int numMoved = basket.length - index - 1;
        if (numMoved > 0){
            System.arraycopy(basket, index+1, basket, index,numMoved);
        }
        basket[basket.length-1]=null;
        return method;
    }
    
    public Plant[] extractAll(Plant[] plant){
        Plant[] array =  new Plant[plant.length];
        for(int i=0;i<plant.length;i++){
            array[i]=plant[i];
            plant[i]=null;
        }
        return array;
    }
    
    public double getWeight(){
        double weight = 0;
        for (int i = 0; i < basket.length; i++) {
            if(basket[i]==null){
                break;
            }
            weight += basket[i].getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Basket{\n" +
                "basket=\n"
                +Arrays.toString(basket)
                + "\n" +'}';
    }
    
}


package jv1607.homeworks.ht_Interface.classes;

public class Basket {
    private Plant[] basket;
    private int counter=0;
    

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

    public Basket() {
    }

    public Basket(Plant[] basket, int counter) {
        this.basket = basket;
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
    
    public Plant extract(int position){
        Plant method = basket[position];
        basket[position]= null;
        return method;
    }
    
}

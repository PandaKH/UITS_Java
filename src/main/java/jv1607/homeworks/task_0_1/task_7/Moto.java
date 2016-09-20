
package jv1607.homeworks.task_0_1.task_7;

public class Moto implements Comparable<Moto>{
    private String name;
    private Integer price;
    private int weigth;

    public Moto() {
    }

    public Moto(String name, int price, int weigth) {
        this.name = name;
        this.price = price;
        this.weigth = weigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Moto{" + "name=" + name + ", price=" + price + "$, weigth=" + weigth +"кг"+ '}';
    }

    @Override
    public int compareTo(Moto o) {
        return this.price.compareTo(o.price);
    }
    
}

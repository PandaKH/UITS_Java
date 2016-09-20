
package jv1607.homeworks.task_0_1.task_6;

public class Stones implements Comparable<Stones>{
    private String name;
    private double weigth;
    private Double price;
    private int transparency;

    public Stones() {
    }

    public Stones(String name, double weigth, double price, int transparency) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
        this.transparency = transparency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
    
    @Override
    public String toString() {
        return "Stones{" + "name=" + name + ", weigth=" + String.format("%.2f",weigth) + "карат, price=" + String.format("%.2f",price) + "$, transparency=" + transparency + '}';
    }

    @Override
    public int compareTo(Stones o) {
        return this.price.compareTo(o.price);
    }
    
}

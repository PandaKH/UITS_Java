
package jv1607.homeworks.task_0_1.task_2;

public class Candys implements Comparable<Candys>{
    private String name;
    private int weigth;
    private int sugar;

    public Candys() {
    }

    public Candys(String name, int weigth, int sugar) {
        this.name = name;
        this.weigth = weigth;
        this.sugar = sugar;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Present{" + "name=" + name + ", weigth=" + weigth + "г, sugar=" + sugar + "г" + '}';
    }

    @Override
    public int compareTo(Candys o) {
        return this.name.compareTo(o.name);
    }
    
}

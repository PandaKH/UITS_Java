
package jv1607.homeworks.task_0_1.task_2;

public class Candys implements Comparable<Candys>{
    private Name name;
    private int weigth;
    private int sugar;
    
    public enum Name{
        Леденцы,
        Жевательная,
        Ириски,
        Мармелад,
        Шоколад,
        Молочные
    }

    public Candys() {
    }

    public Candys(Name name, int weigth, int sugar) {
        this.name = name;
        this.weigth = weigth;
        this.sugar = sugar;
    }
    
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
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

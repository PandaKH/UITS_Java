
package jv1607.homeworks.task_0_1.task_1;

public class Flowers implements Comparable<Flowers>{
    private Name name;
    private int price;
    private Integer lvlFreshness;
    private int legth;
    
    public enum Name{
        Роза,
        Ромашка,
        Хризантема,
        Гладиолус
    }
    public Flowers() {
    }

    public Flowers(Name name, int price, int lvlFreshness, int legth) {
        this.name = name;
        this.price = price;
        this.lvlFreshness = lvlFreshness;
        this.legth = legth;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getLvlFreshness() {
        return lvlFreshness;
    }

    public void setLvlFreshness(Integer lvlFreshness) {
        this.lvlFreshness = lvlFreshness;
    }

    public int getLegth() {
        return legth;
    }

    public void setLegth(int legth) {
        this.legth = legth;
    }
    
    @Override
    public String toString() {
        return "Flowers{" + "name=" + name + ", price=" + price + ", lvlFreshness=" + lvlFreshness + ", legth=" + legth + '}';
    }

    @Override
    public int compareTo(Flowers o) {
        return this.lvlFreshness.compareTo(o.lvlFreshness);
    }
    
}

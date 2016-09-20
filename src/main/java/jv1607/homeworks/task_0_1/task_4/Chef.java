
package jv1607.homeworks.task_0_1.task_4;

public class Chef implements Comparable<Chef>{
    private Name name;
    private int calorific;

    public Chef() {
    }

    public Chef(Name name, int calorific) {
        this.name = name;
        this.calorific = calorific;
    }
    
    public enum Name{
        Помидор,
        Огурцы,
        Перец_болгарский,
        Чеснок,
        Баклажан,
        Морковь,
        Лук_репчатый,
    }
    
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getCalorific() {
        return calorific;
    }

    public void setCalorific(int calorific) {
        this.calorific = calorific;
    }

    @Override
    public String toString() {
        return "Chef{" + "name=" + name + ", calorific=" + calorific + '}';
    }

    @Override
    public int compareTo(Chef o) {
        return this.name.compareTo(o.name);
    }
    
}


package jv1607.homeworks.task_0_1.task_4;

public class Chef implements Comparable<Chef>{
    private String name;
    private int calorific;

    public Chef() {
    }

    public Chef(String name, int calorific) {
        this.name = name;
        this.calorific = calorific;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
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

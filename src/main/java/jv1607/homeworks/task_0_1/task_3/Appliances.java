
package jv1607.homeworks.task_0_1.task_3;

public class Appliances implements Comparable<Appliances>{
    private Name name;
    private Integer power;
    private String status;
    
    public Appliances() {
    }

    public Appliances(Name name, int power, String status) {
        this.name = name;
        this.power = power;
        this.status = status;
    }
    
    public enum Name {
        Фен,
        Обогреватель,
        Кофеварка,
        Тостер,
        Пылесос,
        Cтиральная_машина,
        Блендер,
        Монитор,
        Ноутбук,
        Принтер
    }
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appliances{" + "name=" + name + ", power=" + power + "Вт, status=" + status + '}';
    }

    @Override
    public int compareTo(Appliances o) {
        return this.power.compareTo(o.power);
    }
    
}

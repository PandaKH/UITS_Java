
package jv1607.homeworks.task_0_1.task_8;


public class Transport implements Comparable<Transport>{
    private String type;
    private int num;
    private int capacity;
    private Integer comfort;

    public Transport() {
    }

    public Transport(String type, int num, int capacity, int comfort) {
        this.type = type;
        this.num = num;
        this.capacity = capacity;
        this.comfort = comfort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getComfort() {
        return comfort;
    }

    public void setComfort(int comfort) {
        this.comfort = comfort;
    }

    @Override
    public String toString() {
        return "Transport{" + "type=" + type + ", num=" + num + ", capacity=" + capacity + ", comfort=" + comfort + '}';
    }

    @Override
    public int compareTo(Transport o) {
        return this.comfort.compareTo(o.comfort);
    }
    
}

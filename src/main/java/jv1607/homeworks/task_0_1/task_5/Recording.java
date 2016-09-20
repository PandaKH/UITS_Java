
package jv1607.homeworks.task_0_1.task_5;

public class Recording implements Comparable<Recording>{
    private String name;
    private String style;
    private int sec;

    public Recording() {
    }

    public Recording(String name, String style, int sec) {
        this.name = name;
        this.style = style;
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Recording{" + "name=" + name + ", style=" + style + ", sec=" + sec + '}';
    }

    @Override
    public int compareTo(Recording o) {
        return this.style.compareTo(o.style);
    }
    
}

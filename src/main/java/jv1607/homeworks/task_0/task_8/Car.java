
package jv1607.homeworks.task_0.task_8;

public class Car {
    private int id;
    private String company;
    private String model;
    private int year;
    private String color;
    private int price;
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Car() {
    }

    public Car(int id, String company, String model, int year, String color, int price, String number) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", company=" + company + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + "$, number=" + number + '}';
    }
    
}

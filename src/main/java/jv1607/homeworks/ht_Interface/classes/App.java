package jv1607.homeworks.ht_Interface.classes;

public class App {
    public static void main(String[] args) {
        Vegetable vegetables = new Vegetable();
        Fruit fruits = new Fruit();
        vegetables.setWeight(100);
        fruits.setWeight(100);
        System.out.println(vegetables);
        vegetables.peell();
        System.out.println(vegetables);
        fruits.peell();
        System.out.println(fruits);
        
    }
}

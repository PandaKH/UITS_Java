package jv1607.homeworks.ht_Interface.classes;

import java.util.Random;
import java.util.Scanner;
import jv1607.homeworks.ht_Interface.fruits.Apple;
import jv1607.homeworks.ht_Interface.fruits.Banana;
import jv1607.homeworks.ht_Interface.fruits.Orange;
import jv1607.homeworks.ht_Interface.fruits.Pear;
import jv1607.homeworks.ht_Interface.vegetables.Carrots;
import jv1607.homeworks.ht_Interface.vegetables.Celery;
import jv1607.homeworks.ht_Interface.vegetables.Onions;
import jv1607.homeworks.ht_Interface.vegetables.Potatoes;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static Plant[] plants;
    static boolean finish=false;
    
    public static void main(String[] args) {
        run();
        print();
//        Basket basket= new Basket(plants, plants.length);
//        System.out.println(basket.getCounter());
//        System.out.println(basket.getWeight());
//        Plant plant = new Onions(14 , "blue", true, false);
//        basket.put(plant);
//        System.out.println(basket);
//        System.out.println(basket.getCounter());
//        System.out.println(basket.getWeight());
//        System.out.println(basket.extract(0));
//        System.out.println(basket);
//        System.out.println(basket.getWeight());
    }
    public static void menu(){
        System.out.println("Нажмите 1, если хотите создать растение");
        System.out.println("Нажмите 2, если хотите добавить/изъять растение из корзины");
        System.out.println("Нажмите 3, если хотите почистить растение");
        System.out.println("Нажмите 4, если хотите прошинковать/нарезать растение");
        System.out.println("Нажмите 5, если хотите получить вес корзины");
    }
    
    public static void run(){
        do{
            menu();
            choice();
        }while(!(finish));
    }
    public static void choice(){
        switch(sc.nextInt()){
            case 1:{
                System.out.println("Введите сколько растений хотите добавить");
                int m=sc.nextInt();
                plants = new Plant[m];
                for(int i=0;i<plants.length;i++){
                    plants[i]=choicePlant();
                }
            }break;
            case 2:{
                choicePutExtract();
                choice();
            }break;
            default:{
                finish=true;
            }
        }
    }
    public static Plant choicePlant(){
        Plant plant=null;
        menuPlant();
        switch(sc.nextInt()){
             case 1:{
                plant=choiсeFruit();
             }break;
             case 2:{
                plant=choiсeVegetable();
             }break;
             default:{
                choice();
             }break;
         }
        return plant;
    }
    public static Plant choiсeFruit(){
        Plant fruit;
        int n=r.nextInt(4)+1;
        if(n==1){
            final String[] appleColor ={
            "green",
            "red",
            "yellow"
            };
            Plant apple = new Apple();
            apple.setColor(appleColor[r.nextInt(3)]);
            apple.setBrush(false);
            apple.setMaturity(r.nextBoolean());
            apple.setWeight(r.nextInt(12)+3);
            fruit=apple;
        }
        else if (n==2){
            final String[] bananaColor ={
            "green",
            "yellow"
            };
            Plant banana = new Banana();
            banana.setColor(bananaColor[r.nextInt(2)]);
            banana.setBrush(false);
            banana.setMaturity(r.nextBoolean());
            banana.setWeight(r.nextInt(12)+3);
            fruit=banana;
        }
        else if(n==3){
            Plant orange = new Orange();
            orange.setColor("orange");
            orange.setBrush(false);
            orange.setMaturity(r.nextBoolean());
            orange.setWeight(r.nextInt(12)+3);
            fruit=orange;
        }
        else{
            Plant pear = new Pear();
            pear.setColor("yellow");
            pear.setBrush(false);
            pear.setMaturity(r.nextBoolean());
            pear.setWeight(r.nextInt(12)+3);
            fruit=pear;
        }
        return fruit;
    }
    
    public static Plant choiсeVegetable(){
        Plant vegetable;
        int n=r.nextInt(4)+1;
        if(n==1){
            Plant carrots = new Carrots();
            carrots.setColor("orange");
            carrots.setBrush(false);
            carrots.setMaturity(r.nextBoolean());
            carrots.setWeight(r.nextInt(12)+3);
            vegetable=carrots;
        }
        else if (n==2){
            Plant celery = new Celery();
            celery.setColor("green");
            celery.setBrush(false);
            celery.setMaturity(r.nextBoolean());
            celery.setWeight(r.nextInt(12)+3);
            vegetable=celery;
        }
        else if(n==3){
            final String[] onionColor ={
            "white",
            "yellow",
            "purple"
            };
            Plant onion= new Onions();
            onion.setColor(onionColor[r.nextInt(3)]);
            onion.setBrush(false);
            onion.setMaturity(r.nextBoolean());
            onion.setWeight(r.nextInt(12)+3);
            vegetable=onion;
        }
        else{
            Plant potatoes = new Potatoes();
            potatoes.setColor("yellow");
            potatoes.setBrush(false);
            potatoes.setMaturity(r.nextBoolean());
            potatoes.setWeight(r.nextInt(12)+3);
            vegetable=potatoes;
        }
        return vegetable;
    }
    
    public static void menuPlant(){
        System.out.println("Нажмите 1, если хотите создать фрукт");
        System.out.println("Нажмите 2, если хотите создать овощ");
    }
    public static void print(){
        for(int i=0; i<plants.length;i++){
            System.out.println(plants[i]);
        }
    }
    public static void choicePutExtract(){
        
    }
}

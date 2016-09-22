
package jv1607.homeworks.task_0_1.task_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static Chef[] vegetable;
    static Chef[] salad;
    
    static final String[] name = {
        "Помидор",
        "Огурцы",
        "Перец болгарский",
        "Чеснок",
        "Баклажан",
        "Морковь",
        "Лук репчатый",
    };
    
    public static void initChef(){
        vegetable=new Chef[50];
        for(int i=0;i<vegetable.length;i++){
            Chef c = new Chef();
            c.setName(name[r.nextInt(7)]);
            if(c.getName().equals(name[0])){
                c.setCalorific(r.nextInt(30)+10);
            }
            else if(c.getName().equals(name[1])){
                c.setCalorific(r.nextInt(13)+7);
            }
            else if(c.getName().equals(name[2])){
                c.setCalorific(r.nextInt(15)+20);
            }
            else if(c.getName().equals(name[3])){
                c.setCalorific(r.nextInt(30)+140);
            }
            else if(c.getName().equals(name[4])){
                c.setCalorific(r.nextInt(60)+40);
            }
            else if(c.getName().equals(name[5])){
                c.setCalorific(r.nextInt(70)+30);
            }
            else{
                c.setCalorific(r.nextInt(20)+30);
            }
            vegetable[i]=c;
        }
    }
    public static void main(String[] args) {
        initChef();
        print(vegetable);
        System.out.println("Всего: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());
        System.out.println("");
        choice();
        System.out.println("");
        print(salad);
        Arrays.sort(salad);
        System.out.println("Sotring by name: ");
        print(salad);
        System.out.println("");
        interval(salad, 70, 100);
    }
    public static void choice(){
    int counterTomato=counterTomato();
    int counterCucumbers=counterCucumbers();
    int counterPepper=counterPepper();
    int counterGarlic=counterGarlic();
    int counterEggplant=counterEggplant();
    int counterCarrot=counterCarrot();
    int counterOnions=counterOnions();
        System.out.print("Введите количество овощей в салате: ");
        int n=sc.nextInt();
        salad =new Chef[n];
        int tomato=-1, cucumbers=-1, pepper=-1, garlic=-1, eggplant=-1, carrot=-1, onions=-1;
        int price=0, calorific=0;
        try{
            for(int i=0; i<salad.length;i++){
                menu();
                switch(sc.nextInt()){
                    case 1:{
                        tomato++;
                        if(counterTomato==0){
                            System.out.println("Помидор больше нет!!!");
                        }
                        while(!(vegetable[tomato].getName().equals(name[0]))){
                            tomato++;
                        }
                        salad[i]=vegetable[tomato];
                        calorific+=salad[i].getCalorific();
                        counterTomato--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());
                    }break;
                    case 2:{
                        cucumbers++;
                        if(counterCucumbers==0){
                            System.out.println("Огурцов больше нет!!!");
                        }
                        while(!(vegetable[cucumbers].getName().equals(name[1]))){
                            cucumbers++;
                        }
                        salad[i]=vegetable[cucumbers];
                        calorific+=salad[i].getCalorific();
                        counterCucumbers--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());                    }break;
                    case 3:{
                        pepper++;
                        if(counterPepper==0){
                            System.out.println("Перца больше нет!!!");
                        }
                        while(!(vegetable[pepper].getName().equals(name[2]))){
                            pepper++;
                        }
                        salad[i]=vegetable[pepper];
                        calorific+=salad[i].getCalorific();
                        counterPepper--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());    
                    }break;
                    case 4:{
                        garlic++;
                        if(counterGarlic==0){
                            System.out.println("Чеснока больше нет!!!");
                        }
                        while(!(vegetable[garlic].getName().equals(name[3]))){
                            garlic++;
                        }
                        salad[i]=vegetable[garlic];
                        calorific+=salad[i].getCalorific();
                        counterGarlic--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());
                    }break;
                    case 5:{
                        eggplant++;
                        if(counterEggplant==0){
                            System.out.println("Баклажана больше нет!!!");
                        }
                        while(!(vegetable[eggplant].getName().equals(name[4]))){
                            eggplant++;
                        }
                        salad[i]=vegetable[eggplant];
                        calorific+=salad[i].getCalorific();
                        counterEggplant--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());
                    }break;
                    case 6:{
                        carrot++;
                        if(counterCarrot==0){
                            System.out.println("Баклажана больше нет!!!");
                        }
                        while(!(vegetable[carrot].getName().equals(name[5]))){
                            carrot++;
                        }
                        salad[i]=vegetable[carrot];
                        calorific+=salad[i].getCalorific();
                        counterCarrot--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());
                    }break;
                    case 7:{
                        onions++;
                        if(counterOnions==0){
                            System.out.println("Баклажана больше нет!!!");
                        }
                        while(!(vegetable[onions].getName().equals(name[6]))){
                            onions++;
                        }
                        salad[i]=vegetable[onions];
                        calorific+=salad[i].getCalorific();
                        counterOnions--;
                        System.out.println("Осталось: Помидор=" +counterTomato()+" Огурцы=" +counterCucumbers()+ " болгарский перец=" +counterPepper()
                        + " Чеснок="+counterGarlic()+ " Баклажан="+counterEggplant()+ " Морковь="+counterCarrot()+ " репчатый лук=" + counterOnions());
                    }break;
                    default:{
                        salad[i]= vegetable[r.nextInt(vegetable.length)];
                        calorific+=salad[i].getCalorific();
                    }break;
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Этого овоща больше нет!!!");
        }
        print(salad);
        System.out.println("Калорий в салате: " + calorific);
    }
    public static void menu(){
        System.out.println("Нажмите 1, если хотите добавить Помидор");
        System.out.println("Нажмите 2, если хотите добавить Огурцы");
        System.out.println("Нажмите 3, если хотите добавить болгарский перец");
        System.out.println("Нажмите 4, если хотите добавить Чеснок");
        System.out.println("Нажмите 5, если хотите добавить Баклажан");
        System.out.println("Нажмите 6, если хотите добавить Морковь");
        System.out.println("Нажмите 7, если хотите добавить репчатый лук");
        System.out.println("Нажмите инное значение, если вы хотите добавить рандомный овощ");
    }
    public static void print(Chef[] chef){
        for (Chef chef1 : chef) {
            System.out.println(chef1);
        }
    }
    public static void interval(Chef[] chef, int start, int end){
        for(int i=0; i<chef.length; i++){
            if(chef[i].getCalorific()>start && chef[i].getCalorific()<end){
                System.out.println(chef[i]);
            }
        }
    }
    public static int counterTomato(){
        int countTomato=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countTomato++;
            }
        }
        return countTomato;
    }
    public static int counterCucumbers(){
        int countCucumbers=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countCucumbers++;
            }
        }
        return countCucumbers;
    }
    public static int counterPepper(){
        int countPepper=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countPepper++;
            }
        }
        return countPepper;
    }
    public static int counterGarlic(){
        int countGarlic=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countGarlic++;
            }
        }
        return countGarlic;
    }
    public static int counterEggplant(){
        int countEggplant=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countEggplant++;
            }
        }
        return countEggplant;
    }
    public static int counterCarrot(){
        int countCarrot=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countCarrot++;
            }
        }
        return countCarrot;
    }
    public static int counterOnions(){
        int countOnions=0;
        for(int i=0;i<vegetable.length;i++){
            if(vegetable[i].getName().equals(name[0])){
                countOnions++;
            }
        }
        return countOnions;
    }
}

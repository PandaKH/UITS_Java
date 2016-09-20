
package jv1607.homeworks.task_0_1.task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class App {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static Flowers[] flower;
    static Flowers[] bouquet;
    
    public static void main(String[] args) {
        initFlowers();
        print(flower);
        System.out.println("Всего: " +"роз"+ "=" +counterForRoses()+" " +"ромашек"+ "=" +counterForChamomile()+ " " 
                            +"хризантем"+ "=" +counterForChrysanthemum()+ " гладиолус="+counterForGladiolus());
        choice();
        System.out.println("");
        System.out.println("Sorting by lvlFreshness:");
        Arrays.sort(bouquet);
        print(bouquet);
        System.out.println("");
        length(bouquet, 55, 70);
    }   
    
    public static void initFlowers(){
        flower = new Flowers[50];
        for(int i = 0; i<flower.length; i++){
            Flowers f = new Flowers();
            f.setName(Flowers.Name.values()[r.nextInt(4)]);
            f.setLegth(r.nextInt(40)+40);
            if(f.getLegth()>=40 && f.getLegth()<=50){
                f.setPrice(8);
            }
            else if(f.getLegth()>=50 && f.getLegth()< 60){
                f.setPrice(12);
            }
            else if(f.getLegth()>=60 && f.getLegth()< 70){
                f.setPrice(16);
            }
            else{
                f.setPrice(20);
            }
            f.setLvlFreshness(r.nextInt(10)+1);
            flower[i]=f;
        }
    }
    
    public static int counterForRoses(){
        int countRose = 0;
        for(Flowers f: flower){
            if(f.getName().equals(Flowers.Name.values()[0])){
                countRose++;
            }
        }
        return countRose;
    }
    
    public static int counterForChamomile(){
        int countChamomile = 0;
        for(Flowers f: flower){
            if(f.getName().equals(Flowers.Name.values()[1])){
                countChamomile++;
            }
        }
      return countChamomile;
    }
    
    public static int counterForChrysanthemum(){
        int countChrysanthemum = 0;
        for(Flowers f: flower){
            if(f.getName().equals(Flowers.Name.values()[2])){
                countChrysanthemum++;
            }
        }
        return countChrysanthemum;
    }
    
    public static int counterForGladiolus(){
        int countGladiolus = 0;
        for(Flowers f: flower){
            if(f.getName().equals(Flowers.Name.values()[3])){
                countGladiolus++;
            }
        }
        return countGladiolus;
    }
    
    public static void print(Flowers[] flow){
        for (Flowers flow1 : flow) {
            System.out.println(flow1);
        }
    }
    
    public static void choice(){
        System.out.print("Введите количество цветов в букете: ");
        int n=sc.nextInt();
        bouquet =new Flowers[n];
        int rose=-1, chamomile=-1, chrysanthemum=-1, gladiolus=-1;
        int price=0;
        int counterForRoses=counterForRoses();
        int counterForChamomile=counterForChamomile();
        int counterForChrysanthemum=counterForChrysanthemum();
        int counterForGladiolus=counterForGladiolus();
        for(int i=0; i<n; i++){
            menu();
            switch(sc.nextInt()){
                case 1:{
                    rose++;
                    if(counterForRoses()==0){
                        System.out.println("Роз больше нет!!!");
                    }
                    while(!(flower[rose].getName().equals(Flowers.Name.values()[0]))){
                        rose++;
                    }
                    bouquet[i]=flower[rose];
                    price+=bouquet[i].getPrice();
                    counterForRoses--;
                    System.out.println("Осталось: роз="+counterForRoses() + " ромашек=" +counterForChamomile()
                                +" хризантем=" + counterForChrysanthemum()+ " гладиолус="+counterForGladiolus());
                }break;
                case 2:{
                    chamomile++;
                    if(counterForChamomile()==0){
                        System.out.println("Ромашек больше нет!!!");
                    }
                    while(!(flower[chamomile].getName().equals(Flowers.Name.values()[1]))){
                        chamomile++;
                    }
                    bouquet[i]=flower[chamomile];
                    price+=bouquet[i].getPrice();
                    counterForChamomile--;
                    System.out.println("Осталось: роз="+counterForRoses + " ромашек=" +counterForChamomile
                                + " хризантем=" + counterForChrysanthemum + " гладиолус="+counterForGladiolus);
                }break;
                case 3:{
                    chrysanthemum++;
                    if(counterForChrysanthemum()==0){
                        System.out.println("Хризантем больше нет!!!");
                    }
                    while(!(flower[chrysanthemum].getName().equals(Flowers.Name.values()[2]))){
                        chrysanthemum++;
                    }
                    bouquet[i]=flower[chrysanthemum];
                    price+=bouquet[i].getPrice();
                    counterForChrysanthemum--;
                    System.out.println("Осталось: роз="+counterForRoses + " ромашек=" +counterForChamomile
                                + " хризантем=" + counterForChrysanthemum + " гладиолус="+counterForGladiolus);
                }break;
                case 4:{
                    gladiolus++;
                    if(counterForGladiolus()==0){
                        System.out.println("Хризантем больше нет!!!");
                    }
                    while(!(flower[gladiolus].getName().equals(Flowers.Name.values()[3]))){
                        gladiolus++;
                    }
                    bouquet[i]=flower[gladiolus];
                    price+=bouquet[i].getPrice();
                    counterForGladiolus--;
                    System.out.println("Осталось: роз="+counterForRoses+ " ромашек=" +counterForChamomile
                                + " хризантем=" + counterForChrysanthemum+ " гладиолус="+counterForGladiolus);
                }break;
                default:{
                    bouquet[i]= flower[r.nextInt(flower.length)];
                    price+=bouquet[i].getPrice();
                }break;
            }
        }
        print(bouquet);
        System.out.println("Стоимость букета = " + price);
    }
    
    public static void menu(){
        System.out.println("Нажмите 1, если хотите добавить розу");
        System.out.println("Нажмите 2, если хотите добавить ромашку");
        System.out.println("Нажмите 3, если хотите добавить хризантему");
        System.out.println("Нажмите 4, если хотите добавить гладиолус");
        System.out.println("Нажмите инное значение, если вы хотите чтоб мы подобрали за вас");
    }
    
    public static void length(Flowers[] bouq, int start, int end){
        System.out.println("Цветы имещие длину стеблей больше " + start + " и меньше " +end);
        for (Flowers bouq1 : bouq) {
            if (bouq1.getLegth() > start && bouq1.getLegth() < end) {
                System.out.println(bouq1);
            }
        }
    }
}

package jv1607.homeworks.task_0_1.task_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static Moto[] moto;
    static Moto[] human;
    
    static final String[] name = {
        "Куртка",
        "Штаны",
        "Боты",
        "Перчатки",
        "Шлем",
        "Защита",
        "Носки",
        "Сумка",
    };
    
    public static void initMoto(){
        moto = new Moto[200];
        for(int i=0; i<moto.length;i++){
            Moto m = new Moto();
            m.setName(name[r.nextInt(8)]);
            if(m.getName().equals(name[0])){
                m.setPrice(r.nextInt(400)+100);
                m.setWeigth(r.nextInt(10)+5);
            }
            else if(m.getName().equals(name[1])){
                m.setPrice(r.nextInt(200)+100);
                m.setWeigth(r.nextInt(10)+5);
            }
            else if(m.getName().equals(name[2])){
                m.setPrice(r.nextInt(300)+100);
                m.setWeigth(r.nextInt(15)+7);
            }
            else if(m.getName().equals(name[3])){
                m.setPrice(r.nextInt(100)+100);
                m.setWeigth(r.nextInt(5)+1);
            }
            else if(m.getName().equals(name[4])){
                m.setPrice(r.nextInt(700)+150);
                m.setWeigth(r.nextInt(25)+12);
            }
            else if(m.getName().equals(name[5])){
                m.setPrice(r.nextInt(80)+20);
                m.setWeigth(r.nextInt(15)+5);
            }
            else if(m.getName().equals(name[6])){
                m.setPrice(r.nextInt(20)+5);
                m.setWeigth(r.nextInt(3)+1);
            }
            else{
                m.setPrice(r.nextInt(100)+50);
                m.setWeigth(r.nextInt(5)+5);
            }
            moto[i]=m;
        }
    }
    
    public static void main(String[] args) {
        initMoto();
        System.out.println("");
        print(moto);
        Arrays.sort(human);
        System.out.println("Sorting by price");
        print(human);
        System.out.println("");
        interval(moto, 10, 15);
    }
    
    public static void choice(){
        
        System.out.print("Введи количество вещей которые хотите купить: ");
        int n = sc.nextInt();
        human = new Moto[n];
        int kurt=-1, wtan=-1, bot=-1, per=-1, wlem=-1, zaw=-1, nos=-1, sum=-1, price=0;
        try{
            for(int i=0; i<human.length;i++){
                System.out.print("Введите вес вещи которую хотите купить:");
                int m=sc.nextInt();
                menu(); 
                switch(sc.nextInt()){
                    case 1:{
                        kurt++;
                        while(!(moto[kurt].getName().equals(name[0])&& moto[kurt].getWeigth()==m)){
                                        kurt++;
                        }
                        human[i]= moto[kurt];
                        price+=human[i].getPrice();
                    }break;
                    case 2:{
                        wtan++;
                        while(!(moto[wtan].getName().equals(name[1])&& moto[wtan].getWeigth()==m)){
                                        wtan++;
                        }
                        human[i]= moto[wtan];
                        price+=human[i].getPrice();
                    }break;
                    case 3:{
                        bot++;
                        while(!(moto[bot].getName().equals(name[2])&& moto[bot].getWeigth()==m)){
                                        bot++;
                        }
                        human[i]= moto[bot];
                        price+=human[i].getPrice();
                    }break;
                    case 4:{
                        per++;
                        while(!(moto[per].getName().equals(name[3])&& moto[per].getWeigth()==m)){
                                        per++;
                        }
                        human[i]= moto[per];
                        price+=human[i].getPrice();
                    }break;
                    case 5:{
                        wlem++;
                        while(!(moto[wlem].getName().equals(name[4])&& moto[wlem].getWeigth()==m)){
                                        wlem++;
                        }
                        human[i]= moto[wlem];
                        price+=human[i].getPrice();
                    }break;
                    case 6:{
                        zaw++;
                        while(!(moto[zaw].getName().equals(name[5])&& moto[zaw].getWeigth()==m)){
                                        zaw++;
                        }
                        human[i]= moto[zaw];
                        price+=human[i].getPrice();
                    }break;
                    case 7:{
                        nos++;
                        while(!(moto[nos].getName().equals(name[6])&& moto[nos].getWeigth()==m)){
                                        nos++;
                        }
                        human[i]= moto[nos];
                        price+=human[i].getPrice();
                    }break;
                    case 8:{
                        sum++;
                        while(!(moto[sum].getName().equals(name[7])&& moto[sum].getWeigth()==m)){
                                        sum++;
                        }
                        human[i]= moto[sum];
                        price+=human[i].getPrice();
                    }break;
                    default:{
                        human[i]=moto[r.nextInt(moto.length)];
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Такой вещи нету!!!");
        }
        print(human);
        System.out.println("price="+price);
    }
    
    public static void menu(){
        System.out.println("Нажмите 1, если хотите купить мотокуртку");
        System.out.println("Нажмите 2, если хотите купить Мотоштаны");
        System.out.println("Нажмите 3, если хотите купить Мотоботы");
        System.out.println("Нажмите 4, если хотите купить Мотоперчатки");
        System.out.println("Нажмите 5, если хотите купить Мотошлем");
        System.out.println("Нажмите 6, если хотите купить Мотозащита");
        System.out.println("Нажмите 7, если хотите купить Мотоноски");
        System.out.println("Нажмите 8, если хотите купить Сумка");
        System.out.println("Нажмите инное значение, если хотите чтоб мы подобрали 1 вещь за вас");
    }
    
    public static void print(Moto[] moto){
        for(int i=0;i<moto.length;i++){
            System.out.println(moto[i]);
        }
    }
    
    public static void interval(Moto[] moto, int start, int end){
        System.out.println("Все вещи с весом от " + start + " до " +end);
        for(int i=0; i< moto.length; i++){
            if(moto[i].getWeigth()>start && moto[i].getWeigth()<end){
                System.out.println(moto[i]);
            }
        }
    }
}

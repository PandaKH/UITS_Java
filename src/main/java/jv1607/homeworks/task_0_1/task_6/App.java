
package jv1607.homeworks.task_0_1.task_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc=new Scanner(System.in);
    static Random r = new Random();
    static Stones [] stones;
    static Stones [] necklace;
    
    static final String[] name ={
        "Алмазы",
        "Гелиодор",
        "Жемчуг",
        "Шпинель",
        "Кораллы",
        "Лазурит",
        "Рубин",
        "Сапфир",
    };
    
    public static void initStones(){
        stones = new Stones[100];
        for(int i=0; i<stones.length;i++){
            Stones s = new Stones();
            s.setName(name[r.nextInt(8)]);
            s.setTransparency(r.nextInt(5)+1);
            s.setWeigth(Math.random()*1);
            s.setPrice(s.getWeigth()*s.getTransparency()*100);
            stones[i]=s;
        }
    }
    
    public static void main(String[] args) {
        initStones();
        System.out.println("");
        print(stones);
        choice();
        System.out.println("");
        System.out.println("Sorting by price:");
        Arrays.sort(necklace);
        print(necklace);
        System.out.println("");
        interval(necklace, 2, 4);
    }
    
    public static void choice(){
        System.out.print("Введите сколько камней хотите отобрать для ожерелья:");
        int n = sc.nextInt();
        necklace = new Stones[n];
        int diamond=-1, heliodor=-1, pearl=-1, spinel=-1, corals=-1, lapis =-1, ruby=-1, sapphire=-1, price=0;
        double weigth=0;
        try{  
            for(int i=0;i<necklace.length; i++){
                System.out.print("Введите уровень прозрачности(от 1 до 5):");
                int m=sc.nextInt();
                menu();
                switch(sc.nextInt()){
                    case 1:{
                        diamond++;
                        while(!(stones[diamond].getName().equals(name[0])&&stones[diamond].getTransparency()==m)){
                                    diamond++;
                        }
                        necklace[i]= stones[diamond];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 2:{
                        heliodor++;
                        while(!(stones[heliodor].getName().equals(name[1])&&stones[heliodor].getTransparency()==m)){
                                    heliodor++;
                        }
                        necklace[i]= stones[heliodor];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 3:{
                        pearl++;
                        while(!(stones[pearl].getName().equals(name[2])&&stones[pearl].getTransparency()==m)){
                                    pearl++;
                        }
                        necklace[i]= stones[pearl];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 4:{
                        spinel++;
                        while(!(stones[spinel].getName().equals(name[3])&&stones[spinel].getTransparency()==m)){
                                    spinel++;
                        }
                        necklace[i]= stones[spinel];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 5:{
                        corals++;
                        while(!(stones[corals].getName().equals(name[4])&&stones[corals].getTransparency()==m)){
                                    corals++;
                        }
                        necklace[i]= stones[corals];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 6:{
                        lapis++;
                        while(!(stones[lapis].getName().equals(name[5])&&stones[lapis].getTransparency()==m)){
                                    lapis++;
                        }
                        necklace[i]= stones[lapis];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 7:{
                        ruby++;
                        while(!(stones[ruby].getName().equals(name[6])&&stones[ruby].getTransparency()==m)){
                                    ruby++;
                        }
                        necklace[i]= stones[ruby];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    case 8:{
                        sapphire++;
                        while(!(stones[sapphire].getName().equals(name[7])&&stones[sapphire].getTransparency()==m)){
                                    sapphire++;
                        }
                        necklace[i]= stones[sapphire];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }break;
                    default:{
                        necklace[i]=stones[r.nextInt(stones.length)];
                        price+=necklace[i].getPrice();
                        weigth+=necklace[i].getWeigth();
                    }
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Такого камня больше нет!!!");
        }
        print(necklace);
        System.out.println("Вес=" + String.format("%.2f",weigth) + "карат Цена=" + price);
    }
    
    public static void print(Stones [] st){
        for(int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }
    }
    public static void menu(){
        System.out.println("Нажмите 1, если хотите добавить Алмаз");
        System.out.println("Нажмите 2, если хотите добавить Гелиодор");
        System.out.println("Нажмите 3, если хотите добавить Жемчуг");
        System.out.println("Нажмите 4, если хотите добавить Шпинель");
        System.out.println("Нажмите 5, если хотите добавить Кораллы");
        System.out.println("Нажмите 6, если хотите добавить Лазурит");
        System.out.println("Нажмите 7, если хотите добавить Рубин");
        System.out.println("Нажмите 8, если хотите добавить Сапфир");
        System.out.println("Нажмите инное значение, если хотите чтоб мы выбрали за вас");
    }
    
     public static void interval(Stones[] st, int start, int end){
         System.out.println("Драгоценные камни с уровнем прозрачности от " + start + " до " + end);
        for(int i=0; i< st.length; i++){
            if(st[i].getTransparency()>=start && st[i].getTransparency()<=end){
                System.out.println(st[i]);
            }
        }
    }
}

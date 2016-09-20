
package jv1607.homeworks.task_0_1.task_8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc= new Scanner(System.in);
    static Random r = new Random();
    static Transport[] trans;
    static Transport[] buy;
    
    static final String []type ={
        "Трамвай",
        "Маршрутка",
        "Троллейбус"
    };
    
    public static void initTransport(){
        trans=new Transport[200];
        for(int i=0; i<trans.length;i++){
            Transport t = new Transport();
            t.setType(type[r.nextInt(3)]);
            if(t.getType().equals(type[0])){
                t.setNum(r.nextInt(50)+1);
                t.setCapacity(r.nextInt(70)+50);
            }
            else if(t.getType().equals(type[1])){
                t.setNum(r.nextInt(90)+10);
                t.setCapacity(r.nextInt(70)+70);
            }
            else{
                t.setNum(r.nextInt(90)+10);
                t.setCapacity(r.nextInt(50)+50);
            }
            t.setComfort(r.nextInt(5)+1);
            trans[i]=t;
        }
    }
    
    public static void main(String[] args) {
        initTransport();
        System.out.println("");
        print(trans);
        System.out.println("");
        System.out.println("Sorting by comfort: ");
        Arrays.sort(trans);
        print(trans);
        System.out.println("");
        interval(trans, 50, 70);
    }
    
    public static void choice(){
        System.out.print("Введите сколько транспорта хотите купить: ");
        int n=sc.nextInt();
        buy = new Transport[n];
        int tram=-1, troll=-1, marsh=-1, capacity=0;
        try{
            for(int i=0;i<buy.length;i++){
                System.out.print("Введите количество необходимой вместимости: ");
                int m=sc.nextInt();
                menu();
                switch(sc.nextInt()){
                    case 1:{
                        tram++;
                        while(!(trans[tram].getType().equals(type[0])&& trans[tram].getCapacity()>=m)){
                                    tram++;
                        }
                        buy[i]= trans[tram];
                        capacity+=buy[i].getCapacity();
                    }break;
                    case 2:{
                        marsh++;
                        while(!(trans[marsh].getType().equals(type[1])&& trans[marsh].getCapacity()>=m)){
                                    marsh++;
                        }
                        buy[i]= trans[marsh];
                        capacity+=buy[i].getCapacity();
                    }break;
                    case 3:{
                        troll++;
                        while(!(trans[troll].getType().equals(type[2])&& trans[troll].getCapacity()>=m)){
                                    troll++;
                        }
                        buy[i]= trans[troll];
                        capacity+=buy[i].getCapacity();
                    }break;
                    default:{
                        buy[i]=trans[r.nextInt(trans.length)];
                        capacity+=buy[i].getCapacity();
                    }
                }
            }
            
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Такого транспорта больше нет!!!");
        }
        print(buy);
        System.out.println("Всего вместимости: " + capacity);
    }
    
    public static void menu(){
        System.out.println("Нажмите 1, если хотите купить трамвай");
        System.out.println("Нажмите 2, если хотите купить маршрутка");
        System.out.println("Нажмите 3, если хотите купить троллейбус");
        System.out.println("Нажмите инное значение, если хотите выбрать рандом тип");
    }
    
    public static void print(Transport[] trans){
        for(int i=0;i<trans.length;i++){
            System.out.println(trans[i]);
        }
    }
    
    public static void interval(Transport[] trans, int start, int end){
        System.out.println("Транспорт с вместимостью от " + start + " до " + end);
        for(int i=0;i<trans.length;i++){
            if(trans[i].getCapacity()>start && trans[i].getCapacity()<end){
                System.out.println(trans[i]);
            }
        }
    }
}

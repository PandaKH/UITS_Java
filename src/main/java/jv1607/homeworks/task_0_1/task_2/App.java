
package jv1607.homeworks.task_0_1.task_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static Candys[] candy;
    static Candys[] present;
    
    static final int[] weigth= {
        200,
        250,
        300,
        350,
        500
    };
    
    static final String [] name ={
        "Леденцы",
        "Жевательная",
        "Ириски",
        "Мармелад",
        "Шоколад",
        "Молочные"
    };
    public static void initCandys(){
        candy = new Candys[50];
        for(int i=0; i<candy.length; i++){
            Candys p = new Candys();
            p.setName(name[r.nextInt(6)]);
            p.setWeigth(weigth[r.nextInt(5)]);
            if(p.getWeigth()==0){
                p.setSugar(r.nextInt(20)+80);
            }
            else if(p.getWeigth()==1){
                p.setSugar(r.nextInt(20)+100);
            }
            else if(p.getWeigth()==2){
                p.setSugar(r.nextInt(20)+120);
            }
            else if(p.getWeigth()==3){
                p.setSugar(r.nextInt(20)+140);
            }
            else if(p.getWeigth()==4){
                p.setSugar(r.nextInt(20)+160);
            }
            else {
                p.setSugar(r.nextInt(20)+180);
            }
            candy[i]=p;
        }
    }
    
    public static int counterLollipops(){
        int countoLollipops=0;
        for(int i=0;i<candy.length;i++){
            if(candy[i].getName().equals(name[0])){
                countoLollipops+=candy[i].getWeigth();
            }
        }
        return countoLollipops;
    }
    public static int counterChewing(){
        int counterChewing=0;
        for(int i=0;i<candy.length;i++){
            if(candy[i].getName().equals(name[1])){
                counterChewing+=candy[i].getWeigth();
            }
        }
        return counterChewing;
    }
    public static int counterToffees(){
        int counterToffees=0;
        for(int i=0;i<candy.length;i++){
            if(candy[i].getName().equals(name[2])){
                counterToffees+=candy[i].getWeigth();
            }
        }
        return counterToffees;
    }
    public static int counterMarmalade(){
        int counterMarmalade=0;
        for(int i=0;i<candy.length;i++){
            if(candy[i].getName().equals(name[3])){
                counterMarmalade+=candy[i].getWeigth();
            }
        }
        return counterMarmalade;
    }
    public static int counterChocolate(){
        int counterChocolate=0;
        for(int i=0;i<candy.length;i++){
            if(candy[i].getName().equals(name[4])){
                counterChocolate+=candy[i].getWeigth();
            }
        }
        return counterChocolate;
    }
    public static int counterDairy(){
        int counterDairy=0;
        for(int i=0;i<candy.length;i++){
            if(candy[i].getName().equals(name[5])){
                counterDairy+=candy[i].getWeigth();
            }
        }
        return counterDairy;
    }
    
    public static void main(String[] args) {
        initCandys();
        System.out.println("Всего: Леденцы=" + counterLollipops()+"г Жевательных=" +counterChewing()+ " Ириски=" +counterToffees()
                            + "г Мармелад="+counterMarmalade() +"г Шоколад=" +counterChocolate()+ "г Молочные="+counterDairy());
        choice();
        Arrays.sort(present);
        System.out.println("");
        System.out.println("Сортировка по имени:");
        print(present);
        System.out.println("");
        sugar(present, 185, 195);
    }
    public static void choice(){
        System.out.print("Введите сколько конфет вы хотите купить: ");
        int n=sc.nextInt();
        present=new Candys[n];
        print(candy);
        int led=-1, jev=-1, iris=-1, marm=-1, chok=-1, molok=-1, weigth=0;
        try{
            for(int i=0; i<present.length;i++){
                System.out.println("Введите сколько грамм хотите купить:");
                int m = sc.nextInt();
                menu();
                int l=sc.nextInt();
                switch(l){
                    case 1:{
                        led++;
                        while(!(candy[led].getName().equals(name[0])&&candy[led].getWeigth()==m)){
                            led++;
                        }
                        present[i]= candy[led];
                        weigth+=present[i].getWeigth();
                    }break;
                    case 2:{
                        jev++;
                        while(!(candy[jev].getName().equals(name[1])&&candy[jev].getWeigth()==m)){
                            jev++;
                        }
                        present[i]= candy[jev];
                        weigth+=present[i].getWeigth();
                    }break;
                    case 3:{
                        iris++;
                        while(!(candy[iris].getName().equals(name[2])&&candy[iris].getWeigth()==m)){
                            iris++;
                        }
                        present[i]= candy[iris];
                        weigth+=present[i].getWeigth();
                    }break;
                    case 4:{
                        marm++;
                        while(!(candy[marm].getName().equals(name[3])&&candy[marm].getWeigth()==m)){
                            marm++;
                        }
                        present[i]= candy[marm];
                        weigth+=present[i].getWeigth();
                    }break;
                    case 5:{
                        chok++;
                        while(!(candy[chok].getName().equals(name[4])&&candy[chok].getWeigth()==m)){
                            chok++;
                        }
                        present[i]= candy[chok];
                        weigth+=present[i].getWeigth();
                    }break;
                    case 6:{
                        molok++;
                        while(!(candy[molok].getName().equals(name[5])&&candy[molok].getWeigth()==m)){
                            molok++;
                        }
                        present[i]= candy[molok];
                        weigth+=present[i].getWeigth();
                    }break;
                    default:{
                            present[i]= candy[r.nextInt(candy.length)];
                            weigth+=present[i].getWeigth();
                    }break;
                }
                
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Этих видов конфет больше нет!!!");
        }
        print(present);
        System.out.println("Вы набрали " + weigth + "грамм конфет.");
    }
    
    public static void menu(){
        System.out.println("Нажмите 1, если хотите добавить Леденцы");
        System.out.println("Нажмите 2, если хотите добавить Жевательных");
        System.out.println("Нажмите 3, если хотите добавить Ириски");
        System.out.println("Нажмите 4, если хотите добавить Мармелад");
        System.out.println("Нажмите 5, если хотите добавить Шоколад");
        System.out.println("Нажмите 6, если хотите добавить Молочные");
        System.out.println("Нажмите инное значение, если вы хотите чтоб мы подобрали за вас");
    }
    
    public static void sugar(Candys[] prest, int start, int end){
        System.out.println("Конфеты содержащие сахар от "+ start+" до "+end);
        for(int i=0; i<prest.length; i++){
            if(prest[i].getSugar()>start && prest[i].getSugar()<end){
                System.out.println(prest[i]);
            }
        }
    }
    
    public static void print(Candys[] cand){
        for(int i=0;i<cand.length;i++){
            System.out.println(cand[i]);
        }
    }
}

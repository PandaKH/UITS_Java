
package jv1607.homeworks.task_0_1.task_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static Appliances [] out;
    
    final static String[] status = {
        "not connected",
        "connected"
    };
    public static void Appliances(){
        out = new Appliances[50];
        for(int i=0; i<out.length;i++){
            Appliances a = new Appliances();
            a.setName(Appliances.Name.values()[r.nextInt(10)]);
            if(a.getName().equals(Appliances.Name.values()[0])){
                a.setPower(1538);
            }
            else if(a.getName().equals(Appliances.Name.values()[1])){
                a.setPower(1500);
            }
            else if(a.getName().equals(Appliances.Name.values()[2])){
                a.setPower(1500);
            }
            else if(a.getName().equals(Appliances.Name.values()[3])){
                a.setPower(1100);
            }
            else if(a.getName().equals(Appliances.Name.values()[4])){
                a.setPower(650);
            }
            else if(a.getName().equals(Appliances.Name.values()[5])){
                a.setPower(425);
            }
            else if(a.getName().equals(Appliances.Name.values()[6])){
                a.setPower(300);
            }
            else if(a.getName().equals(Appliances.Name.values()[7])){
                a.setPower(150 );
            }
            else if(a.getName().equals(Appliances.Name.values()[8])){
                a.setPower(50);
            }
            else{
                a.setPower(45);
            }
            a.setStatus(status[0]);
            out[i]=a;
        }
    }
    public static void main(String[] args) {
        print(out);
        choice();
        counterPower();
        System.out.println("");
        System.out.println("Sorting by power: ");
        Arrays.sort(out);
        print(out);
        System.out.println("");
        interval(out, 300, 450);
    }
    
    public static void choice(){
        
        System.out.print("Введите сколько всего приборов вы хотите подключить в розетке: ");
        int n=sc.nextInt();
        int hairdryer=-1, heater=-1, coffeeMaker=-1, toaster=-1, avacuumCleaner=-1, washingMachine=-1;
        int blender=-1, monitor=-1, laptop=-1, printer=-1;
        try{
            for(int i=0;i<n;i++){
                menu();
                switch(sc.nextInt()){
                    case 1:{
                        hairdryer++;
                        while(!(out[hairdryer].getName()==Appliances.Name.values()[0])){
                            hairdryer++;
                        }
                        out[hairdryer].setStatus(status[1]);
                    }break;
                    case 2:{
                        heater++;
                        while(!(out[heater].getName()==Appliances.Name.values()[1])){
                            heater++;
                        }
                        out[heater].setStatus(status[1]);
                    }break;
                    case 3:{
                        coffeeMaker++;
                        while(!(out[coffeeMaker].getName()==Appliances.Name.values()[2])){
                            coffeeMaker++;
                        }
                        out[coffeeMaker].setStatus(status[1]);
                    }break;
                    case 4:{
                        toaster++;
                        while(!(out[toaster].getName()==Appliances.Name.values()[3])){
                            toaster++;
                        }
                        out[toaster].setStatus(status[1]);
                    }break;
                    case 5:{
                        avacuumCleaner++;
                        while(!(out[avacuumCleaner].getName()==Appliances.Name.values()[4])){
                            avacuumCleaner++;
                        }
                        out[avacuumCleaner].setStatus(status[1]);
                    }break;
                    case 6:{
                        washingMachine++;
                        while(!(out[washingMachine].getName()==Appliances.Name.values()[5])){
                            washingMachine++;
                        }
                        out[washingMachine].setStatus(status[1]);
                    }break;
                    case 7:{
                        blender++;
                        while(!(out[blender].getName()==Appliances.Name.values()[6])){
                            blender++;
                        }
                        out[blender].setStatus(status[1]);
                    }break;
                    case 8:{
                        monitor++;
                        while(!(out[monitor].getName()==Appliances.Name.values()[7])){
                            monitor++;
                        }
                        out[monitor].setStatus(status[1]);
                    }break;
                    case 9:{
                        laptop++;
                        while(!(out[laptop].getName()==Appliances.Name.values()[8])){
                            laptop++;
                        }
                        out[laptop].setStatus(status[1]);
                    }break;
                    case 10:{
                        printer++;
                        while(!(out[printer].getName()==Appliances.Name.values()[9])){
                            printer++;
                        }
                        out[printer].setStatus(status[1]);
                    }break;
                    default:{
                            out[r.nextInt(out.length)].setStatus(status[1]);
                    }break;
                }
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Такого прибора больше нет!!!");
        }
    }
    
    public static void counterPower(){
        int power=0;
        for(int i=0;i<out.length; i++){
            if(out[i].getStatus().equals(status[1])){
                power+=out[i].getPower();
            }
        }
        System.out.println("Употребляемая мощность=" + power);
    }
    
    public static void menu(){
        System.out.println("Нажмите 1, если хотите подключить Фен");
        System.out.println("Нажмите 2, если хотите подключить Обогреватель");
        System.out.println("Нажмите 3, если хотите подключить Кофеварка");
        System.out.println("Нажмите 4, если хотите подключить Тостер");
        System.out.println("Нажмите 5, если хотите подключить Пылесос");
        System.out.println("Нажмите 6, если хотите подключить Стиральная машина");
        System.out.println("Нажмите 7, если хотите подключить Блендер");
        System.out.println("Нажмите 8, если хотите подключить Монитор");
        System.out.println("Нажмите 9, если хотите подключить Ноутбук");
        System.out.println("Нажмите 10, если хотите подключить Принтер");
        System.out.println("Нажмите инное значение, если вы хотите подключить рандомный прибор");
    }
    public static void print(Appliances[] appl){
        for(int i=0;i<appl.length; i++){
            System.out.println(appl[i]);
        }
    }
    public static void interval(Appliances[] appl, int start, int end){
        System.out.println("Appliances with power from " + start + "to " + end);
        for(int i=0; i<appl.length; i++){
            if(appl[i].getPower()>start && appl[i].getPower() < end){
                System.out.println(appl[i]);
            }
        }
    }
}

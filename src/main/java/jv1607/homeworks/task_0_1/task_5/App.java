
package jv1607.homeworks.task_0_1.task_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    static Random r =new Random();
    static Scanner sc = new Scanner(System.in);
    static Recording[] records;
    
    static Recording[] songs = {
        new Recording("\"We dont talk anymore\"", "Pop", 217),
        new Recording("\"Unstoppable\"", "Pop", 227),
        new Recording("\"One of one\"", "Rap", 305),
        new Recording("\"Pop it\"", "Rap\"", 172),
        new Recording("\"Yesterday\"", "Rock", 137),
        new Recording("\"I'm so sorry\"", "Rock", 230)
    };
    
    public static void main(String[] args) {
        print(songs);
        System.out.println("");
        choice();
        System.out.println("");
        System.out.println("Sorting by style:");
        Arrays.sort(records);
        print(records);
        System.out.println("");
        interval(records, 220, 310);
    }
    
    public static void menu(){
        System.out.println("Нажмите 1, если хотите добавить на диск песню \"We dont talk anymore\"");
        System.out.println("Нажмите 2, если хотите добавить на диск песню \"Unstoppable\"");
        System.out.println("Нажмите 3, если хотите добавить на диск песню \"One of one\"");
        System.out.println("Нажмите 4, если хотите добавить на диск песню \"Pop it\"");
        System.out.println("Нажмите 5, если хотите добавить на диск песню \"Yesterday\"");
        System.out.println("Нажмите 6, если хотите добавить на диск песню \"I'm so sorry\"");
        System.out.println("Нажмите инное значение, если хотите добавить рандом песню из списка");
    }
    
    public static void choice(){
        int j=-1, time=0;
        System.out.print("Введит сколько песен хотите добавить: ");
        int n=sc.nextInt();
        records = new Recording[n];
        for(int i=0;i<records.length;i++){
            menu();
            switch(sc.nextInt()){
                case 1:{
                    j++;
                    for(int k=0; k<songs.length;k++){
                        if(songs[k].getName().equals("\"We dont talk anymore\"")){
                            records[j]=songs[k];
                        }
                    }
                    time+=records[j].getSec();
                }break;
                case 2:{
                    j++;
                    for(int k=0; k<songs.length;k++){
                        if(songs[k].getName().equals("\"Unstoppable\"")){
                            records[j]=songs[k];
                        }
                    }
                    time+=records[j].getSec();
                }break;
                case 3:{
                    j++;
                    for(int k=0; k<songs.length;k++){
                        if(songs[k].getName().equals("\"One of one\"")){
                            records[j]=songs[k];
                        }
                    }
                    time+=records[j].getSec();
                }break;
                case 4:{
                    j++;
                    for(int k=0; k<songs.length;k++){
                        if(songs[k].getName().equals("\"Pop it\"")){
                            records[j]=songs[k];
                        }
                    }
                    time+=records[j].getSec();
                }break;
                case 5:{
                    j++;
                    for(int k=0; k<songs.length;k++){
                        if(songs[k].getName().equals("\"Yesterday\"")){
                            records[j]=songs[k];
                        }
                    }
                    time+=records[j].getSec();
                }break;
                case 6:{
                    j++;
                    for(int k=0; k<songs.length;k++){
                        if(songs[k].getName().equals("\"I'm so sorry\"")){
                            records[j]=songs[k];
                        }
                    }
                    time+=records[j].getSec();
                }break;
                default:{
                    j++;
                    records[j]=songs[r.nextInt(songs.length)];
                    time+=records[j].getSec();
                }
            }
        }
        print(records);
        System.out.println("Продолжителность песен на диске=" + time);
    }
    
    public static void print(Recording [] rec){
        for(int i=0;i<rec.length;i++){
            System.out.println(rec[i]);
        }
    }
    
    public static void interval(Recording[] rec, int start, int end){
        System.out.println("Продолжительность песен от " +start+ " до " + end);
        for(int i=0; i< rec.length; i++){
            if(rec[i].getSec()>start && rec[i].getSec()<end){
                System.out.println(rec[i]);
            }
        }
    }
}

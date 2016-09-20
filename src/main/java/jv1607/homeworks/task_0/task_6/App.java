
package jv1607.homeworks.task_0.task_6;

import java.util.Random;

public class App {
    static Random r = new Random();
    static House[] house;
    
    static final String[] streets= {
        "Lugovskaya",
        "Bakulina",
        "Pushkina",
        "Gagarina",
        "Devichya",
        "Saltovskaya"
    };
    
    static final String[] typeBuild ={
        "Сельскохозяйственный",
        "Жилой",
        "Промышленный"
    };
    
    static {
        house = new House[50];
        for(int i=0; i<house.length; i++){
            House s = new House();
            s.setId(i+1);
            s.setNumHouse(r.nextInt(100)+1);
            s.setFloors(r.nextInt(6)+1);
            s.setRooms(r.nextInt(4)+2);
            if(s.getRooms()>3){
                s.setArea(r.nextInt(50)+20);
            }
            else{
                s.setArea(r.nextInt(10)+10);
            }
            s.setStreet(streets[r.nextInt(6)]);
            if(s.getFloors()<=2){
                s.setTypeBuild(typeBuild[r.nextInt(2)]);
            }
            else{
                s.setTypeBuild(typeBuild[r.nextInt(2)+1]);
            }
            s.setLifetime(r.nextInt(50)+100 + " лет");
            house[i]=s;
        }
    }
    public static void main(String[] args) {
        print(house);
        System.out.println("");
        room(house, 3);
        System.out.println("");
        interval(house, 2, 2, 4);
        System.out.println("");
        area(house, 50);
    }
    public static void print(House[] house){
        for(int i=0; i<house.length; i++){
            System.out.println(house[i]);
        }
    }
    public static void room(House[] house, int rooms){
        System.out.println("Квартиры имеющие заданное число комнат - " + rooms);
        for(int i=0; i<house.length; i++){
            if(house[i].getRooms()==rooms){
                System.out.println("Квартира номер " + house[i].getNumHouse() + " имеет " + rooms + " комнаты");
            }
        }
    }
    public static void interval(House[] house, int rooms, int start, int end){
        System.out.println("Квартиры имеющие заданное число комнат - " + rooms + " и расположенные в интервале от " + start + " до " + end);
        for(int i=0; i<house.length; i++){
            if(house[i].getRooms()==rooms && house[i].getFloors()>start && house[i].getFloors()<end){
                System.out.println("Квартира номер " + house[i].getNumHouse() + " имеет " + rooms 
                                    + " комнаты и расположена в интеревале от " + start + " до " +end); 
            }
        }
    }
    public static void area(House[] house, int area){
        System.out.println("Cписок квартир с площадью больше " + area);
        for(int i=0; i<house.length; i++){
            if(house[i].getArea()>area){
                System.out.println(house[i]);
            }
        }
    }
}

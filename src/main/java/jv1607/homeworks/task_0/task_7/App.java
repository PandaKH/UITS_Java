
package jv1607.homeworks.task_0.task_7;

import java.util.Arrays;
import java.util.Random;

public class App {
    static Random r = new Random();
    static Phone[] phone;

    static final String[] lastName= {
        "Petya",
        "Vasya",
        "Oleg",
        "Yura",
        "Igor",
        "Andrey",
        "Stas"
    };

    static final String[] firstName= {
        "Ivanov",
        "Pugovkin",
        "Afanasiy",
        "Bukov",
        "Pirajkov",
        "Bubnov",
        "Prujkov",
        "Chernov",
        "Rubkov",
        "Babnikov",
        "Makhnov"
    };

    static final String[] patronymic= {
        "Aleksandrovich",
        "Petrasyanovich",
        "Stanislavovich",
        "Igorovich",
        "Popovich",
        "Bumagovich",
        "Rikhnovich",
        "Olegovich",
        "Lunakovich"
        
    };
    
    static final String[] address= {
        "Lugovskaya",
        "Bakulina",
        "Pushkina",
        "Gagarina",
        "Devichya",
        "Saltovskaya"
    };
    
    static{
        phone = new Phone[50];
        for(int i=0; i<phone.length; i++){
            Phone s = new Phone();
            s.setId(i+1);
            s.setFirstName(firstName[r.nextInt(11)]);
            s.setLastName(lastName[r.nextInt(7)]);
            s.setPatronymic(patronymic[r.nextInt(9)]);
            s.setAddress(address[r.nextInt(6)]+" "+(r.nextInt(99)+1));
            s.setNumCard(r.nextInt(1000000)+100000);
            s.setDebit(r.nextInt(1000)+1);
            s.setCredit(r.nextInt(1000)+1);
            s.setUrbanCalls(r.nextInt(50));
            s.setLongDistCall(r.nextInt(10));
            phone[i]=s;
        }
    }
    public static void main(String[] args) {
        print(phone);
        System.out.println("");
        urban(phone, 80);
        System.out.println("");
        longDist(phone);
        System.out.println("");
        System.out.println("Сортировка абонентов по фамилии: ");
        Arrays.sort(phone);
        print(phone);
    }
    public static void print(Phone[] phone){
        for(int i=0; i<phone.length; i++){
            System.out.println(phone[i]);
        }
    }
    public static void urban(Phone[] phone, int urban){
        System.out.println("Абонементы у которого время внутригородских разговоров превышают - " + urban);
        for(int i=0; i<phone.length; i++){
            if(phone[i].getUrbanCalls()>urban){
                System.out.println(phone[i]);
            }   
        }
    }
    public static void longDist(Phone[] phone){
        System.out.println("Абонементы  которые пользовались междугородной связью: ");
        for(int i=0; i<phone.length; i++){
            if(phone[i].getUrbanCalls()>0){
                System.out.println(phone[i]);
            }   
        }
    }
}

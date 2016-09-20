
package jv1607.homeworks.task_0.task_2;

import java.util.Arrays;
import java.util.Random;

public class App {
  
    static Random r = new Random();
    static Customer[] customer;

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

    static {
        customer = new Customer[50];
        for(int i=0; i<customer.length; i++){
            Customer s = new Customer();
            s.setId(i+1);
            s.setFirstName(firstName[r.nextInt(11)]);
            s.setLastName(lastName[r.nextInt(7)]);
            s.setPatronymic(patronymic[r.nextInt(9)]);
            s.setAddress(address[r.nextInt(6)]+" "+(r.nextInt(99)+1));
            s.setNumCard(r.nextInt(1000000)+100000);
            s.setNumAccount(r.nextInt(1000000)+100000);
            customer[i]=s;
        }
    }
    public static void main(String[] args) {
        print(customer);
        System.out.println("");
        System.out.println("Сортировка по фамилии: ");
        Arrays.sort(customer);
        print(customer);
        System.out.println("");
        interval(customer, 400000, 600000);
        
    }
    public static void print(Customer[] cust){
        for(int i=0; i<cust.length;i++){
            System.out.println(cust[i]);
        }
    }
    public static void interval(Customer[] cust, int start, int end){
        System.out.println("Покупатели с номером кредитной карты от " + start + " до " + end);
        for(int i=0; i<cust.length;i++){
            if(cust[i].getNumCard()> start && cust[i].getNumCard() < end){
                System.out.println(cust[i]);
            }
        }
    }
}

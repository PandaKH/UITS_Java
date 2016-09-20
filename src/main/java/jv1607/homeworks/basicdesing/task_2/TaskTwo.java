
package jv1607.homeworks.basicdesing.task_2;

import java.util.Scanner;


public class TaskTwo {
    public static void main(String[] args) {
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 99!!!");
        int n = sc.nextInt();
        if(n>9 && n<20){
            switch(n/1){
            case 10:{
                str="Десять!!!!!";
            }break;
            case 11:{
                str="Одиннацать!!!!!";
            }break;
            case 12:{
                str="Двенацать!!!!!";
            }break;
            case 13:{
                str="Тринадцать!!!!!";
            }break;
            case 14:{
                str="Четырнадцать!!!!!";
            }break;
            case 15:{
                str="Пятнадцать!!!!!";
            }break;
            case 16:{
                str="Шестнадцать!!!!!";
            }break;
            case 17:{
                str="Семнадцать!!!!!";
            }break;
            case 18:{
                str="Восемнадцать!!!!!";
            }break;
            case 19:{
                str="Девятнадцать!!!!!";
            }break;
        }}
        else if (n==0){
            str ="Ноль!!!!!";
        }
        else {
        switch(n/10){
            case 2:{
                str="Двадцать ";
            }break;
            case 3:{
                str="Тридцать ";
            }break;
            case 4:{
                str="Сорок ";
            }break;
            case 5:{
                str="Пятьдесят ";
            }break;
            case 6:{
                str="Шестьдесят ";
            }break;
            case 7:{
                str="Семьдесят ";
            }break;
            case 8:{
                str="Восемьдесят ";
            }break;
            case 9:{
                str="Девяносто ";
            }break;
        }
        switch(n%10){
            case 1:{
                str+="один!!!!!";
            }break;
            case 2:{
                str+="два!!!!!";
            }break;
            case 3:{
                str+="три!!!!!";
            }break;
            case 4:{
                str+="четыре!!!!!";
            }break;
            case 5:{
                str+="пять!!!!!";
            }break;
            case 6:{
                str+="шесть!!!!!";
            }break;
            case 7:{
                str+="семь!!!!!";
            }break;
            case 8:{
                str+="восемь!!!!!";
            }break;
            case 9:{
                str+="девять!!!!!";
            }break;
        }}
        System.out.println(str);
    }
}

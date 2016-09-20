
package jv1607.homeworks.basicdesing.task_1;

import java.util.Scanner;

public class TaskOne {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        basicChooise();
        basicUserChooise(); 
    }
    public static void basicChooise(){
        System.out.println("Нажмите 1, если хотите вывести значения кратные 2, 3, 5, 7");
        System.out.println("Нажмите 2, если хотите найти сумму чисел для каждого из этих последовательностей");
        System.out.println("нажмите 3, если ходите вычислить разность суммы последовательности чисел 7 и 2");
        System.out.println("Нажмите 4, если хотите вычислить отношение последовательности чисел, кратных 5 и 3");
    }
    public static void basicUserChooise(){
        int value = sc.nextInt();
        switch(value){
            case 1: {
                multiplesChooise();
                numberMultiples();
            }break;
            case 2:{
                int sum=0;
                for(int i=0; i<100; i++){
                    if (i%2==0 ||i%3==0 ||i%5==0 ||i%7==0){
                        sum+=i;
                    }
                }
                System.out.println("Сумма всех чисел кратные 2, 3, 5, 7: " + sum);
            }break;
            case 3:{
                int sum=0;
                int sum1=0;
                for(int i=0; i<100; i++){
                    if (i%7==0){
                        sum+=i;
                    }
                }
                for(int i=0; i<100; i++){
                    if (i%2==0){
                        sum1+=i;
                    }
                }
                System.out.println("Разность сумм чисел кратные 7 и 2: " + (sum-sum1));
            }break;
            case 4:{
                double sum=0;
                double sum1=0;
                for(int i=0; i<100; i++){
                    if (i%5==0){
                        sum+=i;
                    }
                }
                for(int i=0; i<100; i++){
                    if (i%3==0){
                        sum1+=i;
                    }
                }
                System.out.println("Отношение сумм чисел кратные 5 и 3: " + (sum/sum1));
            }break;
            default:{
                System.out.println("Вы ввели не правильное значение!!!");
                System.out.println("Досвидулиии!!!!!");
            }
        }
    }
    public static void multiplesChooise(){
        System.out.println("1. Значения кратные 2");
        System.out.println("2. Значения кратные 3");
        System.out.println("3. Значения кратные 5");
        System.out.println("4. Значения кратные 7");
    }
    public static void numberMultiples(){
        int value = sc.nextInt();
        switch(value){
            case 1:{
                for(int i=0; i<100; i++){
                    if(i%2==0){
                        System.out.println("Значения кратные 2: "+i);
                    }
                }
            }break;
            case 2:{
                for(int i=0; i<100; i++){
                    if(i%3==0){
                        System.out.println("Значения кратные 3: "+i);
                    }
                }
            }break;
            case 3:{
                for(int i=0; i<100; i++){
                    if(i%5==0){
                        System.out.println("Значения кратные 5: "+i);
                    }
                }
            }break;
            case 4:{
                for(int i=0; i<100; i++){
                    if(i%7==0){
                        System.out.println("Значения кратные 7: "+i);
                    }
                }
            }break;
            default:{
                System.out.println("Вы ввели не правильное значение!!!");
                System.out.println("Досвидулиии!!!!!");
            }
        }
    }
}

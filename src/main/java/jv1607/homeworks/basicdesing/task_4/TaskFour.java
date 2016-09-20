
package jv1607.homeworks.basicdesing.task_4;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер одномерного массива: ");
        int n = sc.nextInt();
        int [] array = new int [n];
            Random r = new Random();
        for (int i=0; i<array.length; i++){
            array[i]=r.nextInt(250);
        }
        System.out.println("Начальный массив: ");
        for (int i=0; i<array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("");
        sortedArray(array);
        System.out.println("");
        invertArray(array);
        System.out.println("");
        evenArray(array);
        System.out.println("");
        oddArray(array);
        System.out.println("");
        sumArray(array);
        System.out.println("");
        productArray(array);
    }
    static void sortedArray(int array[]){
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Прямой массив: ");
        for(int i=0; i<array.length; i++){
            System.out.print(" " + array[i]);
        }
    }
    static void invertArray(int array[]){
       for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length-1; j++){
                if(array[j]<array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Обратный массив: ");
        for(int i=0; i<array.length; i++){
            System.out.print(" " + array[i]);
        }
    }
    static void evenArray(int array[]){
        System.out.println("Массив с чётными элементами: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                System.out.print(" " + array[i]);
            }
        }
    }
    static void oddArray(int array[]){
        System.out.println("Массив с нечётными элементами: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2==1){
                System.out.print(" " + array[i]);
            }
        }
    }
    static void sumArray(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%7==0){
                sum+=i;
            }
        }
        System.out.println("Cумма элементов, кратных 7: ");
        System.out.print(sum);
    }
    static void productArray(int array[]){
        int product=1;
        for(int i=0; i<array.length; i++){
            if(array[i]%3==0){
                product=product*i;
            }
        }
        System.out.println("Произведение элементов, кратных 3: ");
        System.out.print(product);
    }
    
}

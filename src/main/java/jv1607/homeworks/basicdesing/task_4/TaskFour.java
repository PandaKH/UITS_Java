
package jv1607.homeworks.basicdesing.task_4;

import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    static int [] array;
    
    public static void main(String[] args) {
        greatArray();
        System.out.println("");
        System.out.println("Начальный массив: ");
        printArray();
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
    public static void greatArray(){
        System.out.print("Введите размер одномерного массива: ");
        int n = sc.nextInt();
        array = new int [n];
        for (int i=0; i<array.length; i++){
            array[i]=r.nextInt(250);
        }
        
    }
    public static void printArray(){
        for (int i=0; i<array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println("");
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
        System.out.println("");
        System.out.println("Прямой массив: ");
        printArray();
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
        printArray();
    }
    static void evenArray(int array[]){
        System.out.println("Массив с чётными элементами: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                System.out.print(" " + array[i]);
            }
        }
        System.out.println("");
    }
    static void oddArray(int array[]){
        System.out.println("Массив с нечётными элементами: ");
        for(int i=0; i<array.length; i++){
            if(array[i]%2==1){
                System.out.print(" " + array[i]);
            }
        }
        System.out.println("");
    }
    static void sumArray(int array[]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%7==0){
                sum+=i;
            }
        }
        System.out.println("Cумма элементов, кратных 7: ");
        System.out.println(sum);
    }
    
    static void productArray(int array[]){
        int product=1;
        for(int i=0; i<array.length; i++){
            if(array[i]%3==0){
                product=product*i;
            }
        }
        System.out.println("Произведение элементов, кратных 3: ");
        System.out.println(product);
    }
    
}

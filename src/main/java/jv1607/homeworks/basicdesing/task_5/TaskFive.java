package jv1607.homeworks.basicdesing.task_5;

import java.util.Random;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер двухмерного массива: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][] array = new int [m][n];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                array[i][j]=r.nextInt(100);
            }
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
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
    static void sortedArray(int array[][]){
        for(int k=0; k<array.length; k++){
            for(int i=0; i<array.length; i++){
                for(int j = 0 ; j < array.length-1; j++){
                    if(array[i][j]>array[i][j+1]){
                        int temp = array[i][j];
                        array[i][j]=array[i][j+1];
                        array[i][j+1]=temp;
                    }
                }
            }
        }
        for(int k=0; k<array.length; k++){
            for(int j = 0 ; j < array.length; j++){
                for(int i=0; i<array.length-1; i++){
                    if(array[i][j]>array[i+1][j]){
                        int temp = array[i][j];
                        array[i][j]=array[i+1][j];
                        array[i+1][j]=temp;
                    }
                }
            }
        }
        System.out.println("Прямой массив: ");
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    static void invertArray(int array[][]){
        for(int k=0; k<array.length; k++){
            for(int i=0; i<array.length; i++){
                for(int j = 0 ; j < array.length-1; j++){
                    if(array[i][j]<array[i][j+1]){
                        int temp = array[i][j];
                        array[i][j]=array[i][j+1];
                        array[i][j+1]=temp;
                    }
                }
            }
        }
        for(int k=0; k<array.length; k++){
            for(int j = 0 ; j < array.length; j++){
                for(int i=0; i<array.length-1; i++){
                    if(array[i][j]<array[i+1][j]){
                        int temp = array[i][j];
                        array[i][j]=array[i+1][j];
                        array[i+1][j]=temp;
                    }
                }
            }
        }
        System.out.println("Обратный массив: ");
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    static void evenArray(int array[][]){
        System.out.println("Массив с чётными элементами из чётной строки: ");
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length; j++){
               if(i%2==0 && array[i][j]%2==0){
                   System.out.print(" " + array[i][j]);
               } 
            }
        }
    }
    static void oddArray(int array[][]){
        System.out.println("Массив с нечётными элементами: ");
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length; j++){
               if(j%2==1 && array[i][j]%2==1){
                   System.out.print(" " + array[i][j]);
               } 
            }
        }
    }
    static void sumArray(int array[][]){
        int sum=0;
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length; j++){
                if(array[i][j]%7==0 && i%2==0){
                    sum+=i;
                }
            }
        }    
        System.out.println("Cумма элементов, кратных 7 в чётных строках: ");
        System.out.print(sum);
    }
    static void productArray(int array[][]){
        int product=1;
        for(int i=0; i<array.length; i++){
            for(int j = 0 ; j < array.length; j++){
                if(array[i][j]%3==0 && i%2==1){
                    product*=i;
                }
            }
        } 
        System.out.println("Произведение элементов, кратных 3: ");
        System.out.print(product);
    }
}

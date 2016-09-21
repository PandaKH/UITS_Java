package jv1607.homeworks.basicdesing.task_7;

import java.util.Random;
import java.util.Scanner;

public class TaskSeven {
    static Scanner sc= new Scanner(System.in);
    static Random r = new Random();
    static int [][] array;
    public static void main(String[] args) {
        System.out.println("Введите размер двухмерного массива: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        greatArray(n,m);
        System.out.println("");
        printArray();
        System.out.println("");
        rightShift(array, n, m);
        System.out.println("");
        leftShift(array, n, m);
        System.out.println("");
        downShift(array, n, m);
        System.out.println("");
        upShift(array, n, m);
    }
    
    public static void greatArray(int n, int m){
        array=new int [n][m];
         for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                array[i][j]=r.nextInt(100);
            }
        }
    }
    public static void printArray(){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    static void leftShift(int array[][], int n, int m){
        System.out.print("Введите число на сколько хотите сдвинуть массив влево: ");
        int b=sc.nextInt();
        int [][] temp=new int[n][m];
        System.out.println("");
        System.out.println("Массив со сдвигом в влево: ");
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                temp[i][0] = array[i][0];
            }
        }    
        while(b>0){   
            for(int i=0; i<array.length; i++){
                for(int j=0; j<array.length-1; j++){
                    array[i][j]=array[i][j+1];
                    array[i][j+1]=temp[i][0];
                }   
            } 
            for(int i=0; i<array.length; i++) {
                for(int j=0; j<array.length; j++) {
                   temp[i][0] = array[i][0];
                }
            }    
            b--;
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    static void rightShift(int array[][], int n, int m){
        System.out.print("Введите число на сколько хотите сдвинуть массив вправо: ");
        int b=sc.nextInt();
        int [][] temp=new int[n][m];
        System.out.println("");
        System.out.println("Массив со сдвигом в право: ");
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length-1; j++) {
                temp[i][array.length-1] = array[i][array.length-1];
            }
        }
        while(b>0){   
            for(int i=array.length-1; i>=0; i--){
                for(int j=array.length-1; j>0; j--){
                    array[i][j]=array[i][j-1];
                    array[i][j-1]=temp[i][array.length-1];
                }   
            } 
            for(int i=0; i<array.length; i++) {
                for(int j=0; j<array.length-1; j++) {
                    temp[i][array.length-1] = array[i][array.length-1];
                }
            }    
            b--;
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                    System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    static void downShift(int array[][], int n, int m){
        System.out.print("Введите число на сколько хотите сдвинуть массив вниз: ");
        int b=sc.nextInt();
        int [][] temp=new int[n][m];
        System.out.println("");
        System.out.println("Массив со сдвигом в вниз: ");
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length; j++) {
                temp[array.length-1][j] = array[array.length-1][j];
            }
        }
        while(b>0){   
            for(int i=array.length-1; i>0; i--){
                for(int j=array.length-1; j>=0; j--){
                    array[i][j]=array[i-1][j];
                    array[i-1][j]=temp[array.length-1][j];
                }   
            } 
            for(int i=0; i<array.length-1; i++) {
                for(int j=0; j<array.length; j++) {
                    temp[array.length-1][j] = array[array.length-1][j];
                }
            }    
            b--;
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                    System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
    static void upShift(int array[][], int n, int m){
        System.out.print("Введите число на сколько хотите сдвинуть массив вверх: ");
        int b=sc.nextInt();
        int [][] temp=new int[n][m];
        System.out.println("");
        System.out.println("Массив со сдвигом в вверх: ");
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                temp[0][j] = array[0][j];
            }
        }    
        while(b>0){   
            for(int i=0; i<array.length-1; i++){
                for(int j=0; j<array.length; j++){
                    array[i][j]=array[i+1][j];
                    array[i+1][j]=temp[0][j];
                }   
            } 
            for(int i=0; i<array.length; i++) {
                for(int j=0; j<array.length; j++) {
                   temp[0][j] = array[0][j];
                }
            }    
            b--;
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
}

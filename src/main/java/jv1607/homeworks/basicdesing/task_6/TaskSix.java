
package jv1607.homeworks.basicdesing.task_6;

public class TaskSix {
    static int [][]array = new int [10][];
    public static void main(String[] args) {
        printArray(array);
        System.out.println("");
        verticalArray(array);
        System.out.println("");
        horizontalArray(array);
        System.out.println("");
        HorizAndVertArray(array);
    }
    
    public static void verticalArray(int array[][]){
        System.out.println("Вертикальное отражение");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-i; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    
    public static void printArray(int array[][]){
        System.out.println("Рванный массив: ");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    
    public static void horizontalArray(int array[][]){
        System.out.println("Горизонтальное отражение: ");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if(j<array.length-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    
    public static void HorizAndVertArray(int array[][]){
        System.out.println("Горизонтальное и вертикальное отражение: ");
        for(int i=array.length-1; i>=0; i--){
            for(int j=0; j<array.length; j++){
                if(j<array.length-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

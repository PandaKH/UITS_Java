package jv1607.homeworks.basictypes.task_2;

public class TaskTwo {
    public static double LengthCicle(int r){
        return 2 * Math.PI * r;
    }
    public static double AreaCicle(int r){
        return Math.PI * r * r;
    }
    public static double AreaRing(int R, int r){
        return Math.PI * ( R * R - r * r);
    }
    public static double PerimeterTriangle(int a, int b, int c){
        return 0.5 * (a + b + c);
    }
    public static double AreaTriangle(int b, int h){
        return (b * h)/2;
    }
    public static double PerimeterRectangle(int a, int b){
        return 2 * (a + b);
    }
     public static double AreaRectangle(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        System.out.println(LengthCicle(2));
        System.out.println(AreaCicle(3));
        System.out.println(AreaRing(4, 3));
        System.out.println(PerimeterTriangle(2, 3, 4));
        System.out.println(AreaTriangle(3, 4));
        System.out.println(PerimeterRectangle(3, 2));
        System.out.println(AreaRectangle(3, 4));
    }
}

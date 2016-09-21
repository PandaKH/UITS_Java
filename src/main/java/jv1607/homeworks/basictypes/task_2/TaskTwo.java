
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
        System.out.println("Длина окружности: ");
        System.out.println("l=" + LengthCicle(2));
        System.out.println("Площадь окружности ");
        System.out.println("S=" + AreaCicle(3));
        System.out.println("Площадь кольца: ");
        System.out.println("S=" + AreaRing(4, 3));
        System.out.println("Периметр треугольника: ");
        System.out.println("P=" + PerimeterTriangle(2, 3, 4));
        System.out.println("Площадь треугольника:");
        System.out.println("S=" + AreaTriangle(3, 4));
        System.out.println("Периметр прямоугольника: ");
        System.out.println("P=" + PerimeterRectangle(3, 2));
        System.out.println("Площадь прямоугольника: ");
        System.out.println("Р="+AreaRectangle(3, 4));
    }
}

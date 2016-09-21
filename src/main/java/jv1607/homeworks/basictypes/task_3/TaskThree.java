package jv1607.homeworks.basictypes.task_3;

import jv1607.homeworks.basictypes.task_2.TaskTwo;

public class TaskThree{
    public static double VolumeCylinder(int r, int h){
        return TaskTwo.AreaCicle(r)* h;
    }
    public static double hollowVolumeCylinder(int r2, int r1, int h){
        return TaskTwo.AreaRing(r2, r1)* h;
    }
    public static double AreaSideSurface(int r, int h){
        return TaskTwo.LengthCicle(r)* h;
    }
    public static double VolumeBall(int r, int h){
        return (TaskTwo.LengthCicle(r)* r *r * h * 2)/3;
    }
    public static double AreaBall(int R){
        return TaskTwo.AreaCicle(R)* 4;
    }
    public static double VolumeParallelepiped(int a, int b, int c){
        return TaskTwo.AreaRectangle(a, b)* c;
    }
    public static double AreaParallelepiped(int a, int b, int c){
        return (TaskTwo.PerimeterRectangle(a*c,b*c)/2+a*b)*2;
    }
    public static void main(String[] args){
        System.out.println("Объем цилиндра:");
        System.out.println("V="+VolumeCylinder(2, 4));
        System.out.println("Oбъем полого цилиндра:");
        System.out.println("V="+hollowVolumeCylinder(3, 2, 4));
        System.out.println("Площадь боковой:");
        System.out.println("S=" + AreaSideSurface(3, 4));
        System.out.println("Объем шара:");
        System.out.println("V=" + VolumeBall(2, 3));
        System.out.println("Площадь шара:");
        System.out.println("S="+AreaBall(3));
        System.out.println("Объем папараллелепипеда:");
        System.out.println("V="+VolumeParallelepiped(2, 4, 3));
        System.out.println("Площадь тетраэдра");
        System.out.println("S="+AreaParallelepiped(2, 3, 4));
    }
}
package jv1607.homeworks.basictypes.task_3;

import jv1607.homeworks.basictypes.task_2.TaskTwo;

public class TaskThree{
    public static double VolumeCylinder(int r, int h){
        return TaskTwo.AreaCicle(r)* h;
    }
    public static double HollowVolumeCylinder(int r2, int r1, int h){
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
        System.out.println(VolumeCylinder(2, 4));
        System.out.println(HollowVolumeCylinder(3, 2, 4));
        System.out.println(AreaSideSurface(3, 4));
        System.out.println(VolumeBall(2, 3));
        System.out.println(AreaBall(3));
        System.out.println(VolumeParallelepiped(2, 4, 3));
        System.out.println(AreaParallelepiped(2, 3, 4));
    }
}
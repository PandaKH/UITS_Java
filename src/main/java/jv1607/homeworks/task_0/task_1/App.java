package jv1607.homeworks.task_0.task_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

        
        
public class App {
    static Random r = new Random();
    static Student[] student;

    static final String[] lastName= {
        "Petya",
        "Vasya",
        "Oleg",
        "Yura",
        "Igor",
        "Andrey",
        "Stas"
    };

    static final String[] firstName= {
        "Ivanov",
        "Pugovkin",
        "Afanasiy",
        "Bukov",
        "Pirajkov",
        "Bubnov",
        "Prujkov",
        "Chernov",
        "Rubkov",
        "Babnikov",
        "Makhnov"
    };

    static final String[] patronymic= {
        "Aleksandrovich",
        "Petrasyanovich",
        "Stanislavovich",
        "Igorovich",
        "Popovich",
        "Bumagovich",
        "Rikhnovich",
        "Olegovich",
        "Lunakovich"
        
    };

    static final String[] faculty= {
        "КН",
        "ПИ",
        "КИ",
        "ПММ"
    };

    static final String[] group= {
        "01",
        "02",
        "03",
        "04",
        "05",
        "06"
    };

    static final String[] address= {
        "Lugovskaya",
        "Bakulina",
        "Pushkina",
        "Gagarina",
        "Devichya",
        "Saltovskaya"
    };

    static {
        student = new Student[50];
        for(int i=0; i<student.length; i++){
            Student s = new Student();
            s.setId(i+1);
            s.setFirstName(firstName[r.nextInt(11)]);
            s.setLastName(lastName[r.nextInt(7)]);
            s.setPatronymic(patronymic[r.nextInt(9)]);
            int month=(int)(Math.random()*12+1);
            int day;
            if(month==2){
                day= (int)(Math.random()*28+1);
            }
            else{
                day= (int)(Math.random()*31+1);
            }
            int year=(int)(Math.random()*20+1990);
            String birthday=day+"."+month+"."+year;
            s.setBirthday(birthday);
            int num1, num2, num3, num4, num5;
            num1 = r.nextInt(7) + 1;
            num2 = r.nextInt(9);
            num3 = r.nextInt(9);
            num4 = r.nextInt(899) + 100;
            num5 = r.nextInt(8999) + 1000;
            s.setPhone("("+num1 + "" + num2 + "" + num3 + ")" + num4 + "-" + num5 );
            s.setAddress(address[r.nextInt(6)]+" "+(r.nextInt(99)+1));
            s.setFaculty(faculty[r.nextInt(4)]);
            s.setGroup(group[r.nextInt(6)]);
            s.setCourse(r.nextInt(5)+1);
            student[i]=s;
        }
    }
    public static void main(String[] args) {
        print(student);
        System.out.println("");
        faculty(student, "ПММ");
        System.out.println("");
        facAndCour(student, "КН", 4);
        System.out.println("");
        year(student, 2001);
        System.out.println("");
        group(student, "04");
    }
    public static void print(Student[] stud){
        System.out.println("Список всех студентов:");
        for(int i=0; i<stud.length;i++){
            System.out.println(stud[i]);
        }
    }
    public static void faculty(Student[] stud, String fac){
        System.out.println("Студенты факультета " + fac+ ":");
        for(int i=0; i<stud.length; i++){
            if(stud[i].getFaculty().equals(fac)){
                System.out.println(stud[i]);
            }
        }
    }
    public static void facAndCour(Student[] stud, String fac, int cour){
        System.out.println("Студенты факультета " + fac + " " + cour + "курс"+ ":");
        for(int i=0; i<stud.length; i++){
            if(stud[i].getFaculty().equals(fac) && stud[i].getCourse() == cour){
                System.out.println(stud[i]);
            }
        }
    }
    public static void year(Student[] stud, int year){
        System.out.println("Студенты родившиеся после " + year+ ":");
        for(int i=0; i<stud.length; i++){
            String birthday = stud[i].getBirthday();
            String[] date = birthday.split("\\.");
            Integer i1 = new Integer(date[2]);
            if(i1>year){
                System.out.println(stud[i]);
            }
        }
    }
    public static void group(Student[] stud, String gr){
        System.out.println("Студенты группы " + gr + ":");
        for(int i=0; i<stud.length; i++){
            if(stud[i].getGroup().equals(gr)){
                System.out.println(stud[i]);
            }
        }
    }
}

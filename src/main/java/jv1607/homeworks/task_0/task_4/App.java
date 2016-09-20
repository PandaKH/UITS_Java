
package jv1607.homeworks.task_0.task_4;

import java.util.Random;

public class App {
    static Random r = new Random();
    static Abiturient[] abiturient;

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
    
    static{
        abiturient = new Abiturient[50];
        for(int i=0; i<abiturient.length; i++){
            Abiturient s = new Abiturient();
            s.setId(i+1);
            s.setFirstName(firstName[r.nextInt(11)]);
            s.setLastName(lastName[r.nextInt(7)]);
            s.setPatronymic(patronymic[r.nextInt(9)]);
            int num1, num2, num3, num4, num5;
            num1 = r.nextInt(7) + 1;
            num2 = r.nextInt(9);
            num3 = r.nextInt(9);
            num4 = r.nextInt(899) + 100;
            num5 = r.nextInt(8999) + 1000;
            s.setPhone("("+num1 + "" + num2 + "" + num3 + ")" + num4 + "-" + num5 );
            s.setMark1(r.nextInt(5)+1);
            s.setMark2(r.nextInt(5)+1);
            s.setMark3(r.nextInt(5)+1);
            s.setMark4(r.nextInt(5)+1);
            s.setMark5(r.nextInt(5)+1);
            abiturient[i]=s;
        }
    }
    public static void main(String[] args) {
        print(abiturient);
        System.out.println("");
        badMarks(abiturient);
        System.out.println("");
        badAverg(abiturient, 3.5);
        System.out.println("");
        bestAbit(abiturient);
    }
    public static void print(Abiturient[] abit){
        for(int i=0;i<abit.length; i++){
            System.out.println(abit[i]);
        }
    }
    public static void badMarks(Abiturient[] abit){
        System.out.println("Абитуриенты с плохой успеваемостью: ");
        for(int i=0;i<abit.length; i++){
            double aver =(double)(abit[i].getMark1()+abit[i].getMark2()+abit[i].getMark3()+abit[i].getMark4()+abit[i].getMark5())/5;
            if(aver<3.0){
                System.out.println(abit[i].getId() + " " + abit[i].getFirstName()+" "+abit[i].getLastName()+" "+abit[i].getPatronymic()+ " " +aver);
            }
        }
    }
    public static void badAverg(Abiturient[] abit, double averg){
        System.out.println("Абитуриенты у которых сумма баллов выше " + averg + ": ");
        for(int i=0;i<abit.length; i++){
            double avergMark =(double)(abit[i].getMark1()+abit[i].getMark2()+abit[i].getMark3()+abit[i].getMark4()+abit[i].getMark5())/5;
            if(avergMark > averg){
                System.out.println(abit[i].getId()+ " " +abit[i].getFirstName()+" "+abit[i].getLastName()+" "+abit[i].getPatronymic()+ " " +avergMark);
            }
        }
    }
    public static void bestAbit(Abiturient[] abit){
        System.out.println("Абитуриенты у которых самые высокие баллы: ");
        double maxAverg=0.0;
        double[] averg = new double[abit.length];
        for(int i=0;i<abit.length; i++){
            double avergMark =(double)(abit[i].getMark1()+abit[i].getMark2()+abit[i].getMark3()+abit[i].getMark4()+abit[i].getMark5())/5;
            averg[i]=avergMark;
        }
        for(int i=0;i<averg.length; i++){
            if(averg[i]>maxAverg){
                maxAverg=averg[i];
            }
        }   
        for(int i=0;i<averg.length; i++){
            if(averg[i]==maxAverg){
                System.out.println(abit[i].getId()+ " " +abit[i].getFirstName()+" "+abit[i].getLastName()+" "+abit[i].getPatronymic()+ " средний балл - " +maxAverg);
            }
        }
    }
}

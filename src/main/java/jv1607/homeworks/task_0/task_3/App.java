
package jv1607.homeworks.task_0.task_3;

import java.util.Random;

public class App {
    static Random r = new Random();
    static Patient[] patient;

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
    
    static final String[] address= {
        "Lugovskaya",
        "Bakulina",
        "Pushkina",
        "Gagarina",
        "Devichya",
        "Saltovskaya"
    };
    
    static final String[] diagnostic = {
        "анатомические",
        "патологоанатомические",
        "патофизиологические",
        "патогенетические",
        "нозологические ",
        "этиологические"
    };
    
    static {
        patient = new Patient[50];
        for(int i=0; i<patient.length; i++){
            Patient s = new Patient();
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
            s.setAddress(address[r.nextInt(6)]+" "+(r.nextInt(99)+1));
            s.setNumCard(r.nextInt(4900)+1000);
            s.setDiagnostic(diagnostic[r.nextInt(6)]);
            patient[i]=s;
        }
    }
    public static void main(String[] args) {
        print(patient);
        System.out.println("");
        diagnostic(patient, "этиологические");
        System.out.println("");
        interval(patient, 2000, 3000);
    }
    public static void print(Patient[] pat){
        for(int i=0; i<pat.length; i++){
            System.out.println(pat[i]);
        }
    }
    public static void diagnostic(Patient[] pat, String diagn){
        System.out.println("Пациенты с диагнозом " + diagn + " :");
        for(int i=0; i<pat.length; i++){
            if(pat[i].getDiagnostic()==diagn){
                System.out.println(pat[i]);
            }
        }
    }
    public static void interval(Patient[] pat, int start, int end){
        System.out.println("Пациенты с номером карты от " + start + " до " + end);
        for(int i=0; i<pat.length;i++){
            if(pat[i].getNumCard()> start && pat[i].getNumCard() < end){
                System.out.println(pat[i]);
            }
        }
    }
}

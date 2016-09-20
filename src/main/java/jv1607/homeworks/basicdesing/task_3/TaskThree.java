
package jv1607.homeworks.basicdesing.task_3;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        String [] colum1=new String []{
            "Дорогие друзья!", "с другой стороны ", "равным образом ", "Не следует, однако, забывать о том, что ",
            "Таким образом, ", "Повседневная практика показывает, что ", "Значимость этих проблем настолько очевидна, что ",
            "Разнообразный и богатый опыт ", "Задача организации, в особенности же ", "Соображения высшего порядка, а также "
        };
        String [] colum2=new String []{
            "реализация намеченных плановых заданий ", "рамки и место обучения кадров ",
            "постоянный количественный рост и сфера нашей активности ",
            "сложившаяся структура организации ", "новая модель ", "организационной деятельности ",
            "дальнейшее развитие различных форм деятельности ",
            "постоянное информационно-пропагандистское обеспечение нашей деятельности ",
            "укрепления и развития структуры ", "консультация с широким активом ",
            "начало повседневной работы по формированию позиции "
        };
        String [] colum3=new String []{
            "играет важную роль в формировании ", "рамки и место обучения кадров ",
            "требуют от нас анализа ", "требуют определения и уточнения ", "способствует подготовке и реализации ",
            "обеспечивает широкому кругу специалистов участие в формировании ","позволяет выполнить ",
            "важнейшие задания по разработке ", "в значительной степени обуславливает создание ",
            "позволяет оценить значение ", "представляет собой интересный эксперимент проверки ",
            "влечет за собой процесс внедрения и модернизации "
        };
        String [] colum4=new String []{
            "существующих финансовых и административных условий ", "дальнейших направлений развитая ",
            "системы массового участия ","позиций, занимаемых участниками в отношении поставленных задач ",
            "новых предложений ", "направлений прогрессивного развития ", "системы обучения кадров ",
            "соответствующей насущным потребностям ", "соответствующих условий активизации ",
            "модели развития ","форм воздействия "
        };
        String s="";
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<colum1.length; i++){
            System.out.println(i+". "+colum1[i]);
        }
        System.out.println("");
        System.out.println("1. Выберите фразу первую фразу");
        int n1 = sc.nextInt();
        for(int i=0; i<colum1.length; i++){
            if(i==n1){
            System.out.println(colum1[i]);
            s=colum1[i];
            }
        }
        System.out.println("");
        for(int i=0; i<colum2.length; i++){
            System.out.println(i+". "+colum2[i]);
        }
        System.out.println("");
        System.out.println("2. Выберите фразу вторую фразу");
        int n2 = sc.nextInt();
        for(int i=0; i<colum2.length; i++){
            if(i==n2){
            System.out.println(colum2[i]);
            s+=colum2[i];
            }
        }
        System.out.println("");
        for(int i=0; i<colum3.length; i++){
            System.out.println(i+". "+colum3[i]);
        }
        System.out.println("");
        System.out.println("3. Выберите фразу третью фразу");
        int n3 = sc.nextInt();
        for(int i=0; i<colum3.length; i++){
            if(i==n3){
            System.out.println(colum3[i]);
            s+=colum3[i];
            }
        }
        System.out.println("");
        for(int i=0; i<colum4.length; i++){
            System.out.println(i+". "+colum4[i]);
        }
        System.out.println("");
        System.out.println("4. Выберите фразу четвёртую фразу");
        int n4 = sc.nextInt();
        for(int i=0; i<colum4.length; i++){
            if(i==n4){
            System.out.println(colum4[i]);
            s+=colum4[i];
            }
        }
        System.out.println("");
        System.out.println("У вас получилась фраза:");
        System.out.println(s);
        
    }
}

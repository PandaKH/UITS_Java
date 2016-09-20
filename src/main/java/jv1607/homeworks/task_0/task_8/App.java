
package jv1607.homeworks.task_0.task_8;

public class App {
    static Car[] car = {
        new Car(1, "BMW", "5 Series Sedan", 2013, "blue", 2245104, "KH1207PN"),
        new Car(2, "BMW", "5 Series Sedan", 2013, "red", 2245104, "YS5104MN"),
        new Car(3, "BMW", "5 Series Touring", 2013, "grey", 3080000, "AH1502AGM"),
        new Car(4, "Lada", "Granta", 2016, "blue", 244900, "AJ1841MR"),
        new Car(5, "Lada", "Kalina 1117", 2014, "orange", 229900, "FY1419YT"),
        new Car(6, "Lamborghini", "", 2013, "red", 3250200, "YD2812YE")
    };
    public static void main(String[] args) {
        print(car);
        System.out.println("");
        company(car, "BMW");
        System.out.println("");
        year(car, 2);
        System.out.println("");
        price(car, 2013, 3000000);
    }
    public static void print(Car[] car){
        for(int i=0; i<car.length; i++){
            System.out.println(car[i]);
        }
    }
    public static void company(Car[] cars, String company){
        System.out.println("Автомобили марки - " + company + " :");
        for(int i=0; i<car.length; i++){
            if(car[i].getCompany().equals(company)){
                System.out.println(car[i]);
            }
        }
    }
    public static void year(Car[] cars, int year){
        System.out.println("Автомобили которые экспортируются больше  - " + year + " лет:");
        for(int i=0; i<car.length; i++){
            if((2016-car[i].getYear())>year){
                System.out.println(car[i]);
            }
        }
    }
    public static void price(Car[] cars, int year, int price){
        System.out.println("Автомобили " + year + " года с ценой больше "+ price + " :");
        for(int i=0; i<car.length; i++){
            if(car[i].getYear()==year && car[i].getPrice()>price){
                System.out.println(car[i]);
            }
        }
    }
}

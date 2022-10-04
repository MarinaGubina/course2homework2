import task1.Human;
import task3.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("task 1 and 2");
        Human maxim = new Human(-1987,null,"Минск","бренд-менеджер");
        System.out.println(maxim);
        Human anya = new Human(1993,"Аня",null,null);
        System.out.println(anya);
        Human katya = new Human(1994,"Катя","Калининград","продакт-менеджер");
        System.out.println(katya);
        Human artem = new Human(1995,"Артем","Москва","директор по развитию бизнеса");
        System.out.println(artem);

        System.out.println("task 3");
        Car car1 = new Car(null,null,null,null,null,
                null);
        System.out.println(car1);

        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"чёрный",
                2020,"Германия");
        System.out.println(car2);

        Car car3 = new Car("BMW","Z8",3.0,"чёрный",
                2021,"Германия");
        System.out.println(car3);

        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"красный",
                2018,"Южная Корея");
        System.out.println(car4);

        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",
                2016,"Южная Корея");
        System.out.println(car5);
    }
}
import task1.Human;
import task3.Car;

public class Main {
    public static void main(String[] args) {

        System.out.println("task 1 and 2");
        Human maxim = new Human();
        maxim.yearOfBirth = 1987;
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.job = "бренд-менеджер";
        maxim.greeting();

        Human anya = new Human();
        anya.yearOfBirth = 1993;
        anya.name = "Аня";
        anya.town = "Москва";
        anya.job = "методист образовательных программ";
        anya.greeting();

        Human katya = new Human();
        katya.yearOfBirth = 1994;
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.job = "продакт-менеджер";
        katya.greeting();

        Human artem = new Human();
        artem.yearOfBirth = 1995;
        artem.name = "Артем";
        artem.town = "Москва";
        artem.job = "директор по развитию бизнеса";
        artem.greeting();

        System.out.println("task 3");
        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Grande";
        car1.engineVolume = 1.7;
        car1.color = "желтый";
        car1.productionYear = 2015;
        car1.productionCountry = "Россия";
        car1.printParameter();

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.engineVolume = 3.0;
        car2.color = "чёрный";
        car2.productionYear = 2020;
        car2.productionCountry = "Германия";
        car2.printParameter();

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = 3.0;
        car3.color = "чёрный";
        car3.productionYear = 2021;
        car3.productionCountry = "Германия";
        car3.printParameter();

        Car car4 = new Car();
        car4.brand = "Kia";
        car4.model = "Sportage 4 поколение";
        car4.engineVolume = 2.4;
        car4.color = "красный";
        car4.productionYear = 2018;
        car4.productionCountry = "Южная Корея";
        car4.printParameter();

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = 1.6;
        car5.color = "оранжевый";
        car5.productionYear = 2016;
        car5.productionCountry = "Южная Корея";
        car5.printParameter();

    }
}
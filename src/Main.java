import transport.Car;

import static transport.Car.changeRubber;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(null,null,0.0,null,0,
                null,"МКПП","Седан","c123tg456",4);
        System.out.println(car1);

        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"чёрный",
                2020,"Германия","АКПП","седан","R656Tg496",5);
        System.out.println(car2);

        Car car3 = new Car("BMW","Z8",3.0,"чёрный",
                2021,"Германия","МКПП","универсал","с816еа456",4);
        System.out.println(car3);

        Car car4 = new Car("Kia","Sportage 4 поколение",2.4,"красный",
                2018,"Южная Корея","АКПП","Седан","с23а456",5);
        System.out.println(car4);

        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",
                2016,"Южная Корея","МКПП","Седан","K123Uy456",-8);
        System.out.println(car5);

        System.out.println(changeRubber());
    }
}
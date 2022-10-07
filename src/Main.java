import transport.Car;

import static transport.Car.changeRubber;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(null, null, 0.0, null, 0,
                null, "МКПП", "Седан", "c123tg456", 4);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный",
                2020, "Германия", "АКПП", "седан", "R656Tg496", 5);
        Car car3 = new Car("BMW", "Z8", 3.0, "чёрный",
                2021, "Германия", "МКПП", "универсал", "с816еа456", 4);
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.4, "красный",
                2018, "Южная Корея", "АКПП", "Седан", "с23а456", 5);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", "МКПП", "Седан", "K123Uy456", -8);
        System.out.println(changeRubber());
        printCar(car1);
        printCar(car2);
        printCar(car3);
        printCar(car4);
        printCar(car5);

    }
        private static void printCar(Car car){
            System.out.println(car.getBrand() + " " + car.getModel() + ", год выпуска - " + car.getProductionYear() +
                    ", страна производства - " + car.getProductionCountry() +
                    ", цвет - " + car.getColor() + ", объем двигателя - " + car.getEngineVolume() +
                    ", коробка передач - " + car.getTransmission() + ", тип кузова: " + car.getType() +
                    ", регистрационный номер - " + car.getRegNumber() + ", вместимость - " + car.getCapacity() +
                    " ключ : " + (car.getKey().isKeylessAccess()? "доступ без ключа":"доступ с ключом" +" ," )+
                    (car.getKey().isRemoteEngineStart()? "удаленный запуск":"нет удаленного запуска")+
                    " Cтраховка. Период: "+ car.getInsurance().getPeriodInsurance() +
                    " Стоимость: "+car.getInsurance().getCostInsurance() + " Номер страховки: " +
                    car.getInsurance().getNumberOfInsurance()
            );

        }
}
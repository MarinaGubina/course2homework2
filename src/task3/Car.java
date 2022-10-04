package task3;

public class Car {
        public String brand;
        public String model;
        public double engineVolume;
        public String color;
        public int productionYear;
        public String productionCountry;

        public void printParameter(){
            System.out.println(brand + " " + model + ", год выпуска - " + productionYear +
                    ", страна производства - "+ productionCountry +
                    ", цвет - "+ color + ", объем двигателя - "+ engineVolume);
        }
}

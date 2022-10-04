package task3;
public class Car {
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int productionYear;
        private String productionCountry;

        public Car(String brand, String model,double engineVolume,String color,int productionYear,String productionCountry){
                this.brand = brand;
                this.model = model;
                this.engineVolume = engineVolume;
                this.color = color;
                this.productionYear = productionYear;
                this.productionCountry = productionCountry;
        }

        public String toString(){
                return  brand + " " + model + ", год выпуска - " + productionYear +
                        ", страна производства - "+ productionCountry +
                        ", цвет - "+ color + ", объем двигателя - "+ engineVolume;
        }
}



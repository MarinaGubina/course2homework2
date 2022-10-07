package transport;

import java.time.LocalDate;

public class Car {
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int productionYear;
        private String productionCountry;
        private String transmission;
        private String type;
        private String regNumber;
        private int capacity;
        public static String rubber;


        public Car(String brand, String model,Double engineVolume,String color,Integer productionYear,
                   String productionCountry,String transmission,String type,String regNumber,
                   int capacity){
                if(isNullOrEmpty(brand)){
                        this.brand = "default";}
                else{
                        this.brand = brand;
                }
                if(isNullOrEmpty(model)){
                        this.model = "default";}
                else{
                        this.model = model;}
                if(engineVolume <= 0 ){
                        this.engineVolume = 1.5;}
                else{
                        this.engineVolume = engineVolume;}
                if(isNullOrEmpty(color)){
                        this.color = "белый";}
                else{
                        this.color = color;}
                if(productionYear <= 0){
                        this.productionYear = 2000;}
                else{
                        this.productionYear = productionYear;}
                if(isNullOrEmpty(productionCountry)){
                        this.productionCountry = "default";}
                else{
                        this.productionCountry = productionCountry;}
                if(isNullOrEmpty(transmission)){
                        this.transmission = "default";}
                else{
                        this.transmission = transmission;}
                if(isNullOrEmpty(type)){
                        this.type = "default";}
                else{
                        this.type = type;}
                if(regNumber.matches("[a-zA-Z]\\d{3}[a-zA-Z]{2}\\d{3}")){
                        this.regNumber = regNumber;}
                else{
                        this.regNumber = "Некорректный номер";
                }
                if(capacity <= 0){
                        this.capacity = 5;}
                else{
                        this.capacity = capacity;}
        }
        public static boolean isNullOrEmpty(String val){
                return val == null || val.isEmpty() || val.isBlank();
        }
        public static String changeRubber(){
                if(LocalDate.now().getMonthValue() > 10 || LocalDate.now().getMonthValue() <= 4){
                        return rubber = "Зимняя резина";
                }
                else{
                        return rubber = "Летняя резина";
                }
        }
        public String getBrand() {
                return brand;
        }

        public String getModel() {
                return model;
        }

        public int getProductionYear() {
                return productionYear;
        }

        public String getProductionCountry() {
                return productionCountry;
        }

        public String getType() {
                return type;
        }

        public int getCapacity() {
                return capacity;
        }

        public double getEngineVolume() {
                return engineVolume;
        }

        public void setEngineVolume(double engineVolume) {
                if(engineVolume > 0){
                this.engineVolume = engineVolume;}
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                if(!isNullOrEmpty(color)){
                this.color = color;}
        }

        public String getTransmission() {
                return transmission;
        }

        public void setTransmission(String transmission) {
                if(!isNullOrEmpty(transmission)){
                this.transmission = transmission;}
        }

        public String getRegNumber() {
                return regNumber;
        }

        public void setRegNumber(String regNumber) {
                if(regNumber.matches("[a-zA-Z]\\d{3}[a-zA-Z]{2}\\d{3}")){
                this.regNumber = regNumber;}
        }

        @Override
        public String toString(){
                return  brand + " " + model + ", год выпуска - " + productionYear +
                        ", страна производства - "+ productionCountry +
                        ", цвет - "+ color + ", объем двигателя - "+ engineVolume +
                ", коробка передач - " + transmission + ", тип кузова: " + type +
                ", регистрационный номер - " + regNumber + ", вместимость - " + capacity;
        }
}



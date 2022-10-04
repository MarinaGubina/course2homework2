package task3;
public class Car {
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int productionYear;
        private String productionCountry;

        public Car(String brand, String model,Double engineVolume,String color,Integer productionYear,String productionCountry){
                if(brand!=null){
                this.brand = brand;}
                else{this.brand = "default";}
                if(model!=null){
                        this.model = model;}
                else{this.model = "default";}
                if(engineVolume!=null){
                        this.engineVolume = engineVolume;}
                else{this.engineVolume = 1.5;}
                if(color!=null){
                        this.color = color;}
                else{this.color = "белый";}
                if(productionYear!=null){
                        this.productionYear = productionYear;}
                else{this.productionYear = 2000;}
                if(productionCountry!=null){
                        this.productionCountry = productionCountry;}
                else{this.productionCountry = "default";}
        }
@Override
        public String toString(){
                return  brand + " " + model + ", год выпуска - " + productionYear +
                        ", страна производства - "+ productionCountry +
                        ", цвет - "+ color + ", объем двигателя - "+ engineVolume;
        }
}



package task2;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerName,String flowerColor,String country, double cost, int lifeSpan){
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()){
            this.flowerName = "не указан";}
        else{this.flowerName = flowerName;}
        if (flowerColor == null){
            this.flowerColor = "белый";}
        else{this.flowerColor = flowerColor;}
        if(country == null){
            this.country = "Россия";}
        else{this.country = country;}
        if(cost <= 0){
            this.cost = 1;}
        else{this.cost = cost;}
        if(lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        }
        else{this.lifeSpan = 3;}
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Название: " + flowerName + " Страна: " + country +
                " Стоимость: " + cost + " Срок стояния: " + lifeSpan;
    }
}

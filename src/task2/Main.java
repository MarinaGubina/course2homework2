package task2;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза", null, "Голландия", 35.59, 0);
        Flower chrys = new Flower("Хризантема", null, null, 15.0, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.9, 1);
        Flower gyps = new Flower("Гипсофила", null, "Турция", 19.5, 10);
        Flower[] flowers = new Flower[4];
        flowers[0] = rose;
        flowers[1] = chrys;
        flowers[2] = peony;
        flowers[3] = gyps;
        for(int i = 0; i < flowers.length ; i++){
            System.out.println(flowers[i]);
        }

    }
}
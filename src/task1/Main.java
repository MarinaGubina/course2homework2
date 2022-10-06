package task1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задания по классу Human");
        Human maxim = new Human(-1987, null, "Минск", "бренд-менеджер");
        System.out.println(maxim);
        Human anya = new Human(1993, "Аня", null, null);
        System.out.println(anya);
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджер");
        System.out.println(katya);
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
        System.out.println(artem);
        Human vladimir = new Human(2001, "Владимир", "Казань", null);
        System.out.println(vladimir);

    }
}
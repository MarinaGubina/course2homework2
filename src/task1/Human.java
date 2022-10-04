package task1;

public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String job;

    public void greeting(){
        System.out.println("Привет! Меня зовут "+name +". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " +job+ ". Будем знакомы!");

    }
}

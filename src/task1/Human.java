package task1;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int yearOfBirth, String name,String town,String job){
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;
    }

    public String toString(){
        return  "Привет! Меня зовут "+name +". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " +job+ ". Будем знакомы!";
    }

}

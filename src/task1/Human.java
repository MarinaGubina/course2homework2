package task1;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int yearOfBirth, String name,String town,String job){
        if(yearOfBirth >= 0 ){
        this.yearOfBirth = yearOfBirth;}
        else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if(name != null){
        this.name = name;}
        else{
            this.name = "Информация не указана";
        }
        if(town != null){
            this.town = town;}
        else{
            this.town = "Информация не указана";
        }
        if(job != null){
            this.job = job;}
        else{
            this.job = "Информация не указана";
        }
    }
@Override
    public String toString(){
        return  "Привет! Меня зовут "+name +". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " +job+ ". Будем знакомы!";
    }

}

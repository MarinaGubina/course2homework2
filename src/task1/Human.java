package task1;

public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(int yearOfBirth, String name,String town,String job){
        if(yearOfBirth < 0 ){
            this.yearOfBirth = Math.abs(yearOfBirth);}
        else{this.yearOfBirth = yearOfBirth;}
        if(name == null){
            this.name = "Информация не указана";}
        else{this.name = name;}
        if(town == null){
            this.town = "Информация не указана";}
        else{this.town = town;}
        if(job == null){
            this.job = "Информация не указана";}
        else{this.job = job;}
    }
    public String getTown(){
        return town;
    }
    public void setTown(String town){
        if(town == null){
            this.town = "Информация не указана";
        }
        else{
            this.town = town;
        }
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth){
        if(yearOfBirth <= 0 ){
            this.yearOfBirth = 0;
        }
        else{
            this.yearOfBirth = yearOfBirth;
        }
    }
@Override
    public String toString(){
        return  "Привет! Меня зовут "+name +". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году. Я работаю на должности " +job+ ". Будем знакомы!";
    }

}

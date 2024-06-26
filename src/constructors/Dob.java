package constructors;

public class Dob {
    int date;
    String month;
    double year;

    public  Dob(int date,String month,double year){
        this.date = date;
        this.month= month;
        this.year= year;
    }

    @Override
    public String toString() {
        return "Dob{" +
                "date=" + date +
                ", month='" + month + '\'' +
                ", year=" + year +
                '}';
    }
}

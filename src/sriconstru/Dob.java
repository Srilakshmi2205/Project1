package sriconstru;

public class Dob {
    private int date;
    private String month;
    private int year;

    public Dob(int date,String month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

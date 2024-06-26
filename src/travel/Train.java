package travel;

public class Train {
    public String trainName;
    public int trainNo;
    public String departure;
    public String destination;
    public int tktPrice;

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", trainNo=" + trainNo +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", tktPrice=" + tktPrice +
                '}';
    }
}

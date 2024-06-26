package travel;

public class Flight {
    public String flightName;
    public int flightNo;
    public String departure;
    public String destination;
    public int tktPrice;

    @Override
    public String toString() {
        return "Flight{" +
                "flightName='" + flightName + '\'' +
                ", flightNo=" + flightNo +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", tktPrice=" + tktPrice +
                '}';
    }
}

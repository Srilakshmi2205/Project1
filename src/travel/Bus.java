package travel;

public class Bus {
    public String busName;
    public int busNo;
    public String departure;
    public String destination;
    public int tktPrice;

    @Override
    public String toString() {
        return "Bus{" +
                "busName='" + busName + '\'' +
                ", busNo=" + busNo +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", tktPrice=" + tktPrice +
                '}';
    }
}

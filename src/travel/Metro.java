package travel;

public class Metro {
    public String metroName;
    public int metroNo;
    public String departure;
    public String destination;
    public int price;

    @Override
    public String toString() {
        return "Metro{" +
                "metroName='" + metroName + '\'' +
                ", metroNo=" + metroNo +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                '}';
    }
}

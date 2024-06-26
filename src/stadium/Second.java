package stadium;

public class Second {
    public String type;
    public int price;
    public String bookedPerson;
    public int noOfSeatsFilled;
    public int noOfSeatsRemains;

    @Override
    public String toString() {
        return "Second{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", bookedPerson='" + bookedPerson + '\'' +
                ", noOfSeatsFilled=" + noOfSeatsFilled +
                ", noOfSeatsRemains=" + noOfSeatsRemains +
                '}';
    }
}

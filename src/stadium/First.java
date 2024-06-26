package stadium;

public class First {
    public String type;
    public int price;
    public String bookedPerson;
    public int noOfSeatsFilled;
    public int noOfSeatsRemains;

    @Override
    public String toString() {
        return "First{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", bookedPerson='" + bookedPerson + '\'' +
                ", noOfSeatsFilled=" + noOfSeatsFilled +
                ", noOfSeatsRemains=" + noOfSeatsRemains +
                '}';
    }
}

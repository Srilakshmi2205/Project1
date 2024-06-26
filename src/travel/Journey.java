package travel;

public class Journey {
    public String date;
    public Bus bus;
    public Train train;
    public Flight flight;
    public Metro metro;

    @Override
    public String toString() {
        return "Journey{" +
                "date='" + date + '\'' +
                ", bus=" + bus +
                ", train=" + train +
                ", flight=" + flight +
                ", metro=" + metro +
                '}';
    }
}


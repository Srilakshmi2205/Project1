package stadium;

public class Ticket {
    public String venue;
    public String date;
    public First first;
    public Second second;
    public Special spcl;

    @Override
    public String toString() {
        return "Ticket{" +
                "venue='" + venue + '\'' +
                ", date='" + date + '\'' +
                ", first=" + first +
                ", second=" + second +
                ", spcl=" + spcl +
                '}';
    }
}

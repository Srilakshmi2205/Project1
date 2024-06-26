package travel;

public class JourneyTest {
    public static void main(String[] args){
        Bus b1 = new Bus();
        Train t1 = new Train();
        Flight f1 = new Flight();
        Metro m1 = new Metro();
        Journey j1 = new Journey();
        b1.busName = "Garuda";
        b1.busNo = 201;
        b1.departure = "Hyd";
        b1.destination = "Vijaywada";
        b1.tktPrice = 800;
        t1.trainName = "Sabari";
        t1.trainNo = 1206;
        t1.departure = "Sec";
        t1.destination = "Vizag";
        t1.tktPrice = 600;
        f1.flightName = "Indigo";
        f1.flightNo = 109;
        f1.departure = "Samshabad";
        f1.destination = "Delhi";
        f1.tktPrice = 20000;
        m1.metroName = "Hyd-Metro";
        m1.metroNo = 18;
        m1.departure = "Miyapur";
        m1.destination = "L.B Nagar";
        m1.price = 50;
        j1.bus = b1;
        j1.train = t1;
        j1.flight = f1;
        j1.metro = m1;
        j1.date = "01/06/2024";
        System.out.println(j1);


    }
}

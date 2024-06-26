package stadium;

public class TicketTest {
    public static void main(String[] args){
        First fir = new First();
        Second sec = new Second();
        Special sp = new Special();
        Ticket tkt = new Ticket();
        fir.type= "VIP";
        fir.price = 5000;
        fir.bookedPerson = "Shiva";
        fir.noOfSeatsFilled = 80;
        fir.noOfSeatsRemains = 20;
        sec.type = "General";
        sec.bookedPerson = "Ramu";
        sec.price = 2000;
        sec.noOfSeatsFilled = 90;
        sec.noOfSeatsRemains = 10;
        sp.type = "Premium";
        sp.bookedPerson = "Ravi";
        sp.price = 4000;
        sp.noOfSeatsFilled = 75;
        sp.noOfSeatsRemains = 25;
        tkt.venue = "UPPAL";
        tkt.date = "10/05/2024";
        tkt.first=fir;
        tkt.second=sec;
        tkt.spcl=sp;
        System.out.println(tkt);


    }
}

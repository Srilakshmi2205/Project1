package hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Node Hotel = new Node();
        Hotel.key = "Hotel";
        Hotel.value = "Hotel Data";

        List<Node>childOfHotel = new ArrayList<>();

        Node division = new Node();
        Node department = new Node();
        Node designation = new Node();

        childOfHotel.add(division);
        childOfHotel.add(designation);
        childOfHotel.add(department);




    }
}

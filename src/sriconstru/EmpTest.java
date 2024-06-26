package sriconstru;

public class EmpTest {
    public static void main(String[] args) {
        Address address = new Address(402,"Miyapur", "SBI");
        Dob dob = new Dob(2,"February",2022);
        Employee emp = new Employee("Sri",24,400000.00,address,dob);
        System.out.println(dob.getDate());
        System.out.println(address.getStreetName());




    }
}

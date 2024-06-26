package constructors;

public class EmployeeTest {
    public static void main(String[] args) {
        Address address = new Address("church-street","Miyapur",402);
        Dob dob = new Dob(25,"May",2024);
        Employee employee = new Employee("Sri",30000.00,25,address,dob);
        System.out.println(dob);
        System.out.println(employee);
    }
}

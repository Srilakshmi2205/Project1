package constructors;

public class Employee {
    public String empName;
    public double empSalary;
    public int age;
    public Address address;
    public Dob dob;

    public  Employee(String empName,double empSalary,int age,Address address,Dob dob){
        this.empName = empName;
        this.empSalary = empSalary;
        this.age = age;
        this.address = address;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", age=" + age +
                ", address=" + address +
                ", dob=" + dob +
                '}';
    }
}

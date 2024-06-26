package sriconstru;

public class Employee {
    private String empName;
    private int age;
    private double salary;
    private Address address;
    private Dob dob;

    public Employee(String empName,int age,double salary,Address address,Dob dob){
        this.empName = empName;
        this.age = age;
        this.salary = salary;
        this.address = address;
        this.dob = dob;

    }
    public String getEpName(){
        return empName;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public Address getAddress(){
        return address;
    }

    public Dob getDob() {
        return dob;
    }
}

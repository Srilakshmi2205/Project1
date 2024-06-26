package studentDetails;

public class Student {
    public String name;
    public String gender;
    public String mobile;
    public String dob;
    public Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", dob='" + dob + '\'' +
                ", address=" + address +
                '}';
    }
}

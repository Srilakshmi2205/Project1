package school;

public class Student {
    public String studentName;
    public String gender;
    public int age;
    public Address address;
    public String mobile;
    public String dob;

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobile='" + mobile + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}

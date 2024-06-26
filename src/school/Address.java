package school;

public class Address {
    public String  flatNo;
    public String street;
    public String city;
    public String state;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public String pincode;
}

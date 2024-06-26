package studentDetails;

public class Address {
    public String flatNO;
    public String street;
    public String city;
    public String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "flatNO='" + flatNO + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}

package constructors;

public class Address {
    public String streetName;
    public String cityName;
    public int flatNo;

    public Address(String streetName,String cityName,int flatNo){
        this.streetName= streetName;
        this.cityName= cityName;
        this.flatNo= flatNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", flatNo=" + flatNo +
                '}';
    }
}

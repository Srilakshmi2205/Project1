package sriconstru;

public class Address {
    private int flatNo;
    private String cityName;
    private String streetName;

    public Address(int flatNo, String cityName, String streetName) {
        this.flatNo = flatNo;
        this.streetName = streetName;
        this.cityName = cityName;
    }
    public String getCityName(){
        return cityName;
    }
    public String getStreetName(){
        return streetName;
    }
    public int getFlatNo(){
        return flatNo;
    }
}

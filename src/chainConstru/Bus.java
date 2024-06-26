package chainConstru;

public class Bus {
    private int busNo;
    private String busName;
    private double cost;


    public Bus(int busNo,String busName,double cost){
        this.busName = busName;
        this.busNo = busNo;
        this.cost = cost;


    }
    public Bus(int busNo){
        this(busNo,null,0.0);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNo=" + busNo +
                ", busName='" + busName + '\'' +
                ", cost=" + cost +
                '}';
    }
}

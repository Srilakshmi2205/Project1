package chainConstru;

public class Car {
    private String carName;
    private int carNo;

    public Car(String carName,int carNo){
        this.carName = carName;
        this.carNo = carNo;
    }
    public Car(String carName){
        this("CarABC",0);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carNo=" + carNo +
                '}';
    }
}

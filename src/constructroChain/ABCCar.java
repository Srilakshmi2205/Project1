package constructroChain;

public class ABCCar {
    private String color;
    private String dashboard;
    private String wheel;
    private String engine;
    public ABCCar(String color,String dashboard,String wheel){
        this(color,dashboard,wheel,"2000");

    }
    public ABCCar(String color,String dashboard,String wheel,String engine){
        this.color = color;
        this.engine = engine;
        this.dashboard = dashboard;
        this.wheel = wheel;
    }
}

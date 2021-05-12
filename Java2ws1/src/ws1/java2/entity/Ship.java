package ws1.java2.entity;

public class Ship extends Vehicle {

    private String modelName;
    private int maxSpeed;
    private int numberLimit;
    private int replacement;
    private boolean available;
    public Ship(String modelName, int maxSpeed, int numberLimit, int replacement){
        super(modelName, maxSpeed, numberLimit);
        this.replacement = replacement;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" 배 수 량 : " + replacement + "톤");
    }
}

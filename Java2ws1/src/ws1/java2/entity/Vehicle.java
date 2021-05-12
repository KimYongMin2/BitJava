package ws1.java2.entity;

public class Vehicle {
    private String modelName;
    private int maxSpeed;
    private int numberLimit;
    private boolean available;

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Vehicle(String modelName, int maxSpeed, int numberLimit){
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.numberLimit = numberLimit;
    }

    public void displayInfo() {
        System.out.println("-------------------------------------------");
        System.out.println(" 모 델 명 : " + modelName);
        System.out.println(" 최고속도 : " + maxSpeed + "km/h");
        System.out.println(" 최대정원 : " + numberLimit + "명");
    }

}

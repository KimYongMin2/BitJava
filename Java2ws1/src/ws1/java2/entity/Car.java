package ws1.java2.entity;

public class Car extends Vehicle {
    private String modelName;
    private int maxSpeed;
    private int numberLimit;
    private int mileage;
    private boolean available;

    public Car(String modelName, int maxSpeed, int numberLimit, int mileage){
        super(modelName, maxSpeed, numberLimit);
        this.mileage = mileage;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" 평균연비 : " + mileage + "km/l");
    }
}

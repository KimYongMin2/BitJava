package ws1.java2.entity;

public class Ship extends Vehicle {
    private int replacement;

    public Ship(String modelName, int maxSpeed, int numberLimit, int replacement){
        super(modelName, maxSpeed, numberLimit);
        this.replacement = replacement;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" 배 수 량 : " + replacement + "톤");
    }
}

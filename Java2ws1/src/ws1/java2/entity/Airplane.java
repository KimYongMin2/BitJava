package ws1.java2.entity;

public class Airplane extends Vehicle{
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private int numOfEngine;
	private boolean available;

    public Airplane(String modelName, int maxSpeed, int numberLimit, int numOfEngine){
        super(modelName, maxSpeed, numberLimit);
        this.numOfEngine = numOfEngine;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        super.displayInfo();
		System.out.println(" 엔진개수 : " + numOfEngine + "개");
	}
}

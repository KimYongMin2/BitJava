package day5;
class Car{
    String  color;
    String gearType;
    int door;

    Car(){}
    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);
        System.out.println("c1 color, gearType, door = " + c1.color + c1.gearType + c1.door);
        System.out.println("c2 color, gearType, door = " + c2.color + c2.gearType + c2.door);
    }
}

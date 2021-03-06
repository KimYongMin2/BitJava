package ws1.java2.controller;

import ws1.java2.entity.*;

import java.util.ArrayList;
import java.util.Iterator;

public class VehicleManager {
    ArrayList vehicle = new ArrayList();
    public VehicleManager() {
        vehicle.add(new Airplane("보잉747", 1300, 300, 4));
        vehicle.add(new Airplane("F-15", 1600, 1, 1));
        vehicle.add(new Car("그랜저", 180, 5, 10));
        vehicle.add(new Car("스파크", 130, 4, 15));
        vehicle.add(new Car("스타렉스", 150, 10, 11));
        vehicle.add(new Ship("크루즈2", 30, 400, 35000));
        vehicle.add(new Ship("노틸러스", 25, 150, 15000));

    }
    public void displayVehicles(String title) {
        System.out.println(title);
        for (int i = 0; i < vehicle.size(); i++){
            Vehicle v = (Vehicle)vehicle.get(i);
            v.displayInfo();
            v.setAvailable(true);
        }
        System.out.println();

        Iterator iterator = vehicle.iterator();
        while (iterator.hasNext()){
            Vehicle v = (Vehicle)iterator.next();
            v.displayInfo();
            v.setAvailable(true);
        }
    }
    /*
    Airplane[] airplaneArr;
    Car[] carArr;
    Ship[] shipArr;

    public VehicleManager() {
        airplaneArr = new Airplane[2];
        carArr = new Car[3];
        shipArr = new Ship[2];

        airplaneArr[0] = new Airplane("보잉747", 1300, 300, 4);
        airplaneArr[1] = new Airplane("F-15", 1600, 1, 1);

        carArr[0] = new Car("그랜저", 180, 5, 10);
        carArr[1] = new Car("스파크", 130, 4, 15);
        carArr[2] = new Car("스타렉스", 150, 10, 11);

        shipArr[0] = new Ship("크루즈2", 30, 400, 35000);
        shipArr[1] = new Ship("노틸러스", 25, 150, 15000);
    }

    public void displayVehicles(String title) {
        System.out.println(title);

        for (int inx = 0 ; inx < airplaneArr.length ; inx++) {
            airplaneArr[inx].displayInfo();
            airplaneArr[inx].setAvailable(true);
        }

        for (int inx = 0 ; inx < carArr.length ; inx++) {
            carArr[inx].displayInfo();
            carArr[inx].setAvailable(true);
        }

        for (int inx = 0 ; inx < shipArr.length ; inx++) {
            shipArr[inx].displayInfo();
            shipArr[inx].setAvailable(true);
        }

        System.out.println();
    }
}
    */
/*
    Vehicle[] vehicle;

    public VehicleManager() {
        vehicle = new Vehicle[7];
        vehicle[0] = new Airplane("보잉747", 1300, 300, 4);
        vehicle[1] = new Airplane("F-15", 1600, 1, 1);
        vehicle[2] = new Car("그랜저", 180, 5, 10);
        vehicle[3] = new Car("스파크", 130, 4, 15);
        vehicle[4] = new Car("스타렉스", 150, 10, 11);
        vehicle[5] = new Ship("크루즈2", 30, 400, 35000);
        vehicle[6] = new Ship("노틸러스", 25, 150, 15000);
    }

    public void displayVehicles(String title) {
        System.out.println(title);
        for (int i = 0; i < vehicle.length; i++){
            vehicle[i].displayInfo();
            vehicle[i].setAvailable(true);
        }
        System.out.println();
    }

 */
}


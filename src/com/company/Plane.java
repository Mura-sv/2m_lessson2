package com.company;

public class Plane extends Transport {

    private int passengers;
    private int planeSpeed;


    public Plane(String name, String type, int passengers, int planeSpeed) {
        super.setName(name);
        super.setType(type);
        this.passengers = passengers;
        this.planeSpeed = planeSpeed;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPlaneSpeed(int planeSpeed) {
        this.planeSpeed = planeSpeed;
    }

    public int getPlaneSpeed() {
        return planeSpeed;
    }


    public void print() {
        System.out.println("Name:"+ super.getName() + " Type:" + super.getType()
                + " Passengers:" + getPassengers() + " Airplane speed:" + getPlaneSpeed());

    }

}

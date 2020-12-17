package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Airplane", 3).print();
        createObject("Train", 2).print();
        createObject("Ship", 4).print();
        
    }

    public static Transport createObject(String className, int classNumber) {

        Transport value = null;
        switch (classNumber) {

            case 2:
                Train train = new Train("Bullet", "Bullet Train", "land");
                value = train;
                break;
            case 3:
                Plane plane = new Plane("boeing 470", "air", 50, 900);
                value = plane;
                break;
            case 4:
                Ship ship = new Ship("banana boat", "water", "reefer vessel");
                value = ship;
                break;
            default:
                break;
        }
        return value;
    }
}

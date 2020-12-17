package com.company;

public class Ship extends Transport   {

    private String shipType;

    public Ship(String name, String type, String shipType) {
        super.setName(name);
        super.setType(type);
        this.shipType = shipType;
    }

    public String getShipType() {
        return shipType;
    }

    public void print() {
        super.print();
        System.out.print(" Ship type:"+ getShipType());

    }

}

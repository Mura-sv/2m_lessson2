package com.company;

public class Train extends Transport implements Printable{

    private String trainType;

    public Train(String trainType,String name,String type){
        super.setName(name);
        super.setType(type);
        this.trainType=trainType;
    }





    public String getTrainType() {
        return trainType;
    }

    public void print(){
        System.out.println(getName()+" "+getType()+" "+getTrainType());
    }
}

package com.company;

public class Transport implements Printable{

    private String name;
    private String type;

    public Transport(){}

    public Transport(String name,String type){
        this.name=name;
        this.type=type;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type= type;
    }


    public String getName() {
        return name;
    }
    public String getType(){
        return type;
    }

    @Override
    public void print() {
        System.out.println("Name:"+getName()+" Type:"+getType());
    }
}

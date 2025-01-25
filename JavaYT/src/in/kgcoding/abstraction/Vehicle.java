package in.kgcoding.abstraction;

import in.kgcoding.Transport;

public abstract class Vehicle implements Transport {
    private int noOfTires;

    public abstract void makeStartSound();
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public  void commute(){
        System.out.println("Going.........");
    }
}

package com.inheritance;

public class Vehicle {
     int numberOfTires;

    public void setNumberOfTires(int numberOfTires){
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString() {
        return "Vechile no of tires :"+ numberOfTires;
    }

    public void commute(){
        System.out.printf("I am going from place A to place B" +
                " using %d tires\n", numberOfTires);
    }
}

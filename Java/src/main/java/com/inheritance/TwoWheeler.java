package com.inheritance;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
       setNumberOfTires(2);
       numberOfTires=3;
    }
    public void balance(){
        System.out.println("I am balancing on two tires");
    }

}

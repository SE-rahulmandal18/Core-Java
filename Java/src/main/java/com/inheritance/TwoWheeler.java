package com.inheritance;

public class TwoWheeler extends Vehicle{
    TwoWheeler(){
       setNumberOfTires(2);  // access through set method because numberOfTires has private access
        numberOfTires=4;     // access because has default access- same package 

    }
    public void balance(){
        System.out.println("I am balancing on two tires");
    }

}

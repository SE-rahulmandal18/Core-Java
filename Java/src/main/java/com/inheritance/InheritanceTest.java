package com.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle  = new Vehicle();
        TwoWheeler twoWheeler = new TwoWheeler();

        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        twoWheeler.commute();
        twoWheeler.balance();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();
        motorCycle.balance();
        motorCycle.start();
    }
}

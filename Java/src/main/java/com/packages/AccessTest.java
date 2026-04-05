package com.packages;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color="Red";
        car.model="Swift";
        car.fuelLevel=5.0 // cannot be access as it is private in car class    
        car.costOfPurchase=733;  // can be access as it has default access in car class,meaning AccessTest and Car class are in same package
        
        System.out.println(car);

        Car newCar = new Car("Black", "BMW",
                1, 5000);

        System.out.println(newCar);

        Default def = new Default();
    }
}

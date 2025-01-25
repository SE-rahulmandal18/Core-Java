package com.example.autowire.constructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

//    public void setSpecification1(Specification specification) {
//        this.specification1 = specification;
//    }

    public void displayDetails(){
        System.out.println("Car Details: "+ specification.toString());
    }

}

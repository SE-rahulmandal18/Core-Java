package com.knowledgegate;

import com.packages.Car;

public class DefaultTest {
    public static void main(String[] args) {
        Car car = new Car("YELLOW", "Dezire",
                5, 3000);
//        car.costOfPurchase=8;  // cannnot be access as the property has default access-within the same package

        Default default = new Default() // cannot create object of the default class , as it has default access

    }
}

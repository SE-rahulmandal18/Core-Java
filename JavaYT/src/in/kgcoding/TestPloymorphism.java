class Plane extends Vechile{
}

class Vechile {
    public void start(){
        System.out.println("Starting the vechile");
    }
}

class Car extends Vechile {
    
    public int noOfDoors(){
        return 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Vechile v = new Vechile();
        Plane p = new Plane();
        
        // castTest(v);
        castTest(c);
        // castTest(p);
        
        
        // Vechile vCar = new Car(); // ture since every car is a vechile
        // Car cVechile = (Car) new Vechile(); // compilation error since every vechile cannnot be car
        // java.lang.ClassCastException: class Vechile cannot be cast to class Car
    }
    
    public static void castTest(Vechile veh){
        // veh.start();
        
        // Car cVechile = (Car) veh; // cast is allowed since we know that the car object is passed even if the reference the veh
        // cVechile.start();
        
        Car cVechile = (Car) veh; 
        ((Car) veh).noOfDoors();
        cVechile.start();
    }
}

public class Driver {
    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicence;

    public boolean isAllowedToDriver(){
        return this.age >= minAgeForDriving ;
    }

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println( myCar.getCurrentFuelLevel());

          Car swift = new Car("Red");  //agr constructor called
          Car thar = new Car(); // no-agr constructor called
//          swift.addFuel(6);
//          Car startedCar  =  swift.start();
//          startedCar.drive();
          swift.start().drive();
        System.out.println(swift.color);
        System.out.println(thar.color);

          Driver myDriver = new Driver();
          myDriver.dateOfLicence="10 Sep 2024";
          System.out.println(minAgeForDriving);

  }
}

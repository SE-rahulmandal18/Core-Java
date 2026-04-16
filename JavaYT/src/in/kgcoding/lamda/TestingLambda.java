package in.kgcoding.lamda;

public class TestingLambda {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Task()); // here we need to pass the object of runnable 
        // so to simply this we have lambda expression as below 

         Thread t1 = new Thread(() -> {
        system.out.println("Hello");
            }); 
      

        
        
        // TestingLambda test = new TestingLambda();
        // int sum = test.sum(6,7);
        // test.printString("This is the best course");

        // toPrint -> System.out.println(toPrint);
        // (a, b) -> a + b;
        // (a, b) -> {
        // int sum = a + b;
        // System.out.println(sum);
        //}
    }

    // public void printString(String toPrint){
    //     System.out.println(toPrint);
    // }
    // public int sum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        system.out.println("Hello");
    }

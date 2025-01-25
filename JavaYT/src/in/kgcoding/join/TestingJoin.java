package in.kgcoding.join;

import in.kgcoding.runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\n Thread 1 started");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\n Thread 2 started");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        t2.join();
        System.out.println("\n Thread 3 started");

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d",
                Thread.currentThread().getName(),
                (endTime - startTime));
    }
}

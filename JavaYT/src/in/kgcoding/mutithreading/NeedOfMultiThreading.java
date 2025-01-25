package in.kgcoding.mutithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {

        // First Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n  task complete");

        // Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n  task complete");

        // Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n  task complete");
    }



}

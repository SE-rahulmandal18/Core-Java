package in.kgcoding.collection;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // CopyOnWriteArraySet is a thread-safe variant of ArrayList
        // It is used when we have to perform read operations more than write operations
        // It creates a new copy of the array on every write operation
        // It is not synchronized, but it is thread-safe
        // It is used in concurrent programming

        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 0; i < 5; i++) {
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("CopyOnWriteArraySet: " + copyOnWriteArraySet);
        System.out.println("ConcurrentSkipListSet: " + concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteArraySet) {
            System.out.println("Reading from CopyOnWriteSet: " + num);
            // Attempting to modify the set while iterating
            copyOnWriteArraySet.add(6);
        }
    }

}

package in.kgcoding.collection;

import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector =  new Vector<>(5, 3);
        vector.add(43);
        vector.add(13);
        vector.add(33);
        vector.add(53);
        vector.add(73);
        System.out.println(vector.capacity());
        vector.add(34);
        System.out.println(vector.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(32);
        linkedList.add(33);
        linkedList.add(34);
        Vector<Integer> vector1 = new Vector<>(linkedList);
        System.out.println(vector1);

        System.out.println(vector1.isEmpty());



        Vector<Integer> list = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of list: " + list.size()); // Output: 2000





    }
}

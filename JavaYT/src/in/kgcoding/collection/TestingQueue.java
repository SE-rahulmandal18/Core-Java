package in.kgcoding.collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.offer(3);

        for (Integer i: queue) {
            System.out.println(i);
        }

//        System.out.println(queue.peek());
//
//        System.out.println(queue.poll());

    }
}

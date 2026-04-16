package in.kgcoding.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue is a collection that follows the First In First Out (FIFO) principle
        // It is part of the Java Collections Framework
        // The Queue interface is a subinterface of Collection
        // The Queue interface is implemented by several classes, including LinkedList, PriorityQueue, and ArrayDeque

        // LinkedList: It is an implementation of the Queue interface that uses a linked list to store elements
        // It allows null values and does not allow duplicate elements

        // PriorityQueue: It is an implementation of the Queue interface that uses a priority heap to store elements
        // It does not allow null values and does not allow duplicate elements
        // It does not guarantee the order of elements

        // ArrayDeque: It is an implementation of the Queue interface that uses a dynamic array to store elements
        // It allows null values and does not allow duplicate elements


        // LinkedList can be used as a Queue
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);  // enqueue
        list.addLast(3);  // enqueue
        list.addLast(2);  // enqueue
        System.out.println("Queue: " + list);
        Integer i = list.removeFirst();  // dequeue
        System.out.println(list);
        list.getFirst();  // peek



        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove(1)); // throws exception if empty
        System.out.println(queue1.poll()); // returns null if empty

//        System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek()); // returns null if empty

        Queue<Integer> queue2 =  new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true

//         System.out.println(queue2.add(3)); // throws exception
        System.out.println(queue2.offer(3)); // false

       // part of the queue interface
      // order elements based on their natural ordering(for premitive lowest first, and string alphabetically)
     // custom compartor for custom ordering 
    // does not allow null elements  
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());


       // Dequeue - Double ended queue 
       // allow insertion and removal of elements from both sides
      // versatile than regular stack and queue because they support all the operation for both 

      \* INSERTION 

          addFirst(E e) : Inserts the specified elements at the front.
           addLast(E e) : Inserts the specified elements at the end.
           offerFirst(E e) : Inserts the specified elements at the front if possible.
          offerLast(E e) : Inserts the specified elements at the end if possible.
        */  

            \* INSERTION 

          removeFirst() : Retrives and remove the first element.
           removeLast(E e) :  Retrives and remove the last element..
           pollFirst(E e) : Retrives and remove the first element, or return null if empty .
         pollLast(E e) : Retrives and remove the last element, or return null if empty ..
        */  


         // Iterator
          List<Integer> list = new ArrayList<>();
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());



          List<Integer> list = new ArrayList<>();
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()){
                Integr list = iterator.next();
                if(list % 2 == 0){
                 iterator.remove();
                }
                   System.out.println(list);
    }
}

            /*
            java.util.Collection<E> (interface)
            └── java.util.Queue<E> (interface)
                ├── java.util.Deque<E> (interface) // Double-ended queue
                │   ├── ArrayDeque<E> (class)
                │   └── LinkedList<E> (class)
                │
                ├── java.util.concurrent.BlockingQueue<E> (interface)
                │   ├── ArrayBlockingQueue<E> (class)
                │   ├── LinkedBlockingQueue<E> (class)
                │   ├── PriorityBlockingQueue<E> (class)
                │   ├── DelayQueue<E> (class)
                │   └── SynchronousQueue<E> (class)
                │
                ├── java.util.concurrent.TransferQueue<E> (interface)
                │   └── LinkedTransferQueue<E> (class)
                │
                ├── PriorityQueue<E> (class)
                └── LinkedList<E> (class)

 */

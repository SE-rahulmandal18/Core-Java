package in.kgcoding.collection;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
       LinkedList<Integer> linkedList = new LinkedList<>();
       linkedList.add(1);
       linkedList.add(2);
       linkedList.add(3);
       linkedList.add(4);

        System.out.println(linkedList.get(2)); // O(n)
        linkedList.addLast(5); // O(1)
        linkedList.addFirst(0); // O(1)
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);

        linkedList.removeIf(x-> x % 2 == 0);
        System.out.println(linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant", "Lion  "));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);



//
//        Node node1 = new Node();
//        Node node2 = new Node();
//        node2.value=2;
//        node1.value=1;
//        node1.next=node2;
//        node2.next=null;


    }
}

//
//class Node{
//    public int value;
//    public Node next;
//}
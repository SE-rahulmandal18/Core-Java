package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();   // LIFO

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.empty());
        System.out.println(stack.size());

        System.out.println(stack.search(3));  // search is index based, starting with 1st index

        // linked list as stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.size());


        // array list as stack
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        System.out.println(arrayList.get(arrayList.size()-1)); // peek
        System.out.println(arrayList.remove(arrayList.size()-1)); // pop
        System.out.println(arrayList);
    }
}

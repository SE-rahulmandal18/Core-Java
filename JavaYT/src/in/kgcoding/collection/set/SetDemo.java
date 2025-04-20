package in.kgcoding.collection.set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetDemo {
    public static void main(String[] args) {
       // Set is a collection that does not allow duplicate elements
        // and does not guarantee the order of elements.
        // It is part of the Java Collections Framework.
        // The Set interface is a subinterface of Collection.
        // The Set interface is implemented by several classes, including HashSet, LinkedHashSet, and TreeSet.

//        Set<Integer> set = new HashSet<>(); // if you want to maintain order insertion use LinkedHashSet,TreeSet instead HashSet
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        set.clear();
        System.out.println(set.isEmpty());
        for(int i : set) {
            System.out.println(i);
        }

        // for thread safety
//         Set<Integer> set1 = Collections.synchronizedSet(set);

        // for thread safety use ConcurrentSkipListSet // re
        Set<Integer> set1 = new ConcurrentSkipListSet<>();
        
        // unmodifiable set
        Set<Integer> integers = Set.of(1,2,3,4,5,6,7,8,9,10,11);
        Collections.unmodifiableSet(integers);


        // HashSet: It is an implementation of the Set interface that uses a hash table to store elements.
        // It does not guarantee the order of elements.
        // It allows null values and does not allow duplicate elements.

        // LinkedHashSet: It is an implementation of the Set interface that uses a hash table and a linked list to store elements.
        // It maintains the insertion order of elements.
        // It allows null values and does not allow duplicate elements.

        // TreeSet: It is an implementation of the Set interface that uses a red-black tree to store elements.
        // It maintains the natural ordering of elements or the ordering specified by a comparator.
        // It does not allow null values and does not allow duplicate elements.

        // EnumSet: It is a specialized Set implementation for use with enum types.


    }
}

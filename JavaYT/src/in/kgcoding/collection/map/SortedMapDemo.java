package in.kgcoding.collection.map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // comparator -> (a,b) -> b-a to sort in descending order
        SortedMap<Integer,String> map = new TreeMap<>((a,b) -> b-a);
        map.put(91, "Rahul");
        map.put(95, "Vivek");
        map.put(99, "Shubham");
        map.put(78, "Mohit");
        map.put(77, "Vipul");
        System.out.println(map);

//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(99)); // exclude
//        System.out.println(map.tailMap(99));
//        System.out.println(map.tailMap(91));

        NavigableMap<Integer, String> navigableMap =  new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());


    }
}

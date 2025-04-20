package in.kgcoding.collection.map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

// SortedMap is a subinterface of Map.
// It is used to store key-value pairs in sorted order.



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

        System.out.println("First key " + map.firstKey());
        System.out.println("Last key " + map.lastKey());
        System.out.println("Head map " + map.headMap(91)); // exclude
        System.out.println("Tail map " +map.tailMap(99));
        System.out.println("Tail map " + map.tailMap(91));

        // NavigableMap is a subinterface of SortedMap
        // It provides methods to navigate through the map in both directions.


        NavigableMap<Integer, String> navigableMap =  new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());


        /*
           java.util.Map<K, V> (interface)
                │
                ├── SortedMap<K, V> (interface)
                │   └── NavigableMap<K, V> (interface)
                │       └── TreeMap<K, V> (class)
                │
                ├── HashMap<K, V> (class)
                │   ├── LinkedHashMap<K, V> (class)
                │   └── WeakHashMap<K, V> (class)
                │
                ├── IdentityHashMap<K, V> (class)
                │
                ├── Hashtable<K, V> (class)
                │   └── Properties (class)
                │
                └── ConcurrentMap<K, V> (interface) — Java 1.5+
                    ├── ConcurrentHashMap<K, V> (class)
                    └── ConcurrentSkipListMap<K, V> (class — also implements NavigableMap)

                     Class → Class	        ✅  extends
                    Interface → Interface	✅ extends
                    Class → Interface    	✅ implements
         */


    }
}

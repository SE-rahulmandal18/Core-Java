package in.kgcoding.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
// ImmutableMap is a part of the Guava library, which is a set of core libraries for Java.
// It is a specialized Map implementation that is immutable, meaning that once it is created, it cannot be modified.
// It is designed to be used in situations where you need a read-only view of a map.
// It is more efficient than using a regular HashMap when you need to create a map that will not change
// It is not synchronized, so it is not thread-safe.

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("C", 3); throws exception
        Map<String, Integer> map3 = Map.of("Shubham", 98, "Vivek", 89);
        map3.put("Akshit", 88); // throws exception, limitation Map.of is that it can only take 10 entries
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 99), Map.entry("Vivek", 99));

    }
}
package in.kgcoding.collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * IdentityHashMap is a hash table based implementation of the Map interface
 * that uses reference equality (==) instead of object equality (.equals()) for keys.
 * It is useful when you want to use the same object as a key in multiple maps.
 *
 * IdentityHashMap is not synchronized and should not be used in concurrent applications
 * without external synchronization.
 */
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        String key3 = new String("Akshit");
        String key4 = new String("Akshit");
        map.put(key3, 90);
        map.put(key4, 92);
        System.out.println(map);



        // Example to demonstrate the difference between HashMap and IdentityHashMap

        /*

        HashMap uses:

        key.hashCode() to find the bucket index.
        Then uses key.equals(otherKey) to check for key equality in case of hash collisions.

        So for HashMap, these two keys:

         System.out.println(key1.hashCode()); // e.g. 99162322
         System.out.println(key2.hashCode()); // e.g. 99162322
         They produce the same hashCode because:

        key1.equals(key2) → true
        key1.hashCode() == key2.hashCode() → true
        Thus, the second put() replaces the first one in HashMap.

        */



        // Two different String objects with same content
        String key1 = new String("hello");
        String key2 = new String("hello");

        // HashMap uses .equals() to compare keys
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(key1, "Value1");
        hashMap.put(key2, "Value2");

        System.out.println("HashMap size: " + hashMap.size()); // Output: 1
        System.out.println("HashMap: " + hashMap);              // key2 replaces key1


        System.out.println(key1.hashCode()); // e.g. 99162322
        System.out.println(key2.hashCode()); // e.g. 99162322

        /*

        In IdentityHashMap, it does not use .hashCode() at all!
        Instead, it uses System.identityHashCode(key)
        And compares keys using == (reference equality)
        So, even though the string values are the same, the memory references are different, and identityHashCode() reflects that.
        Thus, both keys are treated as different in IdentityHashMap
         */

        // IdentityHashMap uses == (reference equality)
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, "Value1");
        identityMap.put(key2, "Value2");


        System.out.println(System.identityHashCode(key1)); // e.g. 1107754798
        System.out.println(System.identityHashCode(key2)); // e.g. 1598250760

        System.out.println("IdentityHashMap size: " + identityMap.size()); // Output: 2
        System.out.println("IdentityHashMap: " + identityMap);
    }
}
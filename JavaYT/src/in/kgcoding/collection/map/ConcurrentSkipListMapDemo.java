package in.kgcoding.collection.map;


import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    // ConcurrentSkipListMap is a thread-safe implementation of the SortedMap interface.
    // It uses a skip list data structure to store key-value pairs in sorted order.
    // It is similar to TreeMap but is designed for concurrent access.
    // It allows multiple threads to read and write to the map without blocking each other.
    // It is faster than ConcurrentHashMap for read-heavy workloads.
    // It is slower than ConcurrentHashMap for write-heavy workloads.

    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple", 2);

    }
}

package in.kgcoding.collection.map;


import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    // ConcurrentSkipListMap is a thread-safe implementation of the SortedMap interface.
    // It uses a skip list data structure to store key-value pairs in sorted order.
    // It is similar to TreeMap but is designed for concurrent access.
    // It allows multiple threads to read and write to the map without blocking each other.
    // It is faster than ConcurrentHashMap for read-heavy workloads.
    // It is slower than ConcurrentHashMap for write-heavy workloads.
    
    // skilpList is a probabilistic data structure that allows for efficient search, insertion, deletion operations.
    //It is similar to sorted linked list but with multiple layers that "skip" over portion of the list to provide faster
    // access to elements.

    // 1 2 3 4 5 6 7 8 9 -> sorted and multiple layer for fast access
    // and supporse we want to seach for 2 
    // it stats searching with layer3 to layer1 for the element 2

    // layer 3  -> 1       5       9
    // layer 2 ->  1   3   5   7   9
    // layer 1 ->  1 2 3 4 5 6 7 8 9 

    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Apple", 2);

    }
}

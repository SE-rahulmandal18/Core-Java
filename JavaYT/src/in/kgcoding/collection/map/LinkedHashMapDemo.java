package in.kgcoding.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11, 0.75f, true);

//        HashMap<String, Integer> hashMap = new HashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Guava", 13);

        linkedHashMap.get("Apple");
        linkedHashMap.get("Orange");
        linkedHashMap.get("Guava");
        linkedHashMap.get("Apple");  // ACCESS ORDER determines the least recently used order

        for(Map.Entry<String, Integer> entry  : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }

        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap);

        hashMap.put("Rahul", 80);
        hashMap.put("Vipul", 22);
        hashMap.put("Vikash", 32);

        hashMap.putIfAbsent("Bob", 32);
        System.out.println(hashMap);
     }
}

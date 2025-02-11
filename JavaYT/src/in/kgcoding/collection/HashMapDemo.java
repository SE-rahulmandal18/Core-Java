package in.kgcoding.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akshit");   // O(1)
        map.put(2, "Neha");
        map.put(3, "Rahul");
//        map.put(3, "Vikash");

        System.out.println(map);

        System.out.println(map.get(3)); // O(1)
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Rahul"));

        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }

      Set<Map.Entry<Integer, String>> entries  = map.entrySet();
        for(Map.Entry<Integer,String>  entry : entries) {
//            System.out.println(entry.getKey() + ": "+ entry.getValue());
              entry.setValue(entry.getValue().toUpperCase());

        }
        System.out.println(map);

//        map.remove(1);
        System.out.println(map.remove(21, "Rahul"));
    }
}

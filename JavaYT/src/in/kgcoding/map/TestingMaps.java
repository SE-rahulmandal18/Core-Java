package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rahul", 34);
        map.put("Anshu", 45);
        map.put("Pravin", 75);
        map.put("Vikash", 10);

        System.out.println(map.size());
        System.out.println(map.get("Anshu"));
        System.out.println(map.containsKey("Pravin"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Vikash"));

        for (String key : map.keySet()) {
            System.out.printf("%s: %s\n", key, map.get(key));
        }
    }
}

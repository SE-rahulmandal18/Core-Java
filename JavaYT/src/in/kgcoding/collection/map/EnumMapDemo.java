package in.kgcoding.collection.map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    // EnumMap is a specialized Map implementation for use with enum keys.
    // It is more efficient than HashMap when the keys are enums.
    // It is not synchronized, so it is not thread-safe.
    // It allows null values but not null keys.
    // It is a good choice when you need to map enum constants to values.

    public static void main(String[] args) {
        Map<Days, String> map = new EnumMap<>(Days.class);
        map.put(Days.TUESDAY, "Gym");
        map.put(Days.MONDAY, "Walk");
        System.out.println(Days.TUESDAY.ordinal());
        System.out.println(map);
    }

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}

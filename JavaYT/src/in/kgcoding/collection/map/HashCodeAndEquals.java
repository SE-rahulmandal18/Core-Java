package in.kgcoding.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person person1 = new Person("John", 1);
        Person person2 = new Person("Bob", 2);
        Person person3 = new Person("John", 1);

        map.put(person1, "Engineer"); // hashcode1 --> index1
        map.put(person2, "Designer"); // hashcode2 --> index2
        map.put(person3, "Manager"); // hashcode3 --> index3     or hashcode1 --> index1 by overriding equals

        System.out.println("Map size: " + map.size()); // Output: 3
        System.out.println("Person1's role: " + map.get(person1)); // Output: Engineer
        System.out.println("Person3's role: " + map.get(person3)); // Output: Manager

        System.out.println(person1); // toString() method

        // Check if person1 and person3 are considered equal
        System.out.println("Are person1 and person3 equal? " + person1.equals(person3)); // Output: false without overriding equals
        System.out.println("Are person1 and person3 equal? " + person1.equals(person3)); // Output: true overriding equals


        Map<String, Integer> map1 = new HashMap<>();
        System.out.println(map1.put("John", 1));  // hashcode1 --> index1
        map1.put("Bob", 2);   // hashcode2 --> index2
        map1.put("John", 1);  // hashcode1 --> index1  // Replaces the value for the key "John"

        System.out.println("Map1 size: " + map1.size()); // Output: 2
        System.out.println("John's value: " + map1.get("John")); // Output: 1
        System.out.println("Bob's value: " + map1.get("Bob")); // Output: 2

    }
}


class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);

    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
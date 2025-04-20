package in.kgcoding.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(20);
        set.add(12);
        set.add(10);



        System.out.println(set.isEmpty());
        System.out.println(set.contains(10));
        System.out.println(set.remove(10));
        for(Integer i: set){
            System.out.println(i);
        }
    }
}

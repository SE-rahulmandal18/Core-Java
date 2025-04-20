package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClassDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5,1,8,3,2);
//        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.binarySearch(list, 3));
    }
}

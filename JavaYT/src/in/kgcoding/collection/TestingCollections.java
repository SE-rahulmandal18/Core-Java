package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(10);

        numList.add(23);

        numList.add(22);

        numList.add(34);

        numList.add(28);

        System.out.println(numList);

        Collections.sort(numList);
        System.out.println(numList);

        Collections.reverse(numList);
        System.out.println(numList);
    }
}

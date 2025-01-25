package in.kgcoding.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestingList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(1, 13);

        list.remove(3);
//        list.remove();

        System.out.println(list.size());

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }




}

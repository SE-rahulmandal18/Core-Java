package in.kgcoding.collection;

import java.util.*;




/*
    class StringLengthComparator implements Comparator<String>{
        //  o1    o2
        // "ok" "bye"

        @Override
        public int compare(String o1, String o2) {
            return o2.length() - o1.length();
//        return o1.length() - o2.length();
        }
    }



    class MyComparator implements Comparator<Integer>{


        // int -ve atta h to o1 phele ayega o2 s
        // int 0 atta h to o1 & o2 ordering m equal h
        // int +ve atta h to o1 baad m ayega o2 s

        //   o1 o2
        //   5  3
        //   3  5
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
//          return o1 - o2;

        }
    }
*/


    public class TestingList {
        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();

            /*

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        list.sort(null);
        list.sort(new MyComparator());
//        list.sort((a, b) -> b - a);
        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
//        words.sort(null);
        words.sort(new StringLengthComparator());
//        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);








 List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Object[] array = list.toArray(new Integer[0]); // converting list to arrray
//        list.toArray(new Integer[0]);
        System.out.println(array);

        list.remove(Integer.valueOf(1)); // removes the value itself at the index
//    list.remove(1);  // remove the index value
        System.out.println(list);




        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 0);
        System.out.println(list);

        List<Integer> list1 = List.of(4, 5, 6, 7);

        list.addAll(list1);
        System.out.println(list);




        List<Integer> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
//        list1.add("Wednesday");// this will throw an exception , we can't add or remove in asList since it is of fixed size
        list1.set(1, "Wednesday"); // however we can replace element
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());
        System.out.println(list2);

        List<Integer> list3 = List.of(1, 2, 3, 4);
//        list3.set(1, 33);  // this will throw an exception, as List.of is immutable
//        System.out.println(list3.get(1));

        // modifying list2
        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);




        list.add(1); // 0 index
        list.add(5); // 1 index
        list.add(80); // 2 index

//        list.add(2, 50);
        list.set(2, 50);

//        list.remove(2);

//        System.out.println(list.get(2));
//        System.out.println(list.size());


        for (Integer i : list) {
            System.out.println(i);
        }


//        System.out.println(list.contains(5));
//        System.out.println(list.contains(50));


//       For LOOP
//        for(int i=0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        System.out.println(list);



       */







      /*  List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(1, 13);

         list.remove(3);
//        list.remove();

        System.out.println(list.size());

//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

        for(Integer str : list){
            System.out.println(str);
        }*/


        }

    }
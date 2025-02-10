package in.kgcoding.filterandreduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","mango","date","cherry");
        System.out.println(fruits.size());

        System.out.println("Printing fruit normally");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing fruit using stream");

//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });

// alternate of above using lambda func
        fruits.stream().forEach(fruit -> System.out.println(fruit));

        //alternate of above using method reference
//        fruits.stream().forEach(System.out::println);

        System.out.println("Printing fruit using filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(System.out::println);
    }
}

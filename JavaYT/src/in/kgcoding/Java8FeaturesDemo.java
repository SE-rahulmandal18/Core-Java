package in.kgcoding;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8FeaturesDemo {
    public static void main(String[] args) {

        // Predicate --> Functional interface ( Boolean valued function )
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("");
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(and.test("Ankit"));


        // Function
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(20)); // same
        System.out.println(doubleIt.compose(tripleIt).apply(20)); // same
        System.out.println(doubleIt.apply(100));

        Function<Integer, Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);


        // Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(51);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);


        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;  // ek condition hold krta hai
        Function<Integer, Integer> function = x -> x * x;  // function kuch kaam krna hai,Integer lega or Integer return krega
        Consumer<Integer> consumer = x -> System.out.println(x);  // x lega or print kra dega
        Supplier<Integer> supplier = () -> 100; //

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // BiFunction, BiConsumer, BiPredicate
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 5));

        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("Hello", "World"));


        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;

        // Method Reference --> use method invoking & in place of Lambda expression
        List<String> students = Arrays.asList("Ankit", "Amit", "Ajay", "Aman");
//        students.forEach(x -> System.out.println(x)); // lambda expression
        students.forEach(System.out::println); // method reference

        // constructor reference
        List<String> names = Arrays.asList("Nokia", "Samsung", "Iphone");
//        List<MobilePhone> mobilePhoneList = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).toList();

    }

}

class MobilePhone{
        String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
package in.kgcoding;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8FeaturesDemo {
    public static void main(String[] args) {

        // Stream Demo
        // with the help of stream we can process collection of data in a functional and declarative manner

          
	    List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	    System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // Creating Streams
        // 1. From collection
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
	    Stream<Integer> stream = numbers.stream();

        // 2. From Arrays
        String[] array = {"a", "b", "c"}
         Stream<String> stream  = Arrays.stream(array);
        //3. Using Stream.of()                                                                    
       Stream<String> stream = Stream.of("a", "b");
	    

        // Intermediate operation
        List<String> list = new Arrays.asList("Akshit", "Ram", "Shayam", "Anshu");
       Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));  // no filtering at this point
       
       long res =  list.stream().filter(x -> x.startsWith("A")).count();
        System.out.print(res);

       // map
       Stream<String> stringSteam = list.stream().map(x -> x.toUpperCase());

       // sorted
       Stream<String> sortedStream = list.stream().sorted();  // natural ordering
     Stream<String> sortedStreamComparator = list.stream().sorted((a ,b) -> a.length() - b.length());

     // distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());



        // Terminal operation
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.stream().collect(Collectors.toList());
        list.stream().toList();

        // forEach
        list.steam().forEach(x - > System.out.println(x));

        // reduce -> combines element to produce single result
       Optional<Stream> optionalInteger =  list.stream.().reduce((x, y) -> (x + y));
        System.out.println(optionalInteger.get());

        // anyMatch ,  allMatch, noneMathch - thy are sortcuit operation meaning as soon as thy find a macth thy stop processing further
       boolean b = list.stream().anyMatch(x -> x%2 == 0);
        System.out.print(b); // true

          boolean b = list.stream().allMatch(x -> x > 0);
        System.out.print(b); // true

          boolean b = list.stream().noneMatch(x -> x < 0);
        System.out.print(b); // true

        // findFirst, findAny - thy are sortcuit operation meaning as soon as thy find a macth thy stop processing further
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        













        

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

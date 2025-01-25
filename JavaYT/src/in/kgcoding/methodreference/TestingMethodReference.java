package in.kgcoding.methodreference;

import java.util.List;

public class TestingMethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,3,2,6,5);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);
    }
    }




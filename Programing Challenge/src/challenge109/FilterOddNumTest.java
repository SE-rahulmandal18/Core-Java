package challenge109;

import java.util.Arrays;
import java.util.List;

public class FilterOddNumTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 8, 10, 5, 9, 12, 65);
        numbers.stream()
                .filter(num -> num % 2 != 0)
//                .forEach(num -> System.out.println(num));
                .forEach(System.out::println);
    }
}

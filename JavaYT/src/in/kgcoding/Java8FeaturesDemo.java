package in.kgcoding;

import java.util.Arrays;
import java.util.List;

public class Java8FeaturesDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,10,60,20);

        numbers.forEach(num -> System.out.println(num));

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}

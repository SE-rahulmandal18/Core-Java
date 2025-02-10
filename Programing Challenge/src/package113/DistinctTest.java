package package113;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22, 31, 45, 32, 31, 45, 53);

       List<Integer> distinctNumber = numbers.stream()
                  .distinct()
                  .collect(Collectors.toList());
        System.out.println(distinctNumber);

    }
}

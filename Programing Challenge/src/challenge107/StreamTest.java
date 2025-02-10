package challenge107;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Vikash", "Rohit", "Vivek", "Prashant");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}

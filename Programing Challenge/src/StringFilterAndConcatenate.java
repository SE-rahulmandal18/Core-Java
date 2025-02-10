import java.util.Arrays;
import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Rahul Mandal", "is studing java", "good", "on KG Coding", "excellent","best youtube programming challenge");

    String  result = strs.stream()
                .filter(str -> str.length() >= 10)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}

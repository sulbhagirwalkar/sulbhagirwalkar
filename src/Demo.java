import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.Math;

public class Demo {
    public static void main(String[] args) {
       String str = "Hello Java and Java is Popular and powerful";

        List<String> uniqueSortedWordsResult = Arrays.stream(str.split(" "))
                                                                .map(String::toLowerCase)
                                                                .distinct()
                                                                .sorted()
                                                                .collect(Collectors.toList());
        System.out.println(uniqueSortedWordsResult);

       /* int a = 6, b = 5, c = 9;
        int result = Math.max(a, b);
        System.out.println(result);
*/
    }
}

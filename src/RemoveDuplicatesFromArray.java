import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
    String[] input ={"apple", "banana", "pineapple", "peach", "apple"};

    String[] unique = Arrays.stream(input).distinct().toArray(String[]::new);
        System.out.println("Unique elements in the arrays are:" + Arrays.toString(unique));
    }
}

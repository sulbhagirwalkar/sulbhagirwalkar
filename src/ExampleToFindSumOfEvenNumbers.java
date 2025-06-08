import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleToFindSumOfEvenNumbers {

    public static int findSum(List<Integer> numbers){
        return numbers.stream()
                      .filter((a) -> a % 2 == 0)
                      .mapToInt(Integer::intValue)
                      .sum();    }

    public static void main(String[] args) {
        ExampleToFindSumOfEvenNumbers e = new ExampleToFindSumOfEvenNumbers();
        List<Integer> demo =Arrays.asList(2,3,4,5,6,7,8,9);
        System.out.println(demo);
        int result = findSum(demo);
        System.out.println(result);

    }
}

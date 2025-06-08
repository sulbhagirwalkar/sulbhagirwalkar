import java.util.Arrays;
import java.util.List;

public class FindSumOfAllElements {

    public static void main(String[] args) {
        int[] inputArray = {2, 3, 4, 5, 6, 8};

        int sum = Arrays.stream(inputArray).sum();
        System.out.println(sum);
        /*for(int i : inputArray){
            sum += i;
        }
        System.out.println(sum);
    */
    }
}

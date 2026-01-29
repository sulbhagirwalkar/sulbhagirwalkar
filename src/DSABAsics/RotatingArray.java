package DSABAsics;

import java.util.Arrays;
import java.util.Optional;

public class RotatingArray {
    public static Optional<Integer> secondLargestNumber(int[] numbers) {
        int[] input = {1, 4, 6, 8, 3, 11, 9};
        return  Arrays.stream(numbers).distinct().boxed().sorted((a, b) -> b - a).skip(1).findFirst();
        }

    /** rotating array is reversing entire array first, then reverse first k elements then reverser remaining elements */
    public static void main(String[] args) {

        int[] intN = {1, 4, 6, 8, 3, 11, 9};
        System.out.println(secondLargestNumber(intN));
    }
}



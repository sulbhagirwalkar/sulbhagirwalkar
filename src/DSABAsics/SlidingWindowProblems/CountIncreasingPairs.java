package DSABAsics.SlidingWindowProblems;

import java.util.ArrayList;
import java.util.List;

public class CountIncreasingPairs {
    public static int countIncreasingPairs(List<Integer>arr){
        int n = arr.size();
        int count = 0;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                if(arr.get(i) < arr.get(j)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
         List<Integer> arr1 = new ArrayList<>(3);
         arr1.add(1);
         arr1.add(2);
         arr1.add(1);
        System.out.println(countIncreasingPairs(arr1));
    }
}

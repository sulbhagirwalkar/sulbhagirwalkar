import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
   static List<Integer> removeDuplicates(int[] nums){
        /*int k = 0;
        for(int i = 0; i < nums.length-1; i++ ){
            if(nums[i] != nums[i+1]){
                nums[k] =  nums[i];
                k++;
            }
        }*/
       List<Integer> numbers = Arrays.asList(1,2,2,5,6,1);
       return numbers.stream()
                .distinct()
                .toList();
    }
    public static void main(String[] args) {
        int[] numbs = {1,2,2,5,6,1};
        System.out.println(removeDuplicates(numbs));
    }
}

import java.util.Arrays;

public class FindKithLargestElement {
    public  static String kthLargestNumber(String[] nums, int k) {
      Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        String [] num ={"1","5","2","7","9"};
        System.out.println(kthLargestNumber(num, 2));
    }

}

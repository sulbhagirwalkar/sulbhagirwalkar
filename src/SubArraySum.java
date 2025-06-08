import java.util.HashMap;

public class SubArraySum {
    public static int getSubArray(int[] nums, int k){
        HashMap<Integer, Integer> numsArray = new HashMap<>();
        int sum = 0;
        int count = 0;
        numsArray.put(0, 1);

        for(int i = 0; i < nums.length; i++){
          sum +=nums[i];

          if(numsArray.containsKey(sum-k)){
              count++;
          }
          numsArray.put(sum, numsArray.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] demo = {1, 1, 1};
        int k =2;
        int result = getSubArray(demo,k);
        System.out.println(result);
    }
}

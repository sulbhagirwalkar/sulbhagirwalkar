import java.util.HashMap;

public class FindTheTargetDiffernece {

    public static int findTarget(int[] input, int target) {
        int count = 0;
        int targetDifference =0;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                targetDifference  -= input[i]-input[j];
               // int targetSum = target + i;
                if (hashMap.containsKey(targetDifference)) {
                    count++;
            }
                hashMap.put(input[i], Boolean.TRUE);                }

        }
        return count;
    }
        public static void main (String[]args){
            int[] nums = {1, 5, 3, 4, 2};
            int target = 3;
            int result = findTarget(nums, target);
            System.out.println(result);
        }
    }


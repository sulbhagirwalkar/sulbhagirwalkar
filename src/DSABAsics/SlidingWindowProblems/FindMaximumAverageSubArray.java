package DSABAsics.SlidingWindowProblems;

public class FindMaximumAverageSubArray {
    public static double findMaxAverageSubArray(int[] nums, int k){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        //iterate through all possible sub arrays of length k
        for(int i = 0; i <= n - k; i++){
            int sum = 0;
            //calculate the sum of sub array starting from index i
            for(int j = i; j <= i + k; j++){
                sum += nums[j];
            }
            //update maxSum
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }
    public static void main(String[] args) {

    }
}

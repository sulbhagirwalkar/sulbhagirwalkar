import java.util.HashMap;
import java.util.List;

public class MaximumValueOfSubArray {
    /**example is The subarrays of array a=[3, 3, 9, 9, 5] and their respective sums modulo m= 7 are ranked in order of length
     * and sum in the following list:

     dividend=3     Divisor=7  Reminder=3 Quotient =0
     [3] -> 3 % 7 = 3

     The maximum value for any subarray is .
     *reminder = dividend-(divisor * Quotient)
     * */
    public static int maxValueOfSubArrayModulo(List<Long> a, int m){

        long result = 0;
        long sum = 0;
        HashMap<Long, Integer> subArray = new HashMap<>();
        subArray.put(sum, 0);
        for(int i=0; i< a.size(); i++){

        }



        return 0;
    }

    public static void main(String[] args) {

    }
}

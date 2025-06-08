import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfDivisibleTripletSum {

    /**Implement a function in java that identifies how many distinct triplet(i,j,k) exists where i<j<k and sum of
     * transaction[i]+transaction[j]+transactions[k] is divisible by divisor, divisor is given int number
     * function will return int
     * Input: transaction = [3, 3, 4, 7, 8]
     * divisor = 5
     * Output: 3
     * */

    public static int divisibleTripletCount(List<Integer> transactions, int divisor){

        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        int length = transactions.size();
        for(int i=0; i < length; ++i){
            for(int j= i + 1; j < length; ++j){
                int x = (divisor - transactions.get(i) + transactions.get(j) % divisor) % divisor;
                result  += count.getOrDefault(x, 0);
                }
            count.merge(transactions.get(i) % divisor, 1, Integer::sum);
        }
        return result;
    }
/**
 * The code uses a nested loop to iterate through the array, where the outer loop represents the index j(or k), and inner loop represents the index i.
 * For each pai of indices(i,j), it calculates the required reminder to make the sum divisible by d and checks how many times that reminder has been
 * seen so far using a Hashmap. This way, it efficiently counts the valid triplets without needing to check every possible combination
 * */
    public static void main(String[] args) {
        List<Integer> transactions = new ArrayList<>();
        transactions.add(3);
        transactions.add(3);
        transactions.add(4);
        transactions.add(7);
        transactions.add(8);
        System.out.println(transactions);
        int resultt= divisibleTripletCount(transactions, 5);
        System.out.println(resultt);
    }

}

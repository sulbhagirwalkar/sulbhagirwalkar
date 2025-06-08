import java.util.Arrays;

public class IBMassesmentQ1 {

        /**
         * Given an array of integers transactions, and an integer divisor,
         * find the number of distinct triplets (i, j, k) such that i < j < k and
         * transactions[i] + transactions[j] + transactions[k] is divisible by divisor.
         *
         * @param transactions The input array of integers.
         * @param divisor      The divisor to check divisibility against.
         * @return The number of distinct triplets whose sum is divisible by the divisor.
         */
        public int countDivisibleTriplets(int[] transactions, int divisor) {
            int n = transactions.length;
            int count = 0;
            Arrays.sort(transactions); // Sort the array to easily skip duplicates

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if ((transactions[i] + transactions[j] + transactions[k]) % divisor == 0) {
                            count++;
                        }
                    }
                }
            }

            return count;
        }
    }


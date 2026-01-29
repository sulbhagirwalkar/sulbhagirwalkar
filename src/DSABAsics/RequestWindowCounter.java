package DSABAsics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RequestWindowCounter {
    public static int maxRequestsInWindow(List<Integer> timestamp, int windowSize){
        int maxCount = 1;
        if(timestamp == null || timestamp.isEmpty()) return 0;

        Collections.sort(timestamp);
        int start = 0;
       //timestamp =  {1, 2, 3, 4, 5, 6, 10, 11, 12};
        //window = 4
        for( int end = 0; end < timestamp.size(); end++){
            while (timestamp.get(end) - timestamp.get(start) >= windowSize){
                start++;
            }
            maxCount = Math.max(maxCount, end - start + 1);
        }

        return maxCount;
    }
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 10, 11, 12);
        int windowSize = 5;
        System.out.println(maxRequestsInWindow(input, windowSize));

    }
}

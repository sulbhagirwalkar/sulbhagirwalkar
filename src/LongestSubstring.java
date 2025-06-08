import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {
    public static int Solution(String s){
        int leftPointer = 0;
        int rightPointer = 0;
        int maxCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(true){
            //acquire
            boolean f1 = false;
            boolean f2 = false;
            f1 = true;
            while(rightPointer < s.length()){
                rightPointer++;
                char ch = s.charAt(rightPointer);
                map.put(ch, map.getOrDefault(ch, 0)+1);
                if(map.get(ch) == 2){
                    break;
                }else{
                   int len = leftPointer - rightPointer;
                   if(len > maxCount){
                      maxCount = len;
                   }
                }
             }
            //release
            while(rightPointer < leftPointer){
                f2 = true;
                rightPointer++;
                char ch = s.charAt(rightPointer);
                map.put(ch, map.get(ch)-1);

                if(map.get(ch) == 1){
                    break;
                }
            }
            if(f1 == false && f2 == false){
                break;
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       String str = "abcabbcda";
        System.out.println(Solution(str));
    }
}

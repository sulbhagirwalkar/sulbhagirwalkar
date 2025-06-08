import java.lang.Math;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s){
    HashSet<Character> hashSet = new HashSet<>();
    int leftPointer =0;
    int rightPointer = 0;
    int mx = 0;
    while(rightPointer < s.length()){
      if(!hashSet.contains(s.charAt(rightPointer))){
        hashSet.add(s.charAt(rightPointer));
          rightPointer++;
          mx =  Math.max(hashSet.size(), mx);
      }else{
          hashSet.remove(s.charAt(leftPointer));
          leftPointer++;
      }
    }
        return mx;
    }
    public static void main(String[] args) {
        String str = "abcbacbbac";
        int result = lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}

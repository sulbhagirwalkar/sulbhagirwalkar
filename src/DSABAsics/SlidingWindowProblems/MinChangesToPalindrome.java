package DSABAsics.SlidingWindowProblems;

public class MinChangesToPalindrome {
    public static int minChangesToPalindrome(String str){
        int changesCharCount = 0;
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                changesCharCount++;
            }
            left++;
            right--;
        }

    return changesCharCount;
    }
    }

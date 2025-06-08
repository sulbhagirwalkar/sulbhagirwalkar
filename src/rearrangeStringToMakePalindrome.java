public class rearrangeStringToMakePalindrome {

    /***
     * given a string with lowercase characters in java require to develop a function that will interpolate
     * the string by replacing ? with lowercase english letter such that it can be arranged to form palindrome
     * */

    public static String interpolatePalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] == '?' && chars[right] == '?') {
                chars[left] = 'a';
                chars[right] = 'a';
            } else if (chars[left] == '?') {
                chars[left] = chars[right];
            } else if (chars[right] == '?') {
                chars[right] = chars[left];
            } else if (chars[left] != chars[right]) {
                return null;
            }
            left++;
            right--;
        }

        if (chars.length % 2 != 0 && chars[chars.length / 2] == '?') {
            chars[chars.length / 2] = 'a';
        }
        return new String(chars);

    }
    public static void main(String[] args) {
     String str ="abd?dba";
     String result = interpolatePalindrome(str);
        System.out.println(result);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ReverseString {

//    public static String reverseString(String input){
//       if(input == null){
//             return null;
//        }
//        return new StringBuilder(input).reverse().toString();
//    }
//    public static boolean isPalindrome(String inputString1){
//        return inputString1.toLowerCase().matches(reverseString(inputString1));
//    }



    public static void main(String[] args) {

        String input = "racecar";
        String result = new  StringBuilder(input).reverse().toString();
        if(result.equals(input)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

      /*  BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        System.out.println("Enter the string");
        String inputString;
        try {
            inputString = bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(reverseString(inputString));
        System.out.println(isPalindrome(inputString));
*/
    }

}

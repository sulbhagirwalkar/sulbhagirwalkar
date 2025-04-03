import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ReverseString {
    public static String reverseString(String input){
     if(input == null){
         return null;
     }
     return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        System.out.println("Enter the string");
        String inputString ;
        try {
            inputString = bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(reverseString(inputString));

    }
}

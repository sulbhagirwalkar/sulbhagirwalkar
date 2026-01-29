import java.util.Arrays;
import java.util.Scanner;
enum Day{
    MONDAY, TUESDAY, WEDENSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class FindMissingNumber {

    Day today = Day.MONDAY;

    public static String reverserString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        sc.next();
        String input = "123";
        int result = Integer.parseInt(input);
        System.out.println(result);

        for(int i = 0; i < a.length; i++ ){
            if(a[i] == 2){
                continue;
            }
            if(a[i] == 5){
                break;
            }
            System.out.println(a[i]);
        }

        //int b = 20;
       // System.out.println("a: "+a);
       // System.out.println("number is not prime");
        //System.out.println("b: "+ b);
        return;

        // a = a + b;
       // System.out.println("a: "+ a);
        //b = a - b;
        //System.out.println("b: "+ b);
        //a = a - b;
        //System.out.println("a: "+ a);
        //find if the given number is prime or not
        /*String str1="aabbcca";
        System.out.println(reverserString(str1));
        StringBuilder input = new StringBuilder(str1).reverse();
        System.out.println(input);
*/
        /*int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int m =numbers.length + 1;
        int sumOfNumbersExpected= m *(m+1)/2;
        int actualSum= Arrays.stream(numbers).sum();
        System.out.println(sumOfNumbersExpected);
        System.out.println(actualSum);
       int missingNumber = sumOfNumbersExpected - actualSum;
        System.out.println(missingNumber);
*/
     /*   String str ="Sulbha is a software engineer";
        StringBuilder str1 = new StringBuilder(str).reverse();
        System.out.println(str1);
*/


    }
}


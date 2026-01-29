package DSABAsics;
import java.util.LinkedList;

public class Sample {
    public static boolean isNumberPresent(LinkedList <Integer> numList, int targetNumber){
        return numList.contains(targetNumber);
    }

    public static boolean isPalindrome(String str) {
        String input = "ffsa";
        String result = new StringBuilder(input).reverse().toString();
       if (input .equals(result)){
                return true;
       }else{
            return false;
        }
    }

    public static void main(String[] args) {
      int number = 6;
      String input = "abbca";
      LinkedList<Integer> inputList = new LinkedList<>();
      inputList.add(0, 2);
      inputList.add(1, 3);
      inputList.add(2, 4);
      inputList.add(3, 5);
        System.out.println(isNumberPresent(inputList, number));
        System.out.println(isPalindrome(input));

    }
}


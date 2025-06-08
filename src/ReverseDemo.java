import java.util.Scanner;

class ReverseDemo {
public static void main(String[] args) {
    int number;
    int lastDigit ;
    System.out.println("Enter number: ");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();
    int reverseNumber = 0;
   while(number != 0) {
       lastDigit = number % 10;
       number = number / 10;
       reverseNumber = (reverseNumber * 10) + lastDigit;
   }
    System.out.println(reverseNumber);
    }
}


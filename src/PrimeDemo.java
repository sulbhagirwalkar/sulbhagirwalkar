import java.util.Scanner;

public class PrimeDemo {
/*static int number =7;
    static boolean isPrime(int n) {
        if (number == 1) {
            return true;
        }
        for (int i = 2; i <= number/2 +1; i++) {
            if(number%i==0){
                return true;
            }
           // System.out.println(i);
        }
        return false;
    }*/


    public static void main(String[] args) {
         int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        for(int i=1; i<= number; i++){
            if (number%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }

       // boolean result = isPrime(7);
        //System.out.println(result);


    }
}


interface performOperation{
    int check(int a);
}

class Math{
    public static int checker(performOperation p, int num){

         return p.check(num);
    }
    performOperation checkOdd(){
        performOperation p = (a) ->{return a%2;
        };
        return p;
    }
    performOperation checkPrime(){
        performOperation p = (a) ->{
            if (a == 1)return 1;
            for(int i=2; i<2+1; i++) {
                if ((a % i) == 0) return 1;
            }
            return 0;

        };
        return p;
    }
}
public class LambdaExpression {
    public static void main(String[] args) {

    }
}

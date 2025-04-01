import java.util.Scanner;

public class StaticInitializationDemo {
    static int B, H;
    static boolean flag;
    static {
        Scanner sc =new Scanner(System.in);
        B = sc.nextInt();
        sc.nextLine();
        H = sc.nextInt();
        sc.close();

        if((B<=0 && H >=0)||(B>=0 && H<=0)){
            flag =false;
            System.out.println("java.lnag.Exception: Beredth and height should be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}



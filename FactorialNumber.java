//1*2*3*4*5
//5*4*3*2*1
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

//        int fact = 1;
//        for (int i = 1; i <= n  ; i++) {
//            fact = fact * i;
//        }
//        System.out.println(fact);

        int x = factorial(n);
        System.out.println(x);
    }
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n * factorial(n-1);

    }
}

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        sum(n);
    }
    public static void sum(int n){
        int s = 0;
        while(n>0){
            int d = n%10;
            s = s + d;
            n = n/10;
        }
        System.out.println("sum is "+s);
    }
}

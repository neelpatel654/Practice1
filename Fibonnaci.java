import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();

        fibonacci(n);
    }
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        if(n==1){
            System.out.println(a);
        } else if (n==2) {
            System.out.println(a+" "+b);
        }
        else {
            System.out.print(a+" "+b);
            for (int i = 2; i <n ; i++) {
                sum = a + b;
                System.out.print(" "+sum);
                a = b;
                b = sum;
            }
        }
    }
}

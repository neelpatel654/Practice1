import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n>1){
            for (int i = 1; i <= n ; i++) {
                if(n%i==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(n + " is prime");
            }
            else {
                System.out.println(n + " is not prime");
            }
        }
        else{
            System.out.println(n + " is not prime");
        }
    }
}

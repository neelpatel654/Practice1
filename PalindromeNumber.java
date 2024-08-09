import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        if(ispalindrome(n)){
            System.out.println( n + " is palindrome");
        }
        else {
            System.out.println( n + " is not palindrome");
        }
    }

    private static boolean ispalindrome(int n) {
        int rev = 0;
        int temp = n;
        while(n>0){
            int d = n%10;
            rev = rev * 10 + d;
            n = n/10;
        }
        System.out.println(rev);
        if(rev==temp){
            return true;
        }
        else {
            return false;
        }
    }

}

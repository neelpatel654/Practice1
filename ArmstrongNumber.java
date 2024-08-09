import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");

        int n = sc.nextInt();
        int temp = n;
        int temp2 = n;
        int len = 0;
        while(temp>0){
            temp = temp/10;
            len++;
        }
//        System.out.println(len);
        int sum = 0;
        while(temp2>0){
            int d = temp2%10;
            sum = (int) (sum + Math.pow(d,len));
            temp2 = temp2/10;
        }
        if(sum==n){
            System.out.println("armstrong");
        }
        else {
            System.out.println("not");
        }
    }
}

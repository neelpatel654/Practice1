import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("enter "+ n +" array elemnts: ");
        int[] arr = new int[n];
        for (int i = 0; i <= n-1 ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum is : "+sum);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        System.out.println("enter " + n + " array elemnts: ");
        int[] arr = new int[n];
        int[] even = new int[n];
        int[] odd = new int[n];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[count1] = arr[i];
                count1++;
            } else {
                odd[count2] = arr[i];
                count2++;
            }
        }
//        System.out.println("even numbers are: "+ Arrays.toString(even));
//        System.out.println("odd numbers are: "+ Arrays.toString(odd));
        System.out.println("even numbers are : ");
        for (int i = 0; i < count1; i++) {
            System.out.println(even[i]);
        }
        System.out.println("odd numbers are : ");
        for (int i = 0; i < count2; i++) {
            System.out.println(odd[i]);

        }
    }
}


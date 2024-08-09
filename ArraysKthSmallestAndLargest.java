import java.util.Arrays;
import java.util.Scanner;

public class ArraysKthSmallestAndLargest {
    public static void main(String[] args) {
        int[] a = {10,8,7,9,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kth ele: ");
        int k = sc.nextInt();

        sortedarray(a);
        int small = kthsmallele(a,k);
        System.out.println(k+" smallest ele is: "+small);
        int large = kthlargeele(a,k);
        System.out.println(k+" largest ele is: "+large);
    }
    private static int kthlargeele(int[] a, int k) {
        return a[a.length-k];
    }
    private static int[] sortedarray(int[] a) {
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-i-1 ; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
    private static int kthsmallele(int[] a, int k) {
        return a[k-1];
    }
}

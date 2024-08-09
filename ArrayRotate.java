import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght array ele: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter "+ n + " array elements: ");
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println("enter a number of rotation: ");
        int k = sc.nextInt();

        k = k % a.length;
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);

        System.out.println(Arrays.toString(a));

    }

    public static void reverse(int[] a, int l, int r) {
        while (l<r){
            swap(a, l++,r--);
        }
    }
    public static void swap(int[] a,int l,int r){

        int temp = a[l];
         a[l] =a[r];
         a[r] = temp;
    }
}

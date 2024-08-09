import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lenght of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter "+n+ " elements of array: ");
        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
                    //////*********APPROACH -1********* //////////
//        int max = a[0];
//        int min = a[0];
//        for (int i = 0; i < a.length ; i++) {
//            if(a[i]>max){
//                max = a[i];
//            }
//        }
//        System.out.println("maximum of array is: "+max);
//        for (int i = 0; i < a.length ; i++) {
//            if(a[i]<min){
//                min = a[i];
//            }
//        }
//        System.out.println("minimum of array is: "+min);

        //////*********APPROACH -2 ********* //////////
        Arrays.sort(a);
        int min = a[0];
        int  max = a[a.length-1];
        System.out.println("maximum of array is: "+max);
        System.out.println("minimum of array is: "+min);

    }
}

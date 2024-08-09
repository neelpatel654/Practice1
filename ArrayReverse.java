import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println("original array: "+Arrays.toString(a));

        int i = 0;
        int j = a.length-1;

        while (i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("reversed array: "+Arrays.toString(a));
    }
}

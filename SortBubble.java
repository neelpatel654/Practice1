import java.util.Arrays;

public class SortBubble {
    public static void main(String[] args) {
        int[] a = {7,8,3,1,2};

        for (int i = 0; i < a.length-1; i++) { //n-1
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
// big element(bubble) in last,comparing each element with each other.
// time complexity = o(n^2)
// not to useful

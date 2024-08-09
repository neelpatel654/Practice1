import java.util.Arrays;

public class ArraySort0s1s2s {
    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        sortarray(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sortarray(int[] a) {
//        int c1= 0,c2=0,c3=0;
//        for (int i = 0; i <a.length ; i++) {
//            if(a[i]==0){
//                c1++;
//            } else if (a[i]==1) {
//                c2++;
//            }
//            else {
//                c3++;
//            }
//        }
//        int index = 0;
//        for (int i = 0; i <c1 ; i++) {
//            a[index] = 0;
//            index++;
//        }  for (int i = 0; i <c2 ; i++) {
//            a[index] = 1;
//            index++;
//        }  for (int i = 0; i <c3 ; i++) {
//            a[index] = 2;
//            index++;
//        }
        for (int i = 0; i < a.length-1; i++) { //n-1
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}

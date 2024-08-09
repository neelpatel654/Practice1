public class ArrayMissingNumber {
    public static void main(String[] args) {
        int a[] = {1,2,4,5};
        int sum1 = 0;
        int sum2 = 0;
        int res = 0;
        for (int i = 0; i < a.length ; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println(sum1);
        for (int i = a[0]; i <=a[a.length-1]  ; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);
        res = sum2 -sum1;
        System.out.println("missing number is: "+res);

    }
}

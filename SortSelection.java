import java.util.Arrays;

public class SortSelection {
    public static void main(String[] args) {
        int[] a = {7,8,3,1,2};

        for (int i = 0; i <a.length-1 ; i++) {
            int smallest = i;
            for (int j = i+1; j < a.length ; j++) {
                if (a[smallest]>a[j]){
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
// in selection first ele is considered as smallest,now comparing it with array ele,
//while comparing if found smaller ele than smallest, ele will swap by it
//time complexity is 0(n^2)
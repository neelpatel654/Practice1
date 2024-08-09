import java.util.Arrays;

public class SortInsertion {
    public static void main(String[] args) {
        int[] a = {7,8,3,1,2};

        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i-1;
            while (j>=0 && a[j] > current){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        System.out.println(Arrays.toString(a));
    }
}
// 2 parts--> 1 of sorted & 1 of unsorted
// we consider 0 index as sorted rest unsorted.
//comparing each ele from unsorted with sorted and if ele from unsorted is smaller than sorted it will make space for it.

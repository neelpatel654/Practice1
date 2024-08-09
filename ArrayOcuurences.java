public class ArrayOcuurences {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,2,3};
        int target = 2;

        int x = CountOccurences(a,target);
        System.out.println("occurences of "+target+" is : "+x);
    }

    private static int CountOccurences(int[] a, int target) {
        int count = 0;
        for (int i = 0; i < a.length ; i++) {
            if(a[i]==target){
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }
}

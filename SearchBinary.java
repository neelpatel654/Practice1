public class SearchBinary {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int target = 4;
        boolean flag  = false;

        int l = 0;
        int h = a.length-1;

        while (l<=h){
            int m = (l+h)/2;

            if(a[m]==target){
                System.out.println("element found..");
                flag = true;
                break;
            }
            if(a[m]<target){
                l = m + 1;
            }
            if (a[m]>target){
                h = m-1;
            }
        }
        if (flag==false){
            System.out.println("element not found");
        }
    }
}

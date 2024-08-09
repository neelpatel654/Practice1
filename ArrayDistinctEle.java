//remove duplicate from array
public class ArrayDistinctEle {
    public static void main(String[] args) {
        int[] a = {12,10,9,45,2,10,10,45};

        distinct(a);
    }
    public static void distinct(int[] a){
        for (int i = 0; i <a.length ; i++) {
            int j;
            for ( j = 0; j < i ; j++) {
                if(a[i]==a[j]){
                    break;
                }
            }
            if(i==j){
                System.out.print(a[i]+" ");
            }
        }
    }
}

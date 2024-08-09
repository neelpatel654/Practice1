import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] a1={1,2,3};
        int[] a2 = {1,2,3};

//        System.out.println(Arrays.equals(a1,a2));
        boolean status = true;
        if(a1.length==a2.length){
            for (int i = 0; i <a1.length ; i++) {
                if (a1[i]!=a2[i]){
                    status = false;
                }
            }
        }
        else {
            status = false;
        }
        if(status==true){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}

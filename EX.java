import java.util.ArrayList;
import java.util.Arrays;

public class EX {
    public static void main(String[] args) {
      int[] a = {1,2,3,4,5};
         System.out.println("even numbers are: ");
        for (int i = 0; i <a.length ; i++) {
        if(a[i]%2==0){
        System.out.println(a[i]);
            }
                    }
                    System.out.println("odd numbers are: ");
        for (int i = 0; i <a.length ; i++) {
        if(a[i]%2!=0){
        System.out.println(a[i]);
            }
                    }
    }
}

// int --> string =====> String s = Integer.toString(i);
// String --> int =====> int x = Integer.parseInt(s);

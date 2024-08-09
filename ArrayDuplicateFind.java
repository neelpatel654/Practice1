import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayDuplicateFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("enter "+n+ " elements of array: ");
        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        boolean flag = false;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]){
                    System.out.println("duplicate element is: "+a[i]);
                    flag=true;
                }
            }
        }
        if (flag==false){
            System.out.println("duplicate element is not found");
        }

    }
}
//HashSet<Integer> s = new HashSet<>();
//        for (int i = 0; i <a.length ; i++) {
//        if(!s.add(a[i])){
//        System.out.print(a[i]+" ");
//            }
//                    }
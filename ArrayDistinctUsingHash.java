import java.util.HashSet;

public class ArrayDistinctUsingHash {
    public static void main(String[] args) {
        int[] a = {12,10,9,45,2,10,10,9,45};
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i <a.length ; i++) {
            if(s.add(a[i])){
                System.out.print(a[i]+" ");
            }
        }

    }
}
//HashSet<Integer> seen = new HashSet<>();
//
//        for (int num : a) {
//        if (!seen.contains(num)) {
//        seen.add(num);
//                System.out.print(num + " ");
//            }
//                    }

//        for (int i = 0; i <a.length ; i++) {
//            if(s.add(a[i])){
//                System.out.print(a[i]+" ");
//            }
//        }
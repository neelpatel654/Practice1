import java.util.Scanner;

//public class CountOddEvenDigits {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int n = sc.nextInt();
//
//        int e = 0;
//        int o = 0;
//
//        while(n>0){
//            int d = n%10;
//            if(d%2==0){
//                e++;
//            }
//            else{
//                o++;
//            }
//            n = n/10;
//        }
//        System.out.println("even digits = "+e+" odd digits = "+o);
//
//    }
//}

public class CountOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        countEvenOdd(n);
    }
    public static void countEvenOdd(int n){
        int e = 0;
        int o = 0;

        while(n>0){
            int d = n%10;
            if(d%2==0){
                e++;
            }
            else {
                o++;
            }
            n = n/10;
        }
        System.out.println("even digits = "+e+" odd digits = "+o);
    }
}

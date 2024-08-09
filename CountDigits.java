import java.util.Scanner;
//
//public class CountDigits {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int n = sc.nextInt();
//
//        int count = 0;
//        while(n>0){
//            n = n/10;
//            count++;
//        }
//        System.out.println(count);
//    }
//}

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
         count(n);
    }
    public static void count(int n){
        int c = 0;
        while(n>0){
            n = n/10;
            c++;
        }
        System.out.println(c);
    }
}

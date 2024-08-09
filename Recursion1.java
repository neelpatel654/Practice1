//print 5to1 using recursion
//print 1to5 using recursion
public class Recursion1 {
    public static void main(String[] args) {
//        int n = 5;
        int n = 1;
        printNum(n);
    }

    private static void printNum(int n) {
        if(n==6)
            return;
        System.out.println(n);
//        printNum(n-1);
        printNum(n+1);

    }
}

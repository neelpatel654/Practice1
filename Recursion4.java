//print fibonacci
public class Recursion4 {

    public static void main(String[] args) {
        int a = 0,b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFibonacci(a,b,n-2,0);
    }

    private static void printFibonacci(int a,int b,int n,int i) {
        if(i==n){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(b,c,n,i+1);

//        if(n==0){
//            return;
//        }
//        printFibonacci(b,c,n-1);
    }
}

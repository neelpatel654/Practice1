//print factorial of n
public class Recursion3 {
    public static int fact(int n){
       if(n==1 || n==0){
           return 1;
       }
       int factorial = n * fact(n-1);
       return factorial;
    }
    public static void main(String[] args){
       int ans =  fact(7);
        System.out.println(ans);

    }
}

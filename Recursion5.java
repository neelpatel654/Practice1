//print x^n
public class Recursion5 {
    public static int calcPower(int x,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        //for x^n
//        int xpownm1 = calcPower(x,n-1);
//        int xpow = x * xpownm1;
//        return xpow;

        //for x^logn
        if(n%2==0){  //n is even
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        else {   //n is odd
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
    }
    public static void main(String[] args) {
        int ans = calcPower(5,2);
        System.out.println(ans);
    }
}

public class StringReverse {
    public static void main(String[] args) {

        String str = "Neel patel";//letap leeN
        String rev = "";
// 1. using string concatenantion
        for (int i = str.length()-1; i>=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        // 2. using char array
//        char[] a  = str.toCharArray();
//        for (int i = a.length-1; i >=0 ; i--) {
//            rev = rev + a[i];
//        }
//        System.out.println(rev);

    }
}

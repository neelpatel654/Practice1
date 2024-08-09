public class StringPalindrome {
    public static void main(String[] args) {
        String str = "121";
        String rev = "";
        System.out.println("original string is: "+str);
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reverse string is: "+rev);
        if(str.equals(rev)){ //if we use == it also checks memory location so give o/p false
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}

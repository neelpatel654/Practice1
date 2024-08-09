public class StringReverseWords {
    public static void main(String[] args) {
        String str = " Neel Patel ";//Patel Neel
        String[] s = str.split("\\s+");
        String ans = "";
        for (int i = s.length-1; i >=0 ; i--) {
            ans = ans + s[i] +" ";
        }
       System.out.println(ans);
    }
}

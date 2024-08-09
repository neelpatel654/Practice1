import java.util.Arrays;

public class StringReverseEachWord {
    public static void main(String[] args) {
        String str = " Neel Patel ";//leeN letaP
//        str = str.trim();
        String[] words = str.split("\\s+");
        System.out.println(Arrays.toString(words));
        String reversestring = "";

        // approach-1

        for (String w:words){
            String reverseword = "";
            for (int i = w.length()-1; i >=0 ; i--) {
                reverseword = reverseword + w.charAt(i);
            }
            reversestring = reversestring + reverseword +" ";
        }
        System.out.println(reversestring);

        // approach-2

//      for(String w:words){
//          StringBuilder sb = new StringBuilder(w);
//          sb.reverse();
//          reversestring = reversestring + sb.toString()+" ";
//      }
//        System.out.println(reversestring);
    }
}

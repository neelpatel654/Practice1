public class StringReversetOGGLEeachWord {
    public static void main(String[] args) {
       String str = "i am neel";//i mA lEEN
       str = str.trim();
       String[] words = str.split("\\s+");
       String reverseString = "";
       String res = "";

       for (String w:words){
           String reverseWord = "";
           for (int i = w.length()-1; i >=0 ; i--) {
               reverseWord = reverseWord + w.charAt(i);
           }
           reverseString = reverseString + reverseWord +" ";
           String first  = reverseWord.substring(0,1);
           String afterFirst = reverseWord.substring(1,w.length());
           res = res + first.toLowerCase()+afterFirst.toUpperCase()+" ";
       }
        System.out.println(reverseString);
        System.out.println(res);
    }
}

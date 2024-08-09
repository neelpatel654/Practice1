public class StringWordCount {
    public static void main(String[] args) {
        String str = " neel  j patel ";
        System.out.println(str.length());
       str =  str.trim();//neel j patel
//        int count=1;
        //approach-1
//        for (int i = 0; i <str.length() ; i++) {
//            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ' && i<str.length()-1){
//                count++;
//            }
//        }

        //approach-2
      int  count = str.split("\\s+").length; //.split method gives us words.
        System.out.println(count);
    }
}

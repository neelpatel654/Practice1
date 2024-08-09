import java.util.Arrays;
import java.util.HashSet;

//anagram means both string have different sentence but same char. //ex:- keep-peek
public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "keep";
        String s2 = "peek";
        anagram(s1,s2);
    }
    public static void anagram(String s1,String s2){
        boolean status = false;
        s1  = s1.replaceAll("\\s ","");
       s2 = s2.replaceAll("\\s","");

       if(s1.length()!=s2.length()){
           status = false;
       }
       else {
           char[] a1 = s1.toLowerCase().toCharArray();
           char[] a2 = s2.toLowerCase().toCharArray();
           Arrays.sort(a1);          //a1 =  sort(a1);
           Arrays.sort(a2);          //a2 =  sort(a2);
           status = Arrays.equals(a1,a2);
       }
       if(status){
           System.out.println("anagram");
       }
       else {
           System.out.println("not anagram");
       }
    }


//    public static char[] sort(char[] a){
//        for (int i = 0; i <a.length-1 ; i++) {
//            for (int j = 0; j <a.length-i-1 ; j++) {
//                if(a[j]>a[j+1]){
//                    char temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//        return a;
//    }
}

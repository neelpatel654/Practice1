import java.lang.reflect.Array;
import java.util.Arrays;

//minimum distance between 2 words.
public class StringMinDistance {
    public static void main(String[] args) {
        String[] s = {"the", "quick", "brown", "fox", "quick"};
//        System.out.println(Arrays.toString(s));

        String word1 = "the",word2 = "fox";
        int d1 = -1,d2 = -1;
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<s.length;i++){
            if(s[i]==word1){
                d1 = i;
            }
            if (s[i] == word2){
                d2 = i;
            }
            if(d1!=-1 && d2!=-1){
                ans = Math.min(ans,Math.abs(d1-d2));
            }
        }
        System.out.println(ans);
    }
}

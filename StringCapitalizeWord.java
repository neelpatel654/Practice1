import java.util.Arrays;

public class StringCapitalizeWord {
    public static void main(String[] args) {
        String str = " i am neel ";
        str = str.trim();
        String[] words = str.split("\\s+");
        System.out.println(Arrays.toString(words));
        String res = "";

        for(String w:words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1,w.length());
            res = res+first.toUpperCase()+afterFirst+" ";
        }
        System.out.println(res);
    }
}

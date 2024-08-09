import java.util.Arrays;

public class StringLongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"geeksforgeeks","geeks", "geek", "geezer"};

//        Arrays.sort(str);
        sort(str);
        System.out.println(Arrays.toString(str));


        int end = Math.min(str[0].length(),str[str.length-1].length());
        int i=0;
        while (i<end && str[0].charAt(i)==str[str.length-1].charAt(i)){
            i++;
        }
        String res = str[0].substring(0,i);
        System.out.println(res);

    }
    public static void sort(String[] str){
        int n = str.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if((str[j].compareTo(str[j+1])>0)){
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
    }
}

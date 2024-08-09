public class StringCharOccurences {
    public static void main(String[] args) {
        String str = "neel patele";
//        int total = str.length();
//        String str1 = str.replace("a","");
//        int remove = str1.length();
//        int count = total - remove;
//        System.out.println(count);

        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        System.out.println(count);
    }
}
    
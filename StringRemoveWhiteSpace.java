public class StringRemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "neel patel 654";
        System.out.println("before removing: "+str);
//       String str1 =  str.replace(" ","");
        String str1 =  str.replaceAll("\\s","");
        System.out.println("after removing: "+str1);
    }
}

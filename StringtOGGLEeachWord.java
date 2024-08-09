public class StringtOGGLEeachWord {
    public static void main(String[] args) {
        String str = " i am neel patel ";//i aM nEEL pATEL
        str = str.trim();
        String[] words = str.split("\\s+");
        String res = "";

        for (String w:words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1,w.length());

            res = res + first + afterFirst.toUpperCase()+" ";
        }
        System.out.println(res);
    }
}

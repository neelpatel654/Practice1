//percentage of uppercase, lowercase, digits and special characters in a string
public class StringCheckPercentage {
    public static void main(String[] args) {
        String s = "India is my country 100%";
        int uc = 0,lc = 0,dg = 0,ot = 0;
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);

            if(Character.isUpperCase(c)){
                uc++;
            }
            else if(Character.isLowerCase(c)){
                lc++;
            }
            else if (Character.isDigit(c)) {
                dg++;
            }
            else {
                ot++;
            }
        }
        int up = (uc * 100) / s.length();
        int lp = (lc * 100) / s.length();
        int dp = (dg * 100) / s.length();
        int op = (ot * 100) / s.length();

        System.out.println(up+"%");
        System.out.println(lp+"%");
        System.out.println(dp+"%");
        System.out.println(op+"%");
    }
}

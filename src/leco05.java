
import java.util.*;

public class leco05 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        System.out.println(longest(s));
    }

    public static String longest(String s){
        if (ishuiwen(s))
            return s;
        String end = "";
        char[] c = s.toCharArray();
        for (int i=0;i<s.length();i++){
            for (int j=s.length()-1;j>i;j--){
                if (c[i]==c[j]){
                    String buf = s.substring(i,j+1);
                    //System.out.println(buf);
                    if (buf.length()>end.length()&&ishuiwen(buf))
                        end = buf;
                }
            }
        }
        if (end.equals(""))
            end = String.valueOf(c[0]);
        return end;
    }
    public static boolean ishuiwen(String sin){
        StringBuffer sb = new StringBuffer(sin);
        sb.reverse();
        if (sin.equals(sb.toString()))
            return true;
        else
            return false;
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class leco07 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        boolean flag = false;
        if (x<0)
        {
            flag=true;
            x=-x;
        }
        String s = Integer.toString(x);
        try {
            x = Integer.parseInt(fan(s));
        } catch (NumberFormatException e) {
            System.out.println(0);
            //return 0;
        }
        if (flag)
            x=-x;
        System.out.println(x);
    }

    public static String fan(String s)
    {
        if (s.equals("0"))
            return s;
        StringBuffer sb = new StringBuffer(s);
        while (sb.lastIndexOf("0")==sb.length()-1)
        {
            sb.deleteCharAt(sb.length()-1);
        }
        sb.reverse();

        return sb.toString();
    }
}

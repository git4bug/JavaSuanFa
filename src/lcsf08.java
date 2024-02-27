import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lcsf08 {

    public static boolean checkInclusion(String s1, String s2) {
        ArrayList<Character> ll1 = new ArrayList<>();
        ArrayList<Character> ll2 = new ArrayList<>();
        char[] c = s2.toCharArray();
        for (int i=0;i<s1.length();i++){
            ll1.add(s1.charAt(i));
        }
        Collections.sort(ll1);
        int count = 0;
        for (int i=0;i<s2.length();i++){
            if (ll1.contains(c[i])){
                count++;
            }
            if (count==s1.length()){
                count--;
                for (int j=0;j<s1.length();j++){
                    ll2.add(c[i-j]);;
                }
                Collections.sort(ll2);
                if (ll1.equals(ll2)) return true;
                //else System.out.println("yici");
                ll2.clear();
            }

        }
        //System.out.println(ll1);
        //System.out.println(ll2);
        if (ll1.equals(ll2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("aaa","dcadaavda"));
    }
}

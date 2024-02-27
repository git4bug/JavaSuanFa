import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class leco04 {
    //找不重复最长子串
    public static int lengthOfLongestSubstring(String s) {
//        int max = 0;
//        List<Character> ll = new LinkedList<Character>();
//        char[] ch = s.toCharArray();
//        for (int i = 0;i<ch.length;i++){
//            if (!ll.contains(ch[i])){
//                ll.add(ch[i]);
//                if (ll.size()>max)
//                    max = ll.size();
//            }else{
//                ll.clear();
//                ll.add(ch[i]);
//            }
//        }
//        return max;
//    }

        int max = 0;
        List<Character> ll = new LinkedList<Character>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (!ll.contains(ch[i])) {
                ll.add(ch[i]);
                //System.out.println(ll.toString());
                if (ll.size()>max)
                    max = ll.size();
            } else {
                int buf = ll.indexOf(ch[i]);
                for (int j = 0; j <= buf; j++){
                    ll.remove(0);
                }
                    //ll.remove(j);
                ll.add(ch[i]);
            }
        }
        //System.out.println(ll.toString());
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}

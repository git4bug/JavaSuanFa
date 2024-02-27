import java.util.*;

public class leco03 {
    public static List<List<String>> groupAnagrams(String[] strs) {
//        if (strs==new String[]{})
//            return new ArrayList<>();
        Map<String,List<String>> hsm = new HashMap<>();
        for (int i=0;i< strs.length;i++){
            char[] cl = strs[i].toCharArray();
            Arrays.sort(cl);    //进行一次排序，以此为依据排序
            String buf = new String(cl);
            System.out.println(buf);
            if (!hsm.containsKey(buf))
                hsm.put(buf,new ArrayList<>());
            hsm.get(buf).add(strs[i]);
        }
        List<List<String>> ll = new ArrayList<>(hsm.values());  //
        return ll;

    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs1 = new String[]{"a"};
        String[] strs2 = new String[]{};
        System.out.println(groupAnagrams(strs2));
    }
}

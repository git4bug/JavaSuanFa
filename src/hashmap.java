import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        String[] ss = s.split(",");
        int[] nn = new int[ss.length];
        try
        {
            for (int i=0;i<ss.length;i++)
            {
                nn[i]=Integer.parseInt(ss[i]);
            }
        }catch(Exception e){}

        for (int i:nn)
        {
            System.out.println(i);
        }

        nn = new int[]{1,2,3,2,1,3,4,5,4,2,5};

        //统计元素出现次数
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int num:nn)
        {
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        //按照频率排序
        List<Map.Entry<Integer,Integer>> sortL = new ArrayList<>(frequency.entrySet());
        sortL.sort(Map.Entry.comparingByValue());
        //输出排序结果
        for (Map.Entry<Integer,Integer> entry : sortL)
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}

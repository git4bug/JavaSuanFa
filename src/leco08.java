import java.util.HashMap;
import java.util.Map;

public class leco08 {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,2,1};

        System.out.println(duoshu(array));
    }

    public static int duoshu(int nn[])
    {
        int lmt = nn.length/2;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        //转为哈希表的形式<数，出现次数>
        for (int i:nn)
        {
            if (!hm.containsKey(i))
            {
                hm.put(i,1);
            }
            else
            {
                hm.put(i,hm.get(i)+1);
            }
        }

        int maxV = 0;
        int maxK = 0;
        //遍历HashMap找最大
        for (Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            int  value = entry.getValue();
            if (value>maxV)
            {
                maxV=value;
                maxK=entry.getKey();
            }
        }

        return maxK;

    }
}

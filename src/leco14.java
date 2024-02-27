import java.util.Arrays;
import java.util.Comparator;

public class leco14 {
    public static void main(String[] args) {
        int[] nn = new int[]{3,0,6,1,5};
        System.out.println(hIndex(nn));
    }

    public static int hIndex(int[] citations) {
        //先排序
        Integer[] buf = new Integer[citations.length];
        for (int i=0;i<citations.length;i++)
        {
            buf[i] = citations[i];
        }
        Arrays.sort(buf, Comparator.reverseOrder());

        //for (int i=0;i<citations.length;i++)
        //{
        //    citations[i] = buf[i];
        //}

        int h = 0;
        for (int i=0;i<buf.length;i++)
        {
            if(buf[i]>=i+1)
            {
                h = i+1;
            }else {
                h=Math.max(h,buf[i]);
            }
        }
        return h;

    }
}

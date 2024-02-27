import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leco10 {
    public static void main(String[] args) {
        int[] n = new int[]{1,2,3,4,5,6,7};
        int[] nn = new int[n.length];
        int k = 3;
        List ll =  new LinkedList();
        for (int i=0;i<n.length;i++)
        {
            int buf = i+k;
            while (buf>=n.length)
            {
                buf-=n.length;
            }
            nn[buf] = n[i];
        }
        n=nn;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i:nn)
        {
            sb.append(i+",");
            //System.out.print(i+",");
        }
        sb.deleteCharAt(nn.length*2);
        sb.append("]");
        System.out.println(sb);
        System.out.println(Arrays.toString(n));
    }
}

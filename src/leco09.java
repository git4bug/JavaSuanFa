import java.lang.reflect.Array;
import java.util.*;

public class leco09 {

    public static void main(String[] args) {

        int[] nn = new int[]{4,7,1,2};//[7,1,5,3,6,4]
        //System.out.println(maxProfit(nn));

        List<jiegou> ll = new LinkedList<>();
        for (int i=0;i< nn.length;i++)
        {
            ll.add(new jiegou(nn[i],i));
        }
        Collections.sort(ll,new comp());
        int left=0;
        int right=ll.size()-1;

        while (left<right)
        {
            if (ll.get(left).xiabiao<ll.get(right).xiabiao) break;
            //先看一下那个大
            //if((ll.get(right).value-ll.get(left+1).value)>(ll.get(right-1).value-ll.get(left).value)&&right!=left+1)
            //{
            //    left++;
            //}
            //else right--;
            if (ll.get(left+1).xiabiao<ll.get(right).xiabiao&&ll.get(left).xiabiao<ll.get(right-1).xiabiao)//jun he fa
            {
                if (ll.get(right).value-ll.get(left+1).value<ll.get(right-1).xiabiao-ll.get(left).value) {right--; break;}
                else {left++; break;}
            }else if (ll.get(left+1).xiabiao<ll.get(right).xiabiao) {left++; break;}
            else if (ll.get(left).xiabiao<ll.get(right-1).xiabiao) {right--; break;}

            left++;
            right--;


        }
        int max = ll.get(right).value-ll.get(left).value;
        System.out.println(ll.get(left).xiabiao+" "+ll.get(left).value);
        System.out.println(ll.get(right).xiabiao+" "+ll.get(right).value);
        //if (max<=0) max=0;
/*
        jiegou ll1 = ll.get(0);
        jiegou ll2 = ll.get(1);

        int maxDiff;
        if (ll2.xiabiao>ll1.xiabiao) maxDiff = ll2.value-ll1.value;//合法
        else maxDiff = 0;

        for (int i = 2;i<ll.size();i++)
        {
            jiegou curr = ll.get(i);
            int diff = curr.value-ll1.value;

            if (diff>maxDiff && curr.xiabiao>ll1.xiabiao){
                ll2 = curr;
                maxDiff = diff;
            }
            ll1 = ll.get(i-1);
        }
*/

        System.out.println(max);

    }

    public static int maxProfit(int[] prices) {
        int pin1=0;
        int pin2=0;
        int max=0;
        for (int i =0;i<prices.length;i++)
        {
            for (int j=i;j<prices.length;j++)
            {
                if((prices[j]-prices[i])>max)
                {
                    max = prices[j]-prices[i];
                }
            }

        }
        return max;
    }


    public void test(int[] nn)
    {
        int[][] nnn = new int[][]{{9,2},{4,5}};
        print2int(nnn);
        List<jiegou> ll = new LinkedList<>();
        for (int i=0;i< nn.length;i++)
        {
            ll.add(new jiegou(nn[i],i));
        }
        Collections.sort(ll,new comp());
        int left=0;
        int right=ll.size()-1;
        boolean flag = true;
        while (ll.get(left).xiabiao>=ll.get(right).xiabiao)
        {
            if (flag) {left++; flag=false;}
            else {right--; flag=true;}
            //找到的第一个符合要求的就是
        }
        int max = ll.get(right).value-ll.get(left).value;


    }

    static class jiegou{
        int value;
        int xiabiao;
        public jiegou(int val,int xb){
            super();
            this.value = val;
            this.xiabiao = xb;
        }
    }

    static class comp implements Comparator<jiegou> {

        @Override
        public int compare(jiegou o1, jiegou o2) {
            return o1.value-o2.value;//小到大
        }
    }

    public static void print2int(int[][] nn)
    {
        for (int[] row:nn)
        {
            for (int element:row)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}

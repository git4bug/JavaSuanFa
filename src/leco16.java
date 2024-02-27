import java.util.LinkedList;

public class leco16 {

    public static void main(String[] args) {
        //123
        int[] num1 = new int[]{5,1,2,3,4};
        int[] num2 = new int[]{4,4,1,5,1};//1,-3,1,-2,3
        System.out.println(canCompleteCircuit(num1,num2));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i=0;i<n;i++)
        {
            cost[i]=gas[i]-cost[i];
        }
        int allin = 0;
        for (int v:cost)
        {
            allin+=v;
        }
        if (allin<0) return -1;
        for (int i=0;i<n;i++)
        {
            if (cost[i]>0)
            {
                int loop=0;
                allin = 0;
                for (int j=i;loop!=2;j++)
                {
                    //if (cost[j]==0) continue;
                    if (j>=n) j-=n;
                    if (cost[j]==0) continue;
                    if (j==i) loop++;
                    allin+=cost[j];
                    if (allin<0) break;
                }
                if (loop==2) return i;
            }
        }
        return 0;
    }
}

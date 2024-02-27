public class leco13 {
    public static void main(String[] args) {
        //从后往前找最大
        //

        int[] nums = new int[]{2,3,1};
        int[] maxV = new int[2];
        maxV=new int[]{Integer.MIN_VALUE,0};
        int count=0;
        for (int i=nums.length-1;i>0;)
        {
            for (int j=i-1;j>=0;j--)
            {
                if (j+nums[j]>=i&&nums[j]>=maxV[0])
                {
                    //最大
                    maxV[0]=nums[j];
                    maxV[1]=j;
                }
                if (j+nums[j]>=i)
                {
                    //最远
                    maxV[1]=j;
                }
            }
            maxV[0]=Integer.MIN_VALUE;
            i=maxV[1];
            //System.out.println(i);
            count++;
        }
        System.out.println(count);
    }
}

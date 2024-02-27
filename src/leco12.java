public class leco12 {
    public static void main(String[] args) {
        //找所有0的下表
        //从前往后 遍历0
        //从0开始往前找
        //
        int[] nums = new int[]{2,0,0};
        boolean flag=true;
        for (int i=0;i<nums.length;i++)
        {
            flag = true;
            if(nums.length==1) break;
            if (nums[i]==0)
            {
                if (i==0) {flag=false;}
                for (int j=i-1;j>=0;j--)
                {
                    if(j+nums[j]>i||(j+nums[j]==i&&i==nums.length-1)){ flag = true; break; }
                    else {flag = false;}
                }

                if(flag==false) break;
            }
            //System.out.println("1");
        }
        System.out.println(flag);
    }
}

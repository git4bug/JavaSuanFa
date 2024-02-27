import java.util.Arrays;

public class lcms150_3 {
    public static void main(String[] args) {

        int[] n1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicates(n1);
        System.out.println(Arrays.toString(n1));
        System.out.println(n);
    }

    public static int removeDuplicates(int[] nums) {

        int[] val = new int[]{nums[0],0};//{val,count}
        int cd = nums.length;
        for (int i=0;i<cd;i++)
        {
            if (nums[i] == val[0])
            {
                val[1]++;
                System.out.println(Arrays.toString(val));
                if (val[1]>1)
                {
                    cd--;
                    for (int j=i;j<cd;j++)
                    {
                        if (j+1 == nums.length) nums[j] = val[0];
                        else nums[j] = nums[j+1];
                    }
                    i--;
                }
            }else{
                val[0] = nums[i];
                val[1] = 0;
                i--;
            }

        }
        //System.out.println(cd);
        return cd;
    }
}

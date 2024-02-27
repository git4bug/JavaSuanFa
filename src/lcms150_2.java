import java.util.Arrays;

public class lcms150_2 {
    public static void main(String[] args) {
        int[] n1 = new int[]{0,1,2,2,3,0,4,2};
        int[] n2 = new int[]{1,2,2,3};
        int n = removeElement(n1,2);
        System.out.println(Arrays.toString(n1));
        System.out.println(n);
    }

    public static int removeElement(int[] nums, int val) {
        //int count=0;
        int cd = nums.length;
        for (int i=0;i<cd;i++)
        {
            if (nums[i] == val)
            {
                cd--;
                //count++;
                for (int j=i;j<cd;j++)
                {
                    if (j+1 == nums.length) nums[j] = val;
                    else nums[j] = nums[j+1];
                }
                i--;
            }
        }
        //System.out.println(cd);
        return cd;
    }
}

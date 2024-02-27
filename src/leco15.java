import java.util.HashMap;

public class leco15 {
    public static void main(String[] args) {
        System.out.println(123);
        //先遍历一遍，乘完
        //如果为0了，说明有0，找出所有0，单独操作
        //如果不为0，遍历一边除自身
    }
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;//count zero
        int need=0;
        long mul=1;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==0)
            {
                zero++;
                if (zero==1) need=i;
                if (zero>=2) return new int[nums.length];
            }else
            {
                mul*=nums[i];
            }
        }

        if (zero==0)
        {
            for (int i=0;i<nums.length;i++)
            {
                nums[i]= (int) (mul/nums[i]);
            }
            return nums;
        }else
        {
            int[] buf = new int[nums.length];
            buf[need] = (int)mul;
            return buf;
        }

    }

}

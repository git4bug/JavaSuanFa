import java.util.Arrays;

public class lcsf05 {
    public static void moveZeroes(int[] nums) {
        //if(nums==int[]{0,0})
        int count = 0;
        for (int i = 0,j = 1;i<nums.length;i++,j++){
            //j=i+1;
            //if(nums.length==1||nums.length==2) break;
            if(j>=nums.length||i==j) break;
            if(nums[i]==0){
                while(nums[j]==0&&j<nums.length-1){
                    j++;
                }
                //if(j>=nums.length||i==j) break;
                nums[i] = nums[j];
                nums[j]=0;
                count++;
            }
            //if((nums.length-i)<=count) break;//nums[i]=0;
        }
    }

    public static void main(String[] args) {
            int[] n = new int[]{0,0};
            moveZeroes(n);
            System.out.println(Arrays.toString(n));
    }
}

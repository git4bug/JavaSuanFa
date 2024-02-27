import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//如下步骤就可以坐旋转字符串：
//
//        反转区间为前n的子串
//        反转区间为n到末尾的子串
//        反转整个字符串
//        本题是右旋转，其实就是反转的顺序改动一下，优先反转整个字符串，步骤如下：
//
//        反转整个字符串
//        反转区间为前k的子串
//        反转区间为k到末尾的子串
public class lcsf04 {

    public static void rotate(int[] nums, int k) {

//        for(int i=0;i<k;i++){
//            int shangyi = nums[0];
//            nums[0] = nums[nums.length-1];
//            int xiayi = 0;
//            for(int j=0;j<nums.length-1;j++){
//                xiayi = nums[j+1];
//                nums[j+1]=shangyi;
//                shangyi = xiayi;
//            }
//        }

//        StringBuffer sb = new StringBuffer(Arrays.toString(nums));
//        System.out.println(sb);
//        sb.replace(0,1,"");
//        sb.replace(sb.length()-1,sb.length(),"");
//        sb.reverse();
//        System.out.println(sb);

        k = k%nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k, nums.length-1);
    }

    static void reverse(int[] nums, int st, int ed){
        for (int i=st,j=ed;i<j;i++,j--){
            int buf = nums[j];
            nums[j] = nums[i];
            nums[i] = buf;
        }
    }
    public static void main(String[] args) {
        int[] n = new int[]{1,2,3,4};
        rotate(n,2);
        System.out.println(Arrays.toString(n));
    }
}

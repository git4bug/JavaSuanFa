import java.util.*;

public class leco01 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  //先排序
        List<List<Integer>> ll = new ArrayList<>(); //???为什么是arrList
        for (int i = 0;i < nums.length;i++){
            if (nums[i]>0)  break;  //如果第一个就大于0，直接就没有了,所以大于0就停
            int right = nums.length-1;  //右
            int left = i+1; //左
            System.out.println(left);
            if (nums[i]<=0 && left<right){
                if (i!=0&&nums[i]==nums[i-1]) continue; //避免重复
                while (left<right){
                    List<Integer> triple = new ArrayList<>();   ///???
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        triple.add(nums[i]);
                        triple.add(nums[left]);
                        triple.add(nums[right]);
                        ll.add(triple);
                        //过滤重复，前面避免超范围，后面检查重复
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        right--;    //如果两个都被取走了，就双向移动
                        left++;
                    }else if(nums[i] + nums[left] + nums[right] > 0){
                        right--;    //如果和大于0了，说明大了，往小的找，右边--
                    }else{
                        left++; //同理，往大的找，左边++
                    }
                }
            }
        }
        return ll;

    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

public class lcsf02 {
    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }else if(nums[nums.length-1]<target){
            return nums.length;
        }
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        while (l<=r){
            mid = l+((r-l)>>1);
            if (nums[mid]<target) l = mid + 1;
            else if (nums[mid]>target) r = mid -1;
            else return mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(searchInsert(nums,6));
    }
}

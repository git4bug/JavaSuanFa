public class lcsf01 {

    public static int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length-1]) return -1;
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        if (right==0||nums[0]==target) return 0;
        if (nums[right]==target) return right;
        while (right>=left) {
            mid = left + ((right - left) >> 1);
            if (mid==right||mid==left) break;
            if (nums[mid]>target){
                right = mid;
            }else if(nums[mid]<target){
                left = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public int searchmoban(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        System.out.println(search(nums,2));
    }
}

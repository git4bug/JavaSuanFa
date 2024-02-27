public class lcsf03 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        int p2 = n - 1;
        int curr = n - 1;
        int[] result = new int[n];
        for (int i = n - 1;i >= 0;i--) {
            if (nums[p1] * nums[p1] >= nums[p2] * nums[p2]){
                result[curr--] = nums[p1] * nums[p1];
                p1++;
            }else {
                result[curr--] = nums[p2] * nums[p2];
                p2--;
            }
        }
        return result;
    }
}

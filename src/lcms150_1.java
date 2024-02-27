import java.util.Arrays;

public class lcms150_1 {

    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        merge(n1, 3, new int[]{2,5,6},3);
        System.out.println(Arrays.toString(n1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 = new int[m+n];
        for (int i = 0;i<n;i++)
        {
          nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

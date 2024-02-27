import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leco06 {
    public static void main(String[] args) {
        //先找最小的，看能不能

        //不能就吧他t了，再找最小的

        //int[] nn = {2,1,5,0,4,6};
        //int[] nn = {20,100,10,12,5,13};
        int[] nn = {1,5,2,4,1,3};
        //System.out.println(Arrays.stream(nn).min());
        //System.out.println(findmin(nn));//3
        System.out.println(Judge(0,nn));
        //System.out.println(Arrays.toString(removeone(nn,3)));
        System.out.println(selution(nn));
    }

    public static boolean selution(int[] nums){
        //int xianzhi = nn.length-2;
        for (int i=0;i<nums.length;i++){//xiao yu you wen ti
            int minidx = findmin(nums);
            if(Judge(minidx,nums))
                return true;
            else{
                nums=removeone(nums,minidx);
            }
        }
        return false;
    }

    public static int[] removeone(int[] in,int idx){
        // 将int[] 转换成List
        List<Integer> ll = new ArrayList<>();
        for (int j : in){
            ll.add(j);
        }
        ll.remove(idx);
        // 将List转换成int[]
        //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int[] arr = new int[ll.size()];
        for (int j = 0; j < ll.size(); j++) {
            arr[j] = ll.get(j);
        }
        return arr;
    }
    //找第一个最小下标
    public static int findmin(int[] ns){
        int min = 0;
        for (int i=0;i<ns.length;i++){
            if (ns[i]<ns[min]){
                min=i;
            }
        }
        return min;
    }
    //判断能不能的方法
    public static boolean Judge(int min,int[] ns){
        //ba su zu qie ge
        int buf = ns[min];
        int cnt = 0;
        for (int i=min;i<ns.length;i++){
            if (ns[i]>buf){
                buf=ns[i];
                cnt++;
            }
            if (cnt>=2)
                return true;
        }
        return false;
    }
}

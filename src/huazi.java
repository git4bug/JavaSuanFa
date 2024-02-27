import java.util.*;

public class huazi {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] rec = new int[n];
//        for (int i=0;i<n;i++){
//            rec[i]=sc.nextInt();
//        }
//        int total = sc.nextInt();

//        int n = 6;
//        int[] rec = new int[]{3,3,8,7,10,15};
        int n = 5;
        int[] rec = new int[]{6,2,3,6,99};
        int total = 40;

        System.out.println(getlimt(n,rec,total));
    }

    static int getlimt(int n,int[] rec,int total){
        int limt = total/n;   //不一定加1
        //System.out.println(limt);
        Arrays.sort(rec);
        int index =-1;
        //找第一个
        for(int i=0;i<n;i++){
            if (rec[i]>=limt){
                index = i;
                break;
            }
        }
        //如果index=0说明全大，直接out limt，如果index=-1说明全小，直接out -1
        if(index==0) return limt;
        if(index==-1) return index;
        //if(index==n-1) return -1;
        //得到前置数
        int front = 0;
        for(int i=0;i<index;i++){
            front+=rec[i];
            }

        while(front+(n-index)*limt<total) {
            //limt++;
            if (rec[index]<limt){
                index++;    //加到不大为止
                front+=rec[index];  //也要更正
            }else {
                limt++;
            }

        }

        return limt;
    }
}

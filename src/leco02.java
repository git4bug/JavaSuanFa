import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leco02 {

    public void setZeroes(int[][] matrix) {

        //boolean flag=false;
        //int out=0;
        List<int[]> ll = new ArrayList<>();
        //记录位置
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==0){
                    int[] buf = new int[]{i,j};
                    ll.add(buf);
                    }
            }
        }

        //置0
        for (int a=0;a<ll.size();a++){
            for (int x=0;x<matrix[0].length;x++){
                matrix[ll.get(a)[0]][x]=0;
            }
            for (int x=0;x<matrix.length;x++){
                matrix[x][ll.get(a)[1]]=0;
            }
        }

//        for (int i=0;i< matrix.length;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                if (matrix[i][j]==0){
//                    out=j;
//                    flag=true;
//                    j=0;
//                    while (j<matrix[0].length){
//                        matrix[i][j]=0;
//                        j++;
//                    }
//                    break;
//                }
//
//            }
//            if (flag){
//                i=0;
//                while (i<matrix.length){
//                    matrix[i][out]=0;
//                    i++;
//                }
//                flag=false;
//            }
//        }
    }

    public static void main(String[] args) {

    }
}

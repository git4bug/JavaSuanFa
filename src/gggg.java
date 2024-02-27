import java.io.InputStreamReader;
import java.util.*;

public class gggg {
    public static void main(String[] args) {
        //n = 3, edges = [[0,1],[1,2],[2,0]], start = 0, end = 2
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int[][] edges = new int[m][2];
        for (int i=0;i<m;i++){
            edges[i] = new int[]{cin.nextInt(),cin.nextInt()};
        }
        int st = cin.nextInt();
        int ed = cin.nextInt();
        System.out.println(validPath1(n,edges,st,ed));
    }
    //并查集
//    并查集主要有三个功能。
//
//    寻找根节点，函数：find(int u)，也就是判断这个节点的祖先节点是哪个
//    将两个节点接入到同一个集合，函数：join(int u, int v)，将两个节点连在同一个根节点上
//    判断两个节点是否在同一个集合，函数：same(int u, int v)，就是判断两个节点是不是同一个根节点
    static int[] parent;

    static int find(int x) {   //找节点
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    static void join(int x, int y) {  //加入
        if (find(x) != find(y)) parent[find(y)] = parent[x];
    }

    static boolean same(int x,int y){
        return find(x) == find(y);
    }

    static void init(int n){   //初始化
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    public static boolean validPath1(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        init(n);
        for (int[] e : edges) {
            int x = e[0], y = e[1];
            join(x, y);     //把边加入并查集
        }
        return same(source,destination);
    }

    //dfs
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer> path[]=new List[n];
        boolean cameBefore[]=new boolean[n];
        for(int i=-0;i<n;i++){path[i]=new ArrayList<>();}
        for(int i=0;i<edges.length;i++){
            path[edges[i][0]].add(edges[i][1]);
            path[edges[i][1]].add(edges[i][0]);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        cameBefore[source]=true;
        while(q.size()>0){
            int a=q.poll();
            if(a==destination){return true;}
            for(int i=0;i<path[a].size();i++){
                int b=path[a].get(i);
                if(!cameBefore[b]){
                    cameBefore[b]=true;
                    q.add(b);
                }
            }
        }
        return false;
    }
}

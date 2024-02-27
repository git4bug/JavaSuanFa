import java.util.LinkedList;

public class buf {
    public static void main(String[] args) {
        LinkedList<Pair<Integer, Integer>> ll = new LinkedList<>();
        ll.add(new Pair<>(1, 1));
        ll.add(new Pair<>(3, 3));
        ll.add(new Pair<>(4, 5));
        ll.add(new Pair<>(5, 2));
        ll.add(new Pair<>(6, 4));
        ll.add(new Pair<>(7, 0));

        //Pair<Integer, Integer> result = findMaxDifference(ll);
        //System.out.println("Max difference pair: " + result);

        int[] num1 = new int[]{5,1,2,3,4};
        int[] num2 = new int[]{4,4,1,5,1};//1,-3,1,-2,3
        System.out.println(canCompleteCircuit(num1,num2));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i=0;i<n;i++)
        {
            cost[i]=gas[i]-cost[i];
        }
        int allin = 0;
        for (int v:cost)
        {
            allin+=v;
        }
        if (allin<0) return -1;
        for (int i=0;i<n;i++)
        {
            if (cost[i]>0)
            {
                int loop=0;
                allin = 0;
                for (int j=i;loop!=2;j++)
                {
                    //if (cost[j]==0) continue;
                    if (j>=n) j-=n;
                    if (cost[j]==0) continue;
                    if (j==i) loop++;
                    allin+=cost[j];
                    if (allin<0) break;
                }
                if (loop==2) return i;
            }
        }
        return 999;
    }

    public static Pair<Integer, Integer> findMaxDifference(LinkedList<Pair<Integer, Integer>> ll) {
        Pair<Integer, Integer> maxDifferencePair = null;
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 0; i < ll.size() - 1; i++) {
            Pair<Integer, Integer> currentPair = ll.get(i);
            Pair<Integer, Integer> nextPair = ll.get(i + 1);

            int difference1 = nextPair.getFirst() - currentPair.getFirst();
            int difference2 = nextPair.getSecond() - currentPair.getSecond();

            if (difference1 > maxDifference && currentPair.getSecond() < nextPair.getSecond()) {
                maxDifference = difference1;
                maxDifferencePair = new Pair(currentPair, nextPair);
            }
        }
        System.out.println(maxDifference);
        return maxDifferencePair;
    }

    static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
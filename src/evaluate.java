public class evaluate {

    public static void main(String[] args) {
            System.out.println(Eva(3307.847f,1679.238f));
    }

    public static double Eva(float reward,float hard){
        double Evalue = Math.pow(1.425f,reward/1000) * 7.017f + Math.pow(hard,2) / (0.009 * 1000000);
        return Evalue/1649.7;
    }
}

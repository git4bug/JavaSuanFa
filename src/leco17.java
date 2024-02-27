import java.util.HashMap;

public class leco17 {
    public static void main(String[] args) {
        //123
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        //StringBuffer sb = new StringBuffer(s);
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int count = 0;
        Character now=s.charAt(s.length()-1);
        for (int i=s.length()-1;i>=0;i--)
        {
            if (hm.get(now)<hm.get(s.charAt(i)))//first time
            {
                now = s.charAt(i);
                count+=hm.get(s.charAt(i));
                continue;
            }
            if (hm.get(s.charAt(i))<hm.get(now))
                count-=hm.get(s.charAt(i));
            else
                count+=hm.get(s.charAt(i));

        }
        return count;
    }
}

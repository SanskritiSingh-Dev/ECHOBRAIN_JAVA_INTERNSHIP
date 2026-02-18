public class IncreDecre {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int res1 = a++ * --b +5 + --a - ++b + ++a;
        int res2 = a-- - --b + --a - b++ - a++;
        int res3 = a += b++;
        int res4 = ++a *= 2;//not possible because ++a + a*2 is not possible.
        int res5 = a*=2 + b*=3 + --a + b++; //not possible
        System.out.println(a);
        System.out.println(b);
        //System.out.println(res1);
        //System.out.println(res2);
        //System.out.println(res3);
        //System.out.println(res4);
        //System.out.println(res5);
    }

    
}

public class IncreDecre {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int res1 = a++ * --b +5 + --a - ++b + ++a;
        int res2 = a-- - --b + --a - b++ - a++;
        int res3 = a += b++;
        int res4 = (++a) * 2;//increment a first, then multiply by 2
        a *= 2;
        b *= 3;
        int res5 = a + b + --a + b++; //separated compound assignments
        System.out.println(a);
        System.out.println(b);
        //System.out.println(res1);
        //System.out.println(res2);
        //System.out.println(res3);
        //System.out.println(res4);
        //System.out.println(res5);
    }

    
}

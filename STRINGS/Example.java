package STRINGS;

public class Example {
    public static void main(String[] args) {
        String s1 = new String("java programming");
        String s2 = new String("java programming");
        System.out.println(s1 == s2);
        String s3 ="java programming";
        System.out.println(s1 == s2);
        String s4 = "java programming";
        System.out.println(s3 == s4);
        String s5 = "java " + "programming";
        System.out.println(s3 == s5);
        String s6 = "java ";
        String s7 = s6 + "programming"; // this will happen at run time only so s6 is not recognizable for it. so new object will be created.
        System.out.println(s3 == s7);
        final String s8 = "java ";
        String s9 = s8 + "programming";
        System.out.println(s3 == s9);
        System.out.println(s6 == s8);
    }
}

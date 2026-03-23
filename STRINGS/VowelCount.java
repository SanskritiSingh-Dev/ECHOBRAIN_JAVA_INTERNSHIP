package STRINGS;

public class VowelCount {

    public static void main(String[] args) {
        String str = "education";
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int k = 0; k < str.length(); k++) {
            char ch = Character.toLowerCase(str.charAt(k));
            switch (ch) {
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }
        }

        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}

package STRINGS;

public class CharMoreThanOne {

    public static void main(String[] args) {
        String str = "programming";
        char[] arr = str.toCharArray();

        System.out.println("Duplicate characters:");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class Method1 {
    //creating the method
    public static int findMax(int a, int b){
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = findMax(a,b);
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);
    }
    
}
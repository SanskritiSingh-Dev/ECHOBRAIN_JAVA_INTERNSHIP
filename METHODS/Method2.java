//static method
public class Method2 {
    //prime number method
    public static boolean checkPrime(int num){
        for(int i = 2; i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //using the method
        boolean result = checkPrime(5);
        System.out.println(result);
    }
    
}

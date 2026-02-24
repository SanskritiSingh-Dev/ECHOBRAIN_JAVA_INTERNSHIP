//instance method - static keyword is not required.
//they belong to object.
public class Method3 {
     public boolean checkPrime(int num){
        for(int i = 2; i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //using the method - we need to create an object of that class in which the menthod is present
        Method3 m = new Method3();
        //to use the method 
        boolean result = m.checkPrime(5);
        System.out.println(result);
    }


    
}

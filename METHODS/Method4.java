
public class Method4 {

    //method without return type and 0 parameters
    public static void m1(){
        System.out.println("hii..");
    }

    //method without return type and one or more parameters
    public static void m2(String msg){
        System.out.println("given message is : " + msg);
    }

    //method with return type and 0 parameters
    public static int firstPrime(){
        return 2;
    }
    //method with return type and parameter
    public static int add(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
        //calling m1 - we cant store it because it is having return type as void and we cant print it also
        m1();
        //calling m2
        m2("whats up !!!!");
        //calling firstPrime() -  we can store it and also print.
        int res = firstPrime(); //String.valueOf(firstPrime());
        System.out.println(res); //sysout(firstPRime());
        //calling add()
        int res2 = add(2,3);
        System.out.println("adding 2 values: " + res2); // sysout(add(2,3));
    }
}


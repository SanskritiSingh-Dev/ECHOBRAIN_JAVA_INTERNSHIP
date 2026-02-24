// call by value - copy of the data, original data will not change, 
//call by reference - org data will be changed, in case of arrays org value will be changed.


public class Method11 {
    public static void m1(int i){
        i = 100;
    }
    public static void m2(int[] i){
        i[0] = 100;
    }
    public static void main(String[] args) {
        //call by value
        int i = 10;
        m1(i);
        System.out.println(i);

        //call by ref
        int[] arr = new int[]{1,2,3};
        for (int j : arr) {
            System.out.println(j+ " ");
        }
        m2(arr); //calling the method     
        System.out.println();
        for (int k : arr) {
            System.out.println(k+ " ");
        }
    }
    
}

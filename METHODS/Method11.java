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
        //int i = 10;
        int[] arr = new int[]{1,2,3};
        //m1(i);
        for (int j : arr) {
            System.out.println(j+ " ");
        }
        m2(arr); //calling the method 
        //System.out.println(i);
        
        System.out.println();
        for (int k : arr) {
            System.out.println(k+ " ");
        }
    }
    
}

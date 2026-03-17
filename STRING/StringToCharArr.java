//Convert String to char array without using predefined method
package STRING;

public class StringToCharArr {
    public static void main(String[] args) {
        //string 
        String str ="JAVA";
        //char arr
        char[] arr = new char[str.length()];

        //char count
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        //print
        for (char c : arr) {
            System.out.println(c + " ");
            
        }
        
    }
    
}

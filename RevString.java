public class RevString {
    public static void main(String[] args) {
        //reverse a string
        String s = "java";
        int l = s.length(); //traverse
        String res = ""; //to perform concatenation 
        for(int i = l-1; i>=0;i--){
            char ch = s.charAt(i); //gettng the char
            res = res + ch; // concatinating it
        }
        
        System.out.println(res); //printing the res
    }
}

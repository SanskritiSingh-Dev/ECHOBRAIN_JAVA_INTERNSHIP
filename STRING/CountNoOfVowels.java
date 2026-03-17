package STRING;

public class CountNoOfVowels {
    public static void main(String[] args) {
        //string
        String str = "Oaxaca";
        //convert it into one case so that it is easy to find 
        str = str.toUpperCase();
        //vowel count
        int vowel = 0;
        //consonent count
        int conso = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            //check if alphabet or not
            if(c >= 'A' && c <= 'Z'){
                //check if vowlel or not
                if("AEIOU".indexOf(c) != -1){
                    vowel++;
                }
                else{
                    conso++;
                }
            }
        }
        System.out.println("vowel count is "+ vowel);
        System.out.println("Consonent count is "+ conso);
    }
    
}

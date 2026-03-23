package STRINGS;

public class EmailFormatCheck {
    public static void main(String[] args) {
        String email = "examplemail@java.com";
        if(email.contains("@") && email.endsWith(".com")){
            int atPos = email.indexOf('@');
            int dotPos = email.lastIndexOf('.');

            if(atPos > 0 && dotPos > atPos){
                System.out.println(email + "is a vaild email format.");
            }
        }
    }
}

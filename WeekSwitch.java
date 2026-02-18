//this is the change after jdk 14 version
//we can directly assign the value to a variable using switch expression
//we can use -> instead of : and break
// we can assign the var to the switch expression and it will return the value based on the case matched
//we can add , for multiple cases and also we can use default case to handle invalid input

public class WeekSwitch {
    String day = "2";
    // String res = " ";
    String res = switch(day){
        case "1" -> "Monday";
        case "2" -> "Tuesday";
        case "3" -> "Wednesday";
        case "4" -> "Thursday";
        case "5" -> "Friday";
        case "6" -> "Saturday";
        case "7" -> "Sunday";
        default -> "please enter a valid number between 1 to 7";
    };

    public static void main(String[] args) {
        WeekSwitch ws = new WeekSwitch();
        System.out.println(ws.res);
    }
    
}

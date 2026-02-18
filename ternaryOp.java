public class ternaryOp {
    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 6;
        char gender = 'M';
        int age = 20;
        int marks = 76;

        String gradeCheck = (marks >=60)?"Distinction":(marks >= 30)? "Pass class": "Fail class"; 
        System.out.println(gradeCheck);

        String res2 = (age>=18)? "the user is adult" : "oops! the user is minor";
        System.out.println(res2);

        String genderDecide = (gender =='M')? "gender is male" : "gender is female";
        System.out.println(genderDecide);

        String greater = (a>b)? "a is greater":(b>c)? "b is greater": "c i greater";
        System.out.println(greater);

        String res = (a%2==0)? "even": "odd";
        System.out.println(res);

        
        
        
        
        
    }
    
}

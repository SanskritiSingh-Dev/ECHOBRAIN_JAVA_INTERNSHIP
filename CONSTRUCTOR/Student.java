public class Student {
    String rollno;
    String name;
    double marks;
    //object initialization
    public Student(String rollno, String name, double marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println("roll no = " + rollno);
        System.out.println("name = " + name);
        System.out.println("marks = " + marks);
    }
    public static void main(String[] args) {
        Student stu1 = new Student("2KD22Cs079", "Bantu ", 97.45);
        stu1.display();
    }   
}

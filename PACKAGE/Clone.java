package PACKAGE;

public class Clone implements Cloneable {
    int id = 1;
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(2);
        Student s2 = (Student)s1.clone();
        System.out.println(s2.id);
        
        
    }
    
}

class Student implements Cloneable {
    int id = 20;
    Student(int id){
        this.id = id;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

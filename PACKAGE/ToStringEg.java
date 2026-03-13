package PACKAGE;
class Student {
    int id = 10;
    public String toString(){
        return "Student ID: " + id;
    }
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std);
    }
}

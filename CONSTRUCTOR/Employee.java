public class Employee {
    //non static variables
    String name;
    int empId;
    String job;
    double salary;
    long phno; //option for user

    //override constructor - we want this data mandetory.
    public Employee(String name, int empId){
        this.name = name;
        this.empId = empId;
    }

    //default constructor
    public Employee(){

    }
    //local var as parameter in this constructor main const with all parameter
    Employee(String name, int empId, String job, double salary, long phno){
        this.name = name;
        this.empId = empId;
        this.job = job;
        this.salary = salary;
        this.phno = phno; // optional
    }
    //method to display
    public void display(){
        System.out.println("empId: "+ empId);
        System.out.println("Name: " + name);
        System.out.println("Job: "+ job);
        System.out.println("Samalry: "+ salary);
    }


    
}

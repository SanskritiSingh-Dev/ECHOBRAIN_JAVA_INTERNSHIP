public class Employee {
    //non static variables
    String name;
    int empId;
    String job;
    double salary;

    //default constructor
    public Employee(){

    }
    //local var as parameter in this constructor
    Employee(String name, int empId, String job, double salary){
        this.name = name;
        this.empId = empId;
        this.job = job;
        this.salary = salary;
    }
    //method to display
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("empId: "+ empId);
        System.out.println("Job: "+ job);
        System.out.println("Samalry: "+ salary);
    }

    
    
}

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

    //another constructor - if job is decideed but salary is not yet ..
    public Employee(String name, int empId, String job){
        //this.name = name;
        //this.empId = empId;
        this(name, empId); //to access the repeated thing from above const
        this.job = job;
    }

    //local var as parameter in this constructor main const with all parameter
    Employee(String name, int empId, String job, double salary, long phno){
        //this.name = name;
        //this.empId = empId;
        //this.job = job;
        this(name, empId, job); // this call is used
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

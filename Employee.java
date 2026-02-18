public class Employee {
    String name;
    byte age;
    double salary;
    static String company; 
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Jhon";
        e1.age = 21;
        e1.salary = 8000000;

        company = "KPMG";

        Employee e2 = new Employee();
        e2.name = "Alice";
        e2.age = 23;
        e2.salary = 4000000;

        System.out.println("Employee data");
        System.out.println("-----------------------------------");
        System.out.println("Employee 1 : ");
        System.out.println("name: "+ e1.name);
        System.out.println("age: "+ e1.age);
        System.out.println("Salary: "+ e1.salary);
        System.out.println("Company: "+ company);
        System.out.println("-----------------------------------");
        System.out.println("Employee 2 : ");
        System.out.println("name: "+ e2.name);
        System.out.println("age: "+ e2.age);
        System.out.println("Salary: "+ e2.salary);
        System.out.println("Company: "+ company);

        //updation
        Employee.company = "Wipro";

        //adding new employee
        Employee e3 = new Employee();
        e3.name = "Isac";
        e3.age = 29;
        e3.salary = 5000000;

        System.out.println("\n");

        System.out.println("Employee data after changing the company");
        System.out.println("-----------------------------------");
        System.out.println("Employee 1 : ");
        System.out.println("name: "+ e1.name);
        System.out.println("age: "+ e1.age);
        System.out.println("Salary: "+ e1.salary);
        System.out.println("Company: "+ company);
        System.out.println("-----------------------------------");
        System.out.println("Employee 2 : ");
        System.out.println("name: "+ e2.name);
        System.out.println("age: "+ e2.age);
        System.out.println("Salary: "+ e2.salary);
        System.out.println("Company: "+ company);
        System.out.println("-----------------------------------");
        System.out.println("Employee 3 : ");
        System.out.println("name: "+ e3.name);
        System.out.println("age: "+ e3.age);
        System.out.println("Salary: "+ e3.salary);
        System.out.println("Company: "+ company);

        
    }
    
}

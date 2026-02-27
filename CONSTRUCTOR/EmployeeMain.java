public class EmployeeMain {
    public static void main(String[] args) {
        //employee object is created
        //it will check if any employee file is there in the current directoy.
        //no error because we have created the default constructor.

        Employee emp = new Employee("Jibili", 1001, "SDE", 2000000, 8899551123l);
        emp.display();

        System.out.println();

        //user dont want to enter the phno so for this we have other const.
        Employee emp2 = new Employee("Zimbha", 1002); 
        emp2.display();

        System.out.println();

        Employee emp3 = new Employee("jaljal", 1003, "SDE"); 
        emp3.display();
    }
    
}

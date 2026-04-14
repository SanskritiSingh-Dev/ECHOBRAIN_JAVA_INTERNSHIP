package stream_api.filtering_matching;

public class Employees {
    String name;
    double salary;
    String department;
    int age;
    int empId;

    // Constructor
    public Employees(String name, double salary, String department, int age, int empId) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
        this.empId = empId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
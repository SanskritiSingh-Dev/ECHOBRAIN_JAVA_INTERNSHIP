
//package stream_api.filtering_matching;
//find all employees with salary greater than 50000 using stream api
import java.util.ArrayList;
import STREAM_API.Filtering_Matching.Employees;

public class Salary {
    public static void main(String[] args) {
        ArrayList<Employees> emps = new ArrayList<>();
        emps.add(new Employees("Alice", 60000, "IT", 30, 101));
        emps.add(new Employees("Bob", 45000, "HR", 28, 102));
        emps.add(new Employees("Charlie", 70000, "Finance", 35, 103));
        emps.add(new Employees("David", 40000, "IT", 25, 104));
        emps.add(new Employees("Eve", 55000, "HR", 32, 105));

        System.out.println("Employees with salary greater than 50000:");
        emps.stream()
                .filter(e -> e.getSalary() > 50000)
                .toList()
                .forEach(e -> System.out.println(e.getName() + " - $" + e.getSalary()));
    }

}

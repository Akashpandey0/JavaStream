
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class GroupAndPartitionOfEmployee {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
            new Employee("Akash", "IT", 100000),
            new Employee("Bhavin", "HR", 120000),
            new Employee("Chirag", "IT", 90000),
            new Employee("Dinesh", "Finance", 120000),
            new Employee("Esha", "HR", 110000)
        );

        // grouped by department
        Map<String, List<Employee>> groupedByDept = emp.stream()
            .collect(Collectors.groupingBy(e->e.getDepartment()));

        System.out.println("Grouped by Department:");
        groupedByDept.forEach((dept, list) -> {
            System.out.print(dept + ":");
            list.forEach(employee -> System.out.println("  " + employee.getName() + " - " + employee.getSalary()));
        });

        // partitioned by salary > 100000
        Map<Boolean, List<Employee>> partitionedBySalary = emp.stream()
            .collect(Collectors.partitioningBy(e -> e.getSalary() > 100000));

        System.out.println("\nPartitioned by Salary > 100000:");
        partitionedBySalary.forEach((isHighSalary, list) -> {
            String key = isHighSalary ? "Salary > 100000" : "Salary <= 100000";
            System.out.print(key + ":");
            list.forEach(employee -> System.out.println("  " + employee.getName() + " - " + employee.getSalary()));
        });
    }
}

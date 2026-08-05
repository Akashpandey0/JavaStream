import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
   public static void main(String[] args) {

   List<Employee> employees = Arrays.asList(
           new Employee("Alice", 50000),
           new Employee("Bob", 60000),
           new Employee("Charlie", 70000)
       );

   Optional<Double> secondHighestSalary = employees.stream()
   .map(Employee::getSalary)
   .distinct()
   .sorted(Comparator.reverseOrder())
   .skip(1)
   .findFirst();

   if(secondHighestSalary.isPresent()) {
       System.out.println("Second Highest Salary: " + secondHighestSalary.get());
}
    if(secondHighestSalary.isPresent()) {
      double target = secondHighestSalary.get();

      List<Employee> secondHighestEmployees = employees.stream()
          .filter(e -> e.getSalary() == target)
          .toList();
        System.out.println("Employees with the second highest salary:");
        secondHighestEmployees.forEach(System.out::println);
}

   }

}

class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return name + ": " + salary;
    }
}


//import java.util.Arrays;
//import java.util.List;
//
//class Employee {
//    private String name;
//    private double salary;
//    public Employee(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//    public String getName() {
//        return name;
//    }
//    public double getSalary() {
//        return salary;
//    }
//    @Override
//    public String toString() {
//        return name + ": " + salary;
//    }
//}
//    public class IncreaseSalary {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//            new Employee("Alice", 50000),
//            new Employee("Bob", 60000),
//            new Employee("Charlie", 70000)
//        );
//
//        List<Employee> updatedSalaries = employees.stream()
//            .map(e -> new Employee(e.getName(), e.getSalary() * 1.10))
//            .toList();
//
//        System.out.println("Before: ");
//        employees.stream().forEach(System.out::println);
//
//        System.out.printf("\nAfter: \n");
//        updatedSalaries.forEach(s -> System.out.println(s.getName() + " -> " + s.getSalary()));
//
//    }
//}

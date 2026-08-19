import java.util.Arrays;
import java.util.List;

public class EmployeeFilter {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Raj", "Amit", "John", "Sam", "Michael", "raj", "Amit", "JOHN");
        List<String> filteredEmployees = filterEmployees(employees);
        int originalCount = employees.size();
        int filteredCount = filteredEmployees.size();
        System.out.println(filteredEmployees);

        System.out.println("Names Removed: " + (originalCount - filteredCount));
    }

    public static List<String> filterEmployees(List<String> employees) {
        return employees.stream()
                .filter(name -> name.length() > 3)
                .map(String::toLowerCase)
                .distinct()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase())
                .toList();
    }
}

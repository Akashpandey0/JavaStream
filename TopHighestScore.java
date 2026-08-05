import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class TopHighestScore {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 92),
            new Student("Charlie", 92),
            new Student("David", 95),
            new Student("Eve", 91)
        );

        List<Student> topThreeStudents = students.stream()
            .sorted(Comparator.comparing(Student::getScore).reversed())
            .limit(3)
            .collect(Collectors.toList());

        topThreeStudents.forEach(student -> 
            System.out.println(student.getName() + ": " + student.getScore())
        );
    }
}

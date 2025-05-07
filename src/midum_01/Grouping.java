package midum_01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String getGrade() {
        return grade;
    }

    public String toString() {
        return name;
    }
}

public class Grouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", "10"), new Student("B", "9"), new Student("C", "10")
        );

        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        System.out.println(map);
    }
}

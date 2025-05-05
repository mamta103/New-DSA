package equalsandhashcode.equals;

import java.util.HashSet;
import java.util.Set;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


}

public class WithoutOverridingEqualsHashCode {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(1, "Alice")); //Duplicate Student

        System.out.println("Total Student :"+ students.size()); // Output: 3 (Incorrect) because memory address is considered

    }
}

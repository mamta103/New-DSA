package ComputeIfAbsent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentExample {
    public static void main(String[] args) {
        Map<String, List<String>> studentCourses = new HashMap<>();
        // Automatically create a new list if the student is not present
        studentCourses.computeIfAbsent("John", k -> new ArrayList<>()).add("Math");
        studentCourses.computeIfAbsent("John", k -> new ArrayList<>()).add("Science");
        studentCourses.computeIfAbsent("Emma", k -> new ArrayList<>()).add("English");

    }
}

package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

// ✅ Usage Example
public class ImmutableExample {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Cycling");

        Person person =new Person("Alice", 25, hobbies);
        System.out.println(person); // Before Attempted Modification

        // Attempting to modify hobbies (Will not affect Person class)
        hobbies.add("Swimming");
        System.out.println(person); // List remains unchanged

        person.getHobbies().add("Dancing");
        System.out.println(person);


    }
}

package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person{
    private  String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
public class HashBasedCollections {
    public static void main(String[] args) {
        Map<Person,String > map1 = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Alice",1);

        map1.put(p1,"Engineer");
        System.out.println(" map1.get(p2) : "+ map1.get(p2));;

    }
}

package equalsandhashcode.equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employe{
    int id;
    String name;

    public Employe(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employe employe)) return false;
        return id == employe.id && Objects.equals(name, employe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
public class WithoutEqualsOverride {
    public static void main(String[] args) {
        Employe e1 = new Employe(1, "Alice");
        Employe e2 = new Employe(1, "Alice");

        Set<Employe> employees=new HashSet<>();
        employees.add(e1);
        employees.add(e2);
//        employees.add(new Employe(1, "Alice") );
//        System.out.println(e1.equals(e2));// false (compares memory addresses)
//        System.out.println(employees.contains(new Employe(1, "Alice")));
        System.out.println(employees.size());
    }

    }


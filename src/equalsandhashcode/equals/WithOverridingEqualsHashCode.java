package equalsandhashcode.equals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Actor {
    int id;
    String name;

    public Actor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Actor actor)) return false;
        return id == actor.id && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class WithOverridingEqualsHashCode {
    public static void main(String[] args) {
        Set<Actor> actors = new HashSet<>();

        actors.add(new Actor(1, "Alice"));
        actors.add(new Actor(2, "Bob"));
        actors.add(new Actor(1, "Alice")); //Duplicate Student

        System.out.println("Total actors :"+ actors.size());
    }
}

package equalsandhashcode.equals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Model {
    int id;
    String name;

    public Model(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ModelWithoutEqualsHashCode {
    public static void main(String[] args) {
        Map<Model, String> modelMap = new HashMap();
        Model m1 = new Model(1, "Alice");
        Model m2 = new Model(1, "Alice");

        modelMap.put(m1, "Shows Stooper");
        modelMap.put(m2, "Regualr Model");// Another entry!

        System.out.println("Size of map: " + modelMap.size());





    }
}

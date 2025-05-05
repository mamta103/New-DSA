package equalsandhashcode.equals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MaleModel {
    int id;
    String name;

    public MaleModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MaleModel maleModel)) return false;
        return id == maleModel.id && Objects.equals(name, maleModel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class ModelWithqualsHashCode {
    public static void main(String[] args) {
        Map<MaleModel, String> maleModelStringMap  = new HashMap<>();
        MaleModel maleModel1 = new MaleModel(1, "Alice");
        MaleModel maleModel2 = new MaleModel(1, "Alice");
        maleModelStringMap.put(maleModel1, "Shows Stopper");
        maleModelStringMap.put(maleModel2, "Regular Model");

        System.out.println("Size of map: " + maleModelStringMap.size());
    }
}

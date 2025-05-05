package ImmutableClass;

import diamondProlem.A;

// Step 1: Declare class as final
public final class ImmutableEmployee {

    // Step 2: Make fields private and final
    private final int id;
    private final String name;
    private final Address address;// Mutable object

    // Step 3: Initialize fields in constructor

    public ImmutableEmployee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        // Step 5: Deep copy to prevent modification of original reference
        this.address = new Address(address.getCity(), address.getState());
    }


    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

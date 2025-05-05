package ImmutableClass;

public class ImmutableTest {
    public static void main(String[] args) {
        Address address = new Address("Bangalore","Karnataka");

        ImmutableEmployee immutableEmployee = new ImmutableEmployee(1, "MK",address);

        System.out.println(immutableEmployee); // Before modification

        // Trying to modify address
        // Trying to modify address
        address.city = "Mumbai"; // Won't affect ImmutableEmployee

        System.out.println(immutableEmployee);
    }
}

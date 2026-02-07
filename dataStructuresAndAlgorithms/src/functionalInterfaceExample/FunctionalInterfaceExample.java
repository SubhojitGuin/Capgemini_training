package functionalInterfaceExample;

@FunctionalInterface
public interface FunctionalInterfaceExample { // allows only one abstract method

    void add(); // abstract method

    // but allows abstract method of the Object class as it extends the Object class
    boolean equals(Object o);
    int hashCode();
    String toString();

    static void print() {
        System.out.println("Functional Interface");
    }

    private void some() {
        System.out.println("Private method");
    }

    default void method() {
        System.out.println("Default method");
        some();
    }
}

package other;

interface Parent {
    static void parent() {
        System.out.println("Parent");
    }
}

public class Child implements Parent {
    public static void main(String[] args) {
//        Child.parent(); not allowed to inherit interface's static methods
        Parent.parent();
    }
}

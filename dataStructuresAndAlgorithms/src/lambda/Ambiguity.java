package lambda;

public class Ambiguity {

    public static void main(String[] args) {

    }

}

interface A {

    default void add() {
        System.out.println("A");
    }

}

interface B {
    default void add() {
        System.out.println("B");
    }
}

class C implements A, B {

    @Override
    public void add() {
        B.super.add();
    }
}
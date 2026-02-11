package lambda;

public abstract class Parent {

    abstract void function(Number number);

    abstract void function(Integer number);

}

class Child extends Parent {

    @Override
    public void function(Number number) {
        System.out.println("Number " + number);
    }

    @Override
    public void function(Integer number) {
        System.out.println("Integer " + number);
    }

}

class Main {
    public static void main(String[] args) {
//        Parent parent = new Child();
        Parent parent = new Parent() {
            @Override
            public void function(Number number) {
                System.out.println("Number " + number);
            }

            @Override
            public void function(Integer number) {
                System.out.println("Integer " + number);
            }
        };
        parent.function(4);
        parent.function(4.8);
    }
}
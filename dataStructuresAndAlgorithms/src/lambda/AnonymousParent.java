package lambda;

interface AnonymousParent {

    void function(Number number);

}

class AnonymousChild implements AnonymousParent {

    @Override
    public void function(Number number) {
        System.out.println("Number " + number);
    }
}

class AnonymousMain {
    public static void main(String[] args) {
        AnonymousParent parent = new AnonymousChild();
        parent.function(4);

        AnonymousParent parent1 = new AnonymousParent() {
            @Override
            public void function(Number number) {
                System.out.println("Anonymous number " + number);
            }
        };

        parent1.function(5);

        AnonymousParent parent2 = number -> System.out.println("Lambda number " + number);
        parent2.function(5);
    }
}

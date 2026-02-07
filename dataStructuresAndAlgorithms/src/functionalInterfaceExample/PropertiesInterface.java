package functionalInterfaceExample;

@FunctionalInterface
public interface PropertiesInterface {

//    void perform();
    int perform(int num);
}

class Main implements PropertiesInterface {

    @Override
    public int perform(int num) {
        System.out.println("Performing task");
        return 0;
    }

}

class Anonymous {

    public static void main(String[] args) {
        PropertiesInterface propertiesInterface = new PropertiesInterface() { // anonymous class
            @Override
            public int perform(int num) {
                System.out.println("Performing anonymous class");
                return 0;
            }
        };

        propertiesInterface.perform(5);

//        PropertiesInterface pp = () -> System.out.println("Performing lambda");
        PropertiesInterface pp = num -> num * num; // lambda expressions can work with only Functional interfaces
        System.out.println(pp.perform(6));
    }

}
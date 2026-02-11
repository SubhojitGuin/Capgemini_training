package lambda;

public class LambdaSample {

    public LambdaSample() {
        System.out.println("LambdaSample constructor");
    }

    {
        System.out.println("LambdaSample non-static()");
    }

    static {
        System.out.println("LambdaSample static()");
    }

    public static void main(String[] args) {
        System.out.println("Main");

        LambdaSample lambdaSample = new LambdaSampleChild(); // Object Loading process is happening here.
    }

}

class LambdaSampleChild extends LambdaSample {

    public LambdaSampleChild() {
        System.out.println("LambdaSampleChild constructor");
    }

    {
        System.out.println("LambdaSampleChild non-static()");
    }

    static {
        System.out.println("LambdaSampleChild static()");
    }

}

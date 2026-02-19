package dsaRevision3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);

        Box<Integer> box = new Box<>();
        box.setValue(10);
        System.out.println(box.getValue());
    }

}

class Box<N extends Number> {
    N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}
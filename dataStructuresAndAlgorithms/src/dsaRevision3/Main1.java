package dsaRevision3;

interface Compare<T> {
    int compare(T a, T b);
}

interface KeyExtractor<T, K> {
    K extract(T obj);
}

class Comparator {
    static int compare(Object a, Object b) {
        if (a == b) return 0;
        if (a == null) return -1;
        if (b == null) return 1;

        if (a instanceof Integer && b instanceof Integer) {
            return (int) a - (int) b;
        }

        if (a instanceof String s1 && b instanceof String s2) {
            int len = Math.min(s1.length(), s2.length());
            for (int i = 0; i < len; i++) {
                int diff = s1.charAt(i) - s2.charAt(i);
                if (diff != 0)
                    return diff;
            }
            return s1.length() - s2.length();
        }

        throw new RuntimeException("Unsupported Type");
    }
}

// For an interface, it is possible to create a variable but not an object.
class Sorter<T> {
    T[] arr;
    KeyExtractor<T, ?> extractor; // ? is wildcard operator
    boolean ascending = true;

    public Sorter(T[] arr, KeyExtractor<T, ?> extractor) {
        this.arr = arr;
        this.extractor = extractor;
    }

    Sorter<T> asc() {
        ascending = true;
        sort();
        return this;
    }

    Sorter<T> desc() {
        ascending = false;
        sort();
        return this;
    }

    public void sort() {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Object v1 = extractor.extract(arr[j]);
                Object v2 = extractor.extract(arr[j + 1]);
                int cmp = Comparator.compare(v1, v2);

                if ((ascending && cmp > 0) || (!ascending && cmp < 0)) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class ArrayWrapper<T> {
    T[] arr;

    public ArrayWrapper(T[] arr) {
        this.arr = arr;
    }

    Sorter<T> sort(KeyExtractor<T, ?> extractor) {
        return new Sorter<>(arr, extractor);
    }
}

class Student2 {
    int id;
    String name;
    int age;

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student2[] students = {
                new Student2(1, "Dharani", 23),
                new Student2(2, "Arjun", 21),
                new Student2(3, "Bala", 25),
        };

        ArrayWrapper<Student2> arrayWrapper = new ArrayWrapper<>(students);
        arrayWrapper.sort(s -> s.name).asc();

        for (Student2 s: students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
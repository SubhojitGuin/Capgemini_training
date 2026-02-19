package dsaRevision3;

public class Student {
    int id;
    String name;
    int[] marks;

    public Student(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class CompareUtil {
    static boolean compareString(String s1, String s2) {
        if (s1 == null && s2 == null) return true;
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    static boolean compareIntArray(int[] a, int[] b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    static boolean compareStudent(Student s1, Student s2) {
        if (s1 == s2) return true;
        if (s1 == null || s2 == null) return false;
        if (s1.id != s2.id) return false;
        if (!compareString(s1.name, s2.name)) return false;
        return compareIntArray(s1.marks, s2.marks);
    }
}

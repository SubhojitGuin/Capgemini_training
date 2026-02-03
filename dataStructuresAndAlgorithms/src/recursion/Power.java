package recursion;

public class Power {

    public static int getPower(int a, int n) {
        if (a == 1 || n == 1) return a;

        if (n % 2 == 1) return a * getPower(a * a, n / 2);
        else return getPower(a * a, n / 2);
    }

    public static void main(String[] args) {
        System.out.println(getPower(2, 3));
    }
}

package learnString;

public class StringManipulation {

    public static void main(String[] args) {

        String s1 = "Hi";
        String s2 = new String("Hi");
        String s3 = s2;

        System.out.println(s1 == s2);
        System.out.println(s3 == s2);

        String s4 = "Java";
        s1.concat(" Programming");
        System.out.println(s1);
    }

}

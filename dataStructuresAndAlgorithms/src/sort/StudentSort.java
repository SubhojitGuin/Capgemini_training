package sort;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class StudentSort {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Dinga", "dinga@gmail.com", "male", LocalDate.of(2004, Month.JANUARY, 23)),
                new Student(5, "Dingi", "dingi@gmail.com", "female", LocalDate.of(2004, Month.DECEMBER, 24)),
                new Student(4, "Dingu", "dingu@gmail.com", "male", LocalDate.of(2004, Month.JULY, 20)),
                new Student(6, "Dingus", "dingus@gmail.com", "female", LocalDate.of(2004, Month.NOVEMBER, 1)),
                new Student(3, "Dingo", "dingo@gmail.com", "male", LocalDate.of(2004, Month.MARCH, 23)),
                new Student(2, "Dinge", "dinge@gmail.com", "female", LocalDate.of(2004, Month.MAY, 1))
        };

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println("\n======================= sorted based on id ===========================\n");

        Arrays.sort(students);

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println("\n======================= sorted based on name ===========================\n");

        Arrays.sort(students, new StudentNameComparator());

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println("\n======================= sorted based on dob ===========================\n");

        Arrays.sort(students,
                (Student s1, Student s2) -> s1.getDob().compareTo(s2.getDob()));

//        System.out.println(Arrays.toString(students));`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               h                       `
        for (Student student: students) {
            System.out.println(student);
        }
    }

}
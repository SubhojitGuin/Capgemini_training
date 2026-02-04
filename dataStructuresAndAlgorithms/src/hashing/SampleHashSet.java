package hashing;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Iterator;

public class SampleHashSet {

    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(1, "Mark", "male", LocalDate.of(1990, Month.JANUARY, 25), 3, "mark@gmail.com", 9875631483L));
        employees.add(new Employee(2, "Julie", "female", LocalDate.of(1993, Month.JANUARY, 20), 3, "julie@gmail.com", 9875634323L));
        employees.add(new Employee(3, "Aisha", "female", LocalDate.of(1988, Month.MARCH, 3), 5, "aisha@example.com", 9012345678L));
        employees.add(new Employee(4, "Carlos", "male", LocalDate.of(1992, Month.JULY, 14), 2, "carlos@example.com", 9123456780L));
        employees.add(new Employee(5, "Satoshi", "male", LocalDate.of(1985, Month.DECEMBER, 1), 10, "satoshi@example.com", 9234567890L));
        employees.add(new Employee(6, "Priya", "female", LocalDate.of(1997, Month.MAY, 30), 1, "priya@example.com", 9345678901L));
        employees.add(new Employee(7, "Eleni", "female", LocalDate.of(1990, Month.SEPTEMBER, 9), 4, "eleni@example.com", 9456789012L));
//        employees.add(new Employee(7, "Elenaa", "male", LocalDate.of(1990, Month.SEPTEMBER, 9), 4, "eleni@example.com", 9456789012L)); If equals() and hashCode() uses only employeeId, this will consider them as same object and skip overwriting or adding of the new element

        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println("=================================================");

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println("=================================================");

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=================================================");

//        employees.forEach(System.out::println);
        employees.forEach(employee -> System.out.println(employee));

        System.out.println("=================================================");


    }

}

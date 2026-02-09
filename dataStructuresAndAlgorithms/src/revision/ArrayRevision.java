package revision;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

public class ArrayRevision {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1, "Name1", "name1@gmail.com", 1, LocalDate.of(1921, Month.DECEMBER, 12), LocalTime.of(12, 30), 1234567890L),
                new Employee(2, "Name2", "name2@gmail.com", 2, LocalDate.of(1922, Month.JANUARY, 1), LocalTime.of(9, 0), 2345678901L),
                new Employee(3, "Name3", "name3@gmail.com", 3, LocalDate.of(1985, Month.MARCH, 15), LocalTime.of(10, 15), 3456789012L),
                new Employee(4, "Name4", "name4@gmail.com", 4, LocalDate.of(1990, Month.APRIL, 20), LocalTime.of(14, 45), 4567890123L),
                new Employee(5, "Name5", "name5@gmail.com", 5, LocalDate.of(2000, Month.MAY, 5), LocalTime.of(8, 5), 5678901234L),
                new Employee(6, "Name6", "name6@gmail.com", 6, LocalDate.of(1975, Month.JUNE, 30), LocalTime.of(16, 20), 6789012345L),
        };

        System.out.println(Arrays.toString(employees));

        // Arrays.asList(employees) - gives an immutable list, any modification gives UnsupportedOperationException
//        List<Employee> list = new ArrayList<>(Arrays.asList(employees));

        ArrayRevision obj = new ArrayRevision();
        List<Employee> list = obj.getSortedEmployee(employees);
        for (Employee emp: list) {
            System.out.println(emp);
        }

        List<List<String>> data = new ArrayList<>();

        data.add(List.of("201", "Zayan", "zayan@gmail.com", "4", "1997-11-23", "09:40", "9876543210"));
        data.add(List.of("202", "Meera", "meera@gmail.com", "2", "2001-06-14", "07:20", "9123456789"));
        data.add(List.of("203", "Arjun", "arjun@gmail.com", "6", "1995-03-02", "10:05", "9988776655"));
        data.add(List.of("204", "Kavya", "kavya@gmail.com", "3", "1997-11-23", "06:50", "8899001122"));
        data.add(List.of("205", "Ishaan", "ishaan@gmail.com", "5", "1999-09-18", "08:30", "9001122334"));
        data.add(List.of("206", "Ritika", "ritika@gmail.com", "1", "2001-06-14", "09:10", "9011223344"));

        getSortedList(data).forEach(System.out::println);
    }

    public List<Employee> getSortedEmployee(Employee[] employees) {

//        Arrays.sort(employees, (e1, e2) -> {
//            int compareDob = e1.getDateOfBirth().compareTo(e2.getDateOfBirth());
//            if (compareDob != 0) return compareDob;
//            return e1.getTimeOfBirth().compareTo(e2.getTimeOfBirth());
//        });
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));

        Comparator<Employee> dateOfBirth = (e1, e2) -> e1.getDateOfBirth().compareTo(e2.getDateOfBirth());
        Comparator<Employee> timeOfBirth = (e1, e2) -> e1.getTimeOfBirth().compareTo(e2.getTimeOfBirth());

        Collections.sort(employeeList, dateOfBirth.thenComparing(timeOfBirth).thenComparing((e1, e2) -> e1.getExperience()-e2.getExperience()));

//        employeeList.sort(Comparator.comparing(Employee::getDateOfBirth).thenComparing(Employee::getTimeOfBirth));
        return employeeList;
    }

    public static List<List<String>> getSortedList(List<List<String>> employees) {
//        employees.sort((e1, e2) -> {
//            LocalDate e1date = LocalDate.parse(e1.get(4));
//            LocalTime e1time = LocalTime.parse(e1.get(5));
//            LocalDateTime e1dateTime = LocalDateTime.of(e1date, e1time);
//
//            LocalDate e2date = LocalDate.parse(e2.get(4));
//            LocalTime e2time = LocalTime.parse(e2.get(5));
//            LocalDateTime e2dateTime = LocalDateTime.of(e2date, e2time);
//
//            return e1dateTime.compareTo(e2dateTime);
//        });

        Comparator<List<String>> dateOfBirth = (e1, e2) -> LocalDate.parse(e1.get(4)).compareTo(LocalDate.parse(e2.get(4)));
        Comparator<List<String>> timeOfBirth = (e1, e2) -> LocalTime.parse(e1.get(5)).compareTo(LocalTime.parse(e2.get(5)));
        employees.sort(dateOfBirth.thenComparing(timeOfBirth));

        return employees;


    }

}

package dsaRevision2.dev;

import java.util.Scanner;

public class EmployeeDemo {
    public static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        EmployeeService oprs = new EmployeeService();

        int choice = 0;

        oprs.createTable();
        do {
            System.out.println("""
                    \n
                    1. Add Employee
                    2. Delete Employee
                    3. Update Employee
                    4. Search Employee
                    5. Display all Employees
                    6. Exit
                    \n
                    """);
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    oprs.addEmployee();
                }
                break;
                case 2: {
                    oprs.deleteEmployee();
                }
                break;
                case 3: {
                    oprs.updateEmployee();
                }
                break;
                case 4: {
                    oprs.searchEmployee();
                }
                break;
                case 5: {
                    oprs.listAllEmployees();
                }
                break;
                case 6: {
                    choice = 0;
                }
                break;
                default:
                    System.out.println("Invalid Choice given");
            }
        } while (choice != 0);

        System.out.println("End of the program");
        scanner.close();
    }
}

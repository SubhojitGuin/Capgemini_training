package dsaRevision2.dev;

public class EmployeeService {

    private EmployeeDAO dao;

    {
        dao = new EmployeeDAO();
    }

    public void addEmployee() {
        dao.createEmployee();
    }

    public void searchEmployee() {
        System.out.println("Enter the id of the employee to be searched");
        int id = EmployeeDemo.scanner.nextInt();
        dao.searchEmployeeById(id);
    }

    public void deleteEmployee() {
        System.out.println("Enter the id of the employee to be deleted: ");
        int id = EmployeeDemo.scanner.nextInt();
        dao.deleteEmployee(id);
    }

    public void updateEmployee() {
        System.out.println("Enter the id of the employee to be updated: ");
        int id = EmployeeDemo.scanner.nextInt();
        System.out.println("Enter the new salary of the employee: ");
        float newSalary = EmployeeDemo.scanner.nextFloat();
        dao.updateEmployee(id, newSalary);
    }

    public void listAllEmployees() {
        dao.listAllEmployees();
    }

    public void createTable() {
        dao.createTable();
    }

}

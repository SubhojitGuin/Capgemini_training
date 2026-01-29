package collectionFramework.programs;

import java.util.*;

class IdComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {	
//		return e1.name.compareTo(e2.name);
//		return e2.id - e1.id; // descending
		return e1.id - e2.id; // ascending
	}

}

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		

		empList.add(new Employee(2, "Dingi", 200));
		empList.add(new Employee(1, "Dinga", 100));
		empList.add(new Employee(3, "Dingu", 300));
		
		
//		empList.sort((a, b) -> a.id - b.id);
//		empList.sort(new IdComparator());
		Comparator<Employee> comp = (e1, e2) -> e1.id - e2.id;
//		empList.sort(comp);
		Collections.sort(empList, comp);
//		Collections.sort(empList, (e1, e2) -> e1.id - e2.id);
//		Collections.sort(empList, new IdComparator());
		
		for (Employee e: empList) {
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println();
		}
	}

}

package objectOrientedProgramming.abstraction.interfaceKeyword.example3;

public class PersonDriver {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setTransport(new Bus());
		p.print();
		
		System.out.println();
		p.setTransport(new Metro());
		p.print();
		
		System.out.println();
		p.setTransport(new Cab());
		p.print();
	}
	
}

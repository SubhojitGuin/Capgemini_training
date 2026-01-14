package objectOrientedProgramming.encapsulation.example2;

public class Driver {
	public static void main(String[] args) {
//		Trainer t = new Trainer();
//		t.setId(1);
//		t.setName("Raju");
//		t.setPassword("abc");
		
		Trainer t = new Trainer(1, "Raju", "abc");
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPassword());
	}
}

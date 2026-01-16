package objectOrientedProgramming.inheritence.constructorChaining;

public class Child extends Parent {
	
	long phone;
	
//	public Child() {
//		super();
//	}
	
	public Child(String name, long phone) {
		// super() [no args] is called by default if it is not mentioned
		super(name); // Used to call the parent constructor and initialize the parent class states
		this.phone = phone;
	}
	
	public static void main(String[] args) {
		Child c = new Child("Raju", 123456789L);
		
		System.out.println(c.name);
		System.out.println(c.phone);
	}
}

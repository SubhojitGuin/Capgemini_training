package accessModifiers.singletonExample.example1;

public class SingletonLazyExample {
	
	private static SingletonLazyExample obj;
	
	private SingletonLazyExample() {
		
	}
	
	public static SingletonLazyExample getObject() {
		if (obj == null) {
			obj = new SingletonLazyExample();
		}
		
		return obj;
	}

}

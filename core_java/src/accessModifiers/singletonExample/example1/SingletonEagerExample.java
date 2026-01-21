package accessModifiers.singletonExample.example1;

public class SingletonEagerExample {
	
	private static SingletonEagerExample obj = new SingletonEagerExample();
	
	private SingletonEagerExample() {
		
	}
	
	public static SingletonEagerExample getObject() {
		return obj;
	}

}

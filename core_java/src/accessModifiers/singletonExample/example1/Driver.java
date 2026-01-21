package accessModifiers.singletonExample.example1;

public class Driver {
	
	public static void main(String[] args) {
		SingletonLazyExample obj1 = SingletonLazyExample.getObject();
		System.out.println(obj1);
		
		SingletonLazyExample obj2 = SingletonLazyExample.getObject();
		System.out.println(obj2);		
		
		SingletonLazyExample obj3 = SingletonLazyExample.getObject();
		System.out.println(obj3);		
		
		SingletonLazyExample obj4 = SingletonLazyExample.getObject();
		System.out.println(obj4);		
		
		SingletonEagerExample obj5 = SingletonEagerExample.getObject();
		System.out.println(obj5);
		
		SingletonEagerExample obj6 = SingletonEagerExample.getObject();
		System.out.println(obj6);
		
		SingletonEagerExample obj7 = SingletonEagerExample.getObject();
		System.out.println(obj7);
		
		SingletonEagerExample obj8 = SingletonEagerExample.getObject();
		System.out.println(obj8);
	}

}

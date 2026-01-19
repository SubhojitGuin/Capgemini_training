package objectOrientedProgramming.abstraction.interfaceKeyword;

public interface Calci {
	
	int add(int a, int b); // interface will add `public abstract` automatically to non-static methods
	int sub(int a, int b);
	int multi(int a, int b);
	public abstract void m1(); // public is set by default
//	protected abstract void m3(); CTE - protected is not allowed
//	private abstract void m4(); CTE - private is not allowed
	
}

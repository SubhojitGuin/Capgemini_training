package objectOrientedProgramming.abstraction.abstractKeyword;

public abstract class Calculator {
	public abstract int add(int a, int b);
	
	public abstract int multi(int a, int b);
	
	public int sub(int a, int b) {
		return a - b;
	}
}

package objectOrientedProgramming.abstraction.abstractKeyword;

public abstract class Shape {
	
	public abstract double area(int side);
	
	{
		System.out.println("Shape non-static block");
	}
	
	static {
		System.out.println("Shape static block");
	}
	
	public void display(int side) {
		System.out.println("The area is = " + area(side));
	}

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.display(5);
		
		Shape rect = new Rectangle();
		rect.display(5);
	}

}

class Circle extends Shape {

	@Override
	public double area(int side) {
		return 3.14 * side * side;
	}
	
}

class Rectangle extends Shape {
	
	@Override
	public double area(int side) {
		return side * side;
	}
	
}
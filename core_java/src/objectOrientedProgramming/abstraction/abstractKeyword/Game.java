package objectOrientedProgramming.abstraction.abstractKeyword;

// template pattern
public abstract class Game {
	
	public abstract void start();
	
	public abstract void end();
	
	public void play() {
		start();
		
		System.out.println("Playing");
		
		end();
	}
	
	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		
		Game football = new Football();
		football.play();
	}
	
}

class Cricket extends Game {

	@Override
	public void start() {
		System.out.println("Cricket started");
	}

	@Override
	public void end() {
		System.out.println("Cricket ended");
	}
	
}

class Football extends Game {
	
	@Override
	public void start() {
		System.out.println("Football started");
	}

	@Override
	public void end() {
		System.out.println("Football ended");
	}
	
}
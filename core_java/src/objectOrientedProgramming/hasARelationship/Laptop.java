package objectOrientedProgramming.hasARelationship;

public class Laptop {
	
	private Battery battery; // strong - composition
	private LaptopCover laptopCover; // weak - aggregation
	
	Laptop() {
		battery = new Battery();
	}
	
	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public LaptopCover getLaptopCover() {
		return laptopCover;
	}

	public void setLaptopCover(LaptopCover laptopCover) {
		this.laptopCover = laptopCover;
	}

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.getBattery().charge();
		laptop.setLaptopCover(new LaptopCover());
		laptop.getLaptopCover().color();
	}
}

class Battery {
	public void charge() {
		System.out.println("95% charge left");
	}
}

class LaptopCover {
	public void color() {
		System.out.println("Black");
	}
}
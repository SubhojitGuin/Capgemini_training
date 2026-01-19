package objectOrientedProgramming.hasARelationship;

public class Human {
	
	private Heart heart; // strong relationship - composition - always not null
	private Address address; // weak relationship - aggregation - can be null
	
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Human() {
		heart = new Heart(); // Always created when a human object is created
	}
	
	public static void main(String[] args) {
		Human human = new Human();
		human.getHeart().pump();
		human.setAddress(new Address());
		human.getAddress().location();
	}
	
}

class Heart {
	
	public void pump() {
		System.out.println("Heart is pumping");
	}
	
}

class Address {
	
	public void location() {
		System.out.println("India");
	}
	
}
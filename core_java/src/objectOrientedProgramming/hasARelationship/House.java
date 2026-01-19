package objectOrientedProgramming.hasARelationship;

public class House {
	
	private Room room; // strong - composition
	private People people; // weak - aggregation
	
	public House() {
		room = new Room();
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}

	public static void main(String[] args) {
		House house = new House();
		house.getRoom().size();
		house.setPeople(new People());
		house.getPeople().age();
	}

}

class Room {
	
	public void size() {
		System.out.println("200 sq. ft");
	}
	
}

class People {
	
	public void age() {
		System.out.println("22 years");
	}
	
}
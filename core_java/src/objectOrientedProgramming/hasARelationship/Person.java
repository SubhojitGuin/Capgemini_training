package objectOrientedProgramming.hasARelationship;

// HAS A Relationship - Composition
public class Person {
	
	String name;
	PanCard panCard;
	
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Dinga";
		
		PanCard card = new PanCard();
		card.panId = "ABC123";
		card.dob = "14/04/2001";
		
		person.panCard = card;
		
		System.out.println(person.name);
		System.out.println(person.panCard.panId);
		System.out.println(person.panCard.dob);
	}

}

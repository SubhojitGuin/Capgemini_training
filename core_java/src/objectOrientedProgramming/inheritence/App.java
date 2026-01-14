package objectOrientedProgramming.inheritence;

public class App {
	String type;
	String origin;
	
	public App() {
		
	}
	
	public App(String type, String origin) {
		this.origin = origin;
		this.type = type;
	}
	
	public static void main(String[] args) {
		App a = new App("Indian", "Email");
		System.out.println(a.type);
		System.out.println(a.origin);
		
		Whatsapp w = new Whatsapp("Messaging", "USA", 100, "SubhojitGuin");
		System.out.println(w.type);
		System.out.println(w.origin);
		System.out.println(w.noOfContacts);
		System.out.println(w.profileName);
	}
}

class Whatsapp extends App {
	int noOfContacts;
	String profileName;
	
	public Whatsapp() {
		
	}
	
	public Whatsapp(String type, String origin, int noOfContacts, String profileName) {
		this.type = type;
		this.origin = origin;
		this.noOfContacts = noOfContacts;
		this.profileName = profileName;
	}
}

package objectOrientedProgramming.inheritence.multiLevel;

public class WhatsappV1 {
	public void chat() {
		System.out.println("Chatting with friend...");
	}
	
	public static void main(String[] args) {
		WhatsappV1 wv1 = new WhatsappV1();
		wv1.chat();
		
		System.out.println();
		WhatsappV2 wv2 = new WhatsappV2();
		wv2.chat();
		wv2.status();
		
		System.out.println();
		WhatsappV3 wv3 = new WhatsappV3();
		wv3.chat();
		wv3.status();
		wv3.metaAI();
	}
}

class WhatsappV2 extends WhatsappV1 {
	public void status() {
		System.out.println("My Status");
	}
}

class WhatsappV3 extends WhatsappV2 {
	public void metaAI() {
		System.out.println("This is Meta");
	}
}
package objectOrientedProgramming.abstraction.interfaceKeyword.example3;

public class Person {
	private Transport transport;
	
	public void print() {
		transport.time();
		transport.distance();
		transport.crowded();
		transport.comfort();
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
}

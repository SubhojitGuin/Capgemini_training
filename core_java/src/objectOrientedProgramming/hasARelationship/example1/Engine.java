package objectOrientedProgramming.hasARelationship.example1;

public class Engine {
	private int cc;
	private String fuelType;
	
	public Engine() {
		
	}
	
	public Engine(int cc, String fuelType) {
		this.cc = cc;
		this.fuelType = fuelType;
	}
	
	public int getCc() {
		return cc;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}

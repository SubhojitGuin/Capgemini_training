package objectOrientedProgramming.abstraction.abstractKeyword;

public abstract class Bank {
	
	public abstract double getInterestRate();

	public static void main(String[] args) {
		Bank hdfc = new HDFC();
		System.out.println("HDFC has interest = " + hdfc.getInterestRate());
		
		Bank sbi = new SBI();
		System.out.println("SBI has interest = " + sbi.getInterestRate());
	}

}

class SBI extends Bank {

	@Override
	public double getInterestRate() {
		return 5.7;
	}
	
}

class HDFC extends Bank {

	@Override
	public double getInterestRate() {
		return 7.5;
	}
	
}
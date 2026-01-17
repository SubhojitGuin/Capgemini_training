package objectOrientedProgramming.abstraction.abstractKeyword.loan;

public class Child2 extends Child {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.homeLoan();
		child2.goldLoan();
		child2.bike();
		
		System.out.println();
		Parent p = new Child2(); // Upcasting
		p.homeLoan();
		p.goldLoan();
//		p.bike(); CTE Not accessible using parent reference
		
		Child2 ch = (Child2) p; // Downcasting
		ch.bike(); // Can be accessible by downcasting
		
		System.out.println();
		Child c = new Child2();
		c.homeLoan();
		c.goldLoan();
//		c.bike(); CTE Not accessible using parent reference
	}

	@Override
	public void goldLoan() {
		System.out.println("Child2 paid Gold Loan");
	}
	
	public void bike() {
		System.out.println("BMW");
	}

}

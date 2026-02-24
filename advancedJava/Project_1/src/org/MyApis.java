package org;

public class MyApis {
	
	public int findTheLengthOfTheNumber(long number) {
//		return (int) (Math.log10(number) + 1);
		
		int length = 0;
		
		do {
			number /= 10;
			length++;
		} while (number > 0);
		
		return length;
	}
	
	public boolean checkValidEmail(String email) {
		String pattern = "^[\\d\\w\\.-]+@gmail.com$";
		return email.matches(pattern);
	}

}

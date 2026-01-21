package learnString.assignment;

public class WordWithMaximumVowel {
	
	public static void main(String[] args) {
		String s = "I love programming";
		
		String[] sArr = s.split(" ");
		
		String wordWithMaxVowel = null;
		int maxVowelCount = 0;
		
		for (String temp: sArr) {
			int vowelCount = getVowelCount(temp);
			if (wordWithMaxVowel == null || vowelCount > maxVowelCount) {
				maxVowelCount = vowelCount;
				wordWithMaxVowel = temp;
			}
		}
		
		System.out.println("The word with max vowel count is: " + wordWithMaxVowel);
	}

	private static int getVowelCount(String temp) {
		int count = 0;
		
		for (char c: temp.toCharArray()) {
			c = Character.toLowerCase(c);
			
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
				count++;
		}
		
		return count;
	}

}

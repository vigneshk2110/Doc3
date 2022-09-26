package Docu3;

public class segmentedWords {

	public static void main(String[] args) {
		String [] s =  { "i", "like", "sam",
				"sung", "samsung", "mobile",
				"ice","cream", "icecream",
				"man", "go", "mango" };
		
		String s1 = "ilike";
		
		isSegmented(s1, s);
	}

	private static void isSegmented(String s1, String[] s) {
		int startIndex = 0;
		int endIndex = 0;
		for(int i = 0 ; i<s1.length(); i++) {
			for(int j = 0; j<s.length; j++) {
				word(startIndex, endIndex, s1);
			}
		}
		
	}

	private static void word(int startIndex, int endIndex, String s1) {
		String s = "";
		
		while(startIndex<=endIndex) {
			s = s + s1.charAt(startIndex);
			startIndex++;
		}
		
	}
}

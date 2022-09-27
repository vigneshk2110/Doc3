package Docu3;

public class segmentedWords {

	public static void main(String[] args) {
		String [] dictionary =  { "i", "like", "sam",
				"sung", "samsung", "mobile",
				"ice","cream", "icecream",
				"man", "go", "mango" };
		
		String s1 = "ilike";
		
		isSegmented(s1, dictionary);
	}

	private static void isSegmented(String s1, String[] s) {
		int startIndex = 0;
		int endIndex = 0;
		
		String str ="";
		
		
		
		for(int i = 0 ; i<s1.length(); i++) {
			
			String word = word(startIndex, endIndex, s1);
			for(int j = 0; j<s.length; j++) {
				if(word.equals(s[i])) {
					str = str+" "+word;
					startIndex = endIndex +1;
					if(s1.charAt(startIndex)!=s[i+1].charAt(0)) {
						System.out.println(false);
					}
					else {
						endIndex = endIndex +1;
						word = word(startIndex, endIndex, s1);
					}
				}
				else {
					endIndex++;
				}
			}
		}
	}

	private static String word(int startIndex, int endIndex, String s1) {
		String s = "";
		
		while(startIndex<=endIndex) {
			s = s + s1.charAt(startIndex);
			startIndex++;
		}
		System.out.println(s);
		return s;
	}
}

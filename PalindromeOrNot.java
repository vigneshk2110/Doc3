package Docu3;

import java.util.*;

public class PalindromeOrNot {

	public static void main(String[] args) {
		//String s = "RACE CAR" ;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String	s1 = scan.nextLine();
		boolean result = isPalindrome(s1);
		System.out.println(result);


	}

	private static boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int startIndex = 0;
		int endIndex = s.length()-1 ;

		while(startIndex<endIndex) {
			while(s.charAt(startIndex) < 'a' || s.charAt(startIndex) > 'z') {
				startIndex++;
			}
			while(s.charAt(endIndex) < 'a' || s.charAt(endIndex) > 'z' ) {
				endIndex--;
			}
			if(s.charAt(startIndex) != s.charAt(endIndex)) {
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}
}

package Docu3;

public class PairsWithSumX {

	public static void main(String[] args) {
		int [] input = {1, 2, 4, 3, 5, 6};
		pairSumX(input, 6);
	}

	private static void pairSumX(int[] input, int sum) {
		
		for(int i = 0; i<input.length; i++) {
			for(int j = i; j<input.length; j++) {
				if(input[i] + input[j] == sum &&  j!= i ) {
					System.out.println(input[i] + "," + input[j]);
				}
			}
		}
	}

}

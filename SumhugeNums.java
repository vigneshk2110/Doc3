package Docu3;

import java.util.*;

public class SumhugeNums {

	public static void main(String[] args) {
		int [] num1 = {9,2,8,1,3,5,6,7,3,1,1,6};
		int [] num2 = {7,8,4,6,2,1,9,9,7};

		int []result =  sumHugeNums(num1, num2);

		for (int j = result.length-1; j>=0 ; j-- ) {
			System.out.print(result[j] + " ");
		}
	}

	private static int [] sumHugeNums(int[] num1, int[] num2){
		int n1 = num1.length-1;
		int n2 = num2.length-1;
		
		int size;
		if((Math.abs(n1-n2))<=1 && ((num1[0] + num2[0]) > 9)  ) {
			size = Math.max((n1+1), (n2+1)) +1 ;
		}
		else {
			size = Math.max((n2+1), (n1+1));
		}

		int []sumArray = new int[size];
		int carry = 0;
		int i = 0;

		while(n1 >= 0 || n2 >= 0 && i < sumArray.length-1) {
			int digit = 0;
			if(n1 >= 0) {
				digit = digit + num1[n1]%10;
				n1--;
			}
			
			if(n2 >= 0) {
				digit =digit +  num2[n2]%10;
				n2--;
			}
			int unitDigit = (digit + carry) %10;
			sumArray[i++] = unitDigit;
			carry = ( digit + carry) / 10;
			
		}
		if (carry!=0) {
			sumArray[i] = carry;
		}
		
		return sumArray;
	}
}

package problems;

public class SumPairs {

	public static void printPair(int arr[], int k) {
		int len = arr.length;
		int left = 0;
		int right = len - 1;

		//Traverse an array
		for (int i = 0; i < len; i++) {

			//If sum is find then print them
			if (arr[left] + arr[right] == k) {
				System.out.println("pair - (" + arr[left] + "," + arr[right] + ")");
				left++;
				right--;

			} else if ((arr[left] + arr[right]) < k) {
				left++;
			} else {
				right--;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		printPair(arr, 8);
	}

}

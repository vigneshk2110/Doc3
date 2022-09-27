package Docu3;

public class OccurenceCount {

	public static void main(String[] args) {
		int [] arr1 = {2, 3, 2, 6, 1, 6, 2};
		occurenceNum(arr1);
		System.out.println("------------");
		int [] arr = {1, 3, 4, 2, 3, 2, 6, 1, 6, 2, -10, -35,-35, 47, 47};
		occurenceNum(arr);
	}

	private static void occurenceNum(int[] arr) {

		for(int i = 0; i<arr.length; i++) {
			int min = arr[0];
			for(int l = 0; l<arr.length; l++) {
				if(arr[l] != Integer.MAX_VALUE ) {
					if( arr[l]<min) {
						min = arr[l];
					}
				}
			}
			int count = 0;
			for(int j = 0; j<arr.length; j++) {
				if(arr[j] == min) {
					count++;
				}
			}
			if(count != 0 && min != Integer.MAX_VALUE ) {
				System.out.println( min + "--->" + (count));
			}

			for(int j = 0; j<arr.length; j++) {
				if(arr[j] == min) {
					arr[j] = Integer.MAX_VALUE;
				}
			}
		}
	}
}
package binarySearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 ,80,90};
		int start = 0;
		int end = arr.length - 1;
		boolean found = false;
		int target = 50;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (arr[middle] == target) {
				System.out.print("Element found at " + middle);
				found = true;
				break;
			} else if (target > arr[middle]) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		if (!found) {
			System.out.print("element not found");
		}
	}

}

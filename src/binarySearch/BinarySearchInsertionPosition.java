package binarySearch;

public class BinarySearchInsertionPosition {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, };
		int target = 35;
		int result = searchposition(arr, target);
		System.out.print("Target position is " +result);
	}

	static int searchposition(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int middle = (start + end) / 2;
			if (arr[middle] < target) {
				start = middle + 1;

			} else {
				end = middle - 1;
			}
		}
		return start;

	}
}

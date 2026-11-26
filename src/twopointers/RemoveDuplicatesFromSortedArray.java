package twopointers;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 5, 5, 8 };

		int slow = 0;

		for (int fast = 1; fast < arr.length; fast++) {

			if (arr[slow] != arr[fast]) {
				slow++;
				arr[slow] = arr[fast];
			}
		}
		int uniqueCount = slow + 1;

		for (int i = 0; i < uniqueCount; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

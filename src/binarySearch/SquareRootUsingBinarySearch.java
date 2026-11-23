package binarySearch;

public class SquareRootUsingBinarySearch {
	public static void main(String[] args) {

		int start = 1;
		int end = 100;
		int number = 50;
		int answer = -1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if ((long) middle * middle == number) {
				answer = middle;
				System.out.println("Square root: " + answer);
				break;
			} else if ((long) middle * middle < number) {
				answer = middle;
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		System.out.print(answer);
	}
}
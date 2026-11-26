package twopointers;

public class SquaresOfSortedArray {
	  public static void main(String[] args) {
	        int[] arr = {-7, -3, 2, 4, 8};
	        int[] result = new int[arr.length];
	        int left = 0;
	        int right = arr.length-1;
	        int position = arr.length - 1;
	        while (left <= right) {

	        int leftSquare = arr[left] * arr[left];
	        int rightSquare = arr[right] * arr[right];

	    if (leftSquare > rightSquare) {
	        result[position]=leftSquare;
	        left++;

	    } else {

	        result[position]=rightSquare;
	        right--;

	    }

	    position--;
	}
	        for(int i =0;i<result.length;i++){
	            System.out.print(result[i] + " ");
	        }
	    }

}

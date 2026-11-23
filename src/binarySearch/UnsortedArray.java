package binarySearch;

public class UnsortedArray {
	  public static void main(String[] args) {

	        int[] arr = {40, 50, 60, 70, 10, 20, 30};

	        int start = 0;
	        int end = arr.length - 1;
	        boolean found = false;
	        int target = 20;

	        while (start <= end) {

	            int middle = start + (end - start) / 2;

	            if (arr[middle] == target) {

	                System.out.println("Element found at " + middle);
	                found = true;
	                break;

	            } else if (arr[start] <= arr[middle]) {

	                if (target >= arr[start] && target < arr[middle]) {
	                    end = middle - 1;
	                } else {
	                    start = middle + 1;
	                }

	            } else {

	                if (target > arr[middle] && target <= arr[end]) {
	                    start = middle + 1;
	                } else {
	                    end = middle - 1;
	                }
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found");
	        }
	    }
}

package binarySearch;

public class MinimumInRotatedArray {
	 public static void main(String[] args) {

	        int[] arr = {40, 50, 60, 70, 10, 20, 30};

	        int start = 0;
	        int end = arr.length - 1;

	        while (start <end) {

	            int middle =  (start+end)/ 2;

	             if (arr[middle] > arr[end]) {
                     start = middle + 1;
              }
	                 else {
	                     end = middle;
	                }
}
                     System.out.print("minimum element is : " + arr[start]);

}
}

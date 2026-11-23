package binarySearch;

public class peakElement {
	 public static void main(String[] args) {
		 int[] arr = {1, 3, 5, 4, 2};
		 int start =0;
		 int end = arr.length-1;
		 while(start<end) {
			 int middle = (start+end)/2;
			 if(arr[middle]>arr[middle+1] ) {
				 end=middle;
			 }else {
				 start = middle+1;
			 }
		 }
		 System.out.print("Peak element is :" + arr[start]);
	 }

}

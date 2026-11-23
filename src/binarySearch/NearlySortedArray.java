package binarySearch;

public class NearlySortedArray {
	 public static void main(String[] args) {

	        int[] arr = {10, 30, 20, 50, 40, 60, 70, 90, 80, 100, 110};
	        int start = 0;
	        int end = arr.length - 1;
	        int target = 30;
         while(start<=end){
             int middle = (start+end)/2;
             if(arr[middle]==target){
                 System.out.print("Element found at :" + middle);
                 break;
             } if(start<middle && arr[middle-1]==target){
                 System.out.print("Element found at :" + (middle-1));
                 break;
             }
             
             if(middle<end && arr[middle +1]==target){
                   System.out.print("Element found at :" + (middle+1));
                 break;
             }
       if (target < arr[middle]) {
     end = middle - 2;
 } else {
     start = middle + 2;
 }
             }
 }

}

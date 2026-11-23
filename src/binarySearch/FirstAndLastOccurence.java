package binarySearch;

public class FirstAndLastOccurence {
	 public static void main(String[] args) {
			int[] arr = { 10, 20, 20, 20, 20, 20, 70 ,80,90};
			int target = 20;
	       int result = firstoccurence(arr,target);
	       int result1 = lastoccurence(arr,target);
	       int totaloccurence = result1-result+1;
	       if(result!=-1) {
	    	   System.out.println("total occurence : " + totaloccurence);
	       }
	       if(result !=-1){
	           System.out.println("first occurence at : " + result);
	       }else{
	           System.out.println("element not found");
	       }
	        if(result1 !=-1){
	           System.out.println("last occurence at : " + result1);
	       }else{
	           System.out.println("element not found");
	       }
	       
		}
	    static int firstoccurence(int arr[],int target){
	        int start = 0;
			int end = arr.length - 1;
	        int answer = -1;
			
	    while (start <= end) {
				int middle = (start + end) / 2;
				if (arr[middle] == target) {
					answer = middle;
	                end = middle-1;
				} else if (target > arr[middle]) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
	    }
	        return answer;
			}
	    static int lastoccurence(int arr[],int target){
	        int start = 0;
			int end = arr.length - 1;
	        int answer1 = -1;
			
	    while (start <= end) {
				int middle = (start + end) / 2;
				if (arr[middle] == target) {
					answer1 = middle;
	                start = middle+1;
				} else if (target > arr[middle]) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
	    }
	        return answer1;
			}

}

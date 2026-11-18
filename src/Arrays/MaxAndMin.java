package Arrays;

import java.util.ArrayList;

public class MaxAndMin {
	public static void main(String[] args) {
		int[] arr = {10, 52, 35, 49, 51};
		int max = arr[0];
		int min = arr[0];
		for(int i = 1 ;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

        
	}

}

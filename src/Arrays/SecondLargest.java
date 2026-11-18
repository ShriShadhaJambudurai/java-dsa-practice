package Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {10, 52, 35, 49, 51};
		int max = arr[0];
		int Secondlargest =arr[0];
		for(int i = 1;i<=arr.length-1;i++) {
			if(arr[i]>max){		
				Secondlargest = max;
				max = arr[i];
				}else if(arr[i]>Secondlargest&&arr[i]<max) {
					Secondlargest = arr[i];
				}
			}
			
		System.out.println("Second Largest : " + Secondlargest);
		
		
			
	}

}

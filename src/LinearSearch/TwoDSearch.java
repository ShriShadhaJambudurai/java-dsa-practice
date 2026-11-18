package LinearSearch;

public class TwoDSearch {
	public static void main(String[] args) {
		int[][] arr = {
				{24, 41, 43},
				{87, 64,93 ,33,88},
				{78,23,54,98}
		};
		int target = 33;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					System.out.println("exists");
					System.out.print(i + ",");
					System.out.print(j);
				}
			}
				
		}
	}

}

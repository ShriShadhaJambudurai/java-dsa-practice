package numberproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class GcdAndLcm {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int num1 = obj.nextInt();
		System.out.print("Enter number 2 : ");
		int num2 = obj.nextInt();
		int gcd = 0;
		long lcm;
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		for(int i = 1;i<=num1;i++) {
			if(num1%i==0) {
				arr.add(i);
			}
		}
		for(int j =1 ; j<=num2;j++) {
			if(num2%j==0) {
				arr1.add(j);
			}
		}
		for(int k = 0;k<arr.size();k++) {
			for(int l=0;l<arr1.size();l++) {
				if(arr.get(k).equals(arr1.get(l))) {
					if(arr.get(k)>gcd ) {
						gcd=arr.get(k);
					}
				}
			}
		}
		lcm = ((long)num1 * num2)/ gcd;
		System.out.println("gcd is " + gcd);
		System.out.print("lcm is " + lcm );
		
	}
	

}

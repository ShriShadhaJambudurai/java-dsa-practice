package numberproblems;

import java.util.Scanner;

public class Sum_Natural_Numbers {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		int n = 0;
		for(int i = 1;i<=num;i++) {
			n = n+i;
		}
		System.out.print(n);
	}

}

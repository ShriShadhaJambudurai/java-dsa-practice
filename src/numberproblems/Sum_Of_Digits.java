package numberproblems;

import java.util.Scanner;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		int sum =0;
		while(num!=0) {
			int lastdigit = num%10;
			sum = sum +lastdigit;
			num = num /10;
		}
		System.out.print(sum);
	}

}

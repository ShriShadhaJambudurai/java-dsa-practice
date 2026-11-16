package numberproblems;

import java.util.Scanner;

public class Count_Digits {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		int count = 0;
		while(num!=0) {
			
			num = num/10;
			count = count +1;
		}
		System.out.print(count);
	}

}

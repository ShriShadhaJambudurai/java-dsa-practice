package numberproblems;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		if(num % 2 ==0) {
			System.out.print(num + " is even.");
		}else {
			System.out.print(num + "is odd.");
		}
	}

}

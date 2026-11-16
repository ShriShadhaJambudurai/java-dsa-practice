package numberproblems;

import java.util.Scanner;

public class Positive_Negative {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		double num = obj.nextDouble();
		if(num>0) {
			System.out.print("The number is positive");
		}else if(num<0) {
			System.out.println("The number is negative");
		}else {
			System.out.print("The number is 0");
		}
	}

}

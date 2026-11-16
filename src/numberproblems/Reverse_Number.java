package numberproblems;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		int reversed = 0;
		while(num!=0) {
			int lastdigit = num%10;//extracts last digit
			reversed = reversed * 10 +lastdigit;//we are multiplying by 0 to make the existing value to become 0 so that while printing the latest last digit will get printed
			num = num/10;//this stores the remaining value excluding the last number
		}
		System.out.print(reversed);
	}

}

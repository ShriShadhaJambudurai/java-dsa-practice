package numberproblems;

import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		
		for(int i = 2; i <=num;i++) {
			boolean status = true;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					status = false;
					break;
				}
				
				}
			if(status) {
				System.out.print(i);
				
			}
		
			
		}
		
      
       }
	

}

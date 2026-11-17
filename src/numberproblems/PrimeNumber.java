package numberproblems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = obj.nextInt();
		boolean status = true;
	    if(num<=1) {
	    	status = false;
	    }else {
	    	for(int i =2;i<num;i++) {
	    		if(num%i==0) {
	    			status=false;
	    			break;
	    		}
	    	}
	    }
	    if(status) {
	    	System.out.print("Number is prime");
	    }else {
	    	System.out.println("Number is not prime");
	    }
	    
	}

}

package twopointers;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "A";
		int left = 0;
		int right = str.length() - 1;
		boolean status = true;
		while(left<right) {
			char a = str.charAt(left);
			char b = str.charAt(right);
			if(a!=b) {
				status=false;
			}
			right--;
			left++;
		}
		if(!status) {
			System.out.print("Not a palindrome");
		}else {
			System.out.println("palindrome");
		}
	}

}
